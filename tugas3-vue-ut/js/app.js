const listTemplate = [
  { name: "tpl-modal-bahan-ajar", path: "templates/tpl-modal-bahan-ajar.html" },
  { name: "tpl-stock", path: "templates/tpl-stock.html" },
  { name: "tpl-popup-confirmation", path: "templates/tpl-popup-confirmation.html" },
  { name: "tpl-tracking-do", path: "templates/tpl-tracking-do.html" },
]

Promise.all(
  listTemplate.map(template => {
    return fetch(template.path)
      .then(response => response.text())
      .then(data => {
        document.getElementById(template.name).innerHTML = data;
      });
  })
).then(() => {
  var app = new Vue({
    el: "#app",
    data: {
      tab: "",
      dataBahanAjar: {},
      showModal: false,
      showWrapper: false,
      showPopup: false,
      popupMessage: "",
      isCreate: false,
      isEdit: false,
      modal: {
        kodeNamaMatkul: "",
        kategori: "",
        upbjj: "",
        lokasiRak: "",
        harga: 0,
        qty: 0,
        safety: 0,
        status: "",
        catatanHTML: "",
      },
      popup: {
        id: null,
      },
      modalDo: {
        show: false,
        nomorDeliveryOrder: "",
        nim: "",
        nama: "",
        ekspedisi: "",
        paket: "",
        tanggalKirim: "",
        totalHarga: 0,
      },
    },
    mounted() {
      apiService.getBahanAjar().then((data) => {
        this.dataBahanAjar = data;
      });
    },
    watch: {
      "modalDo.paket"(newVal) {
        if (newVal) {
          this.modalDo.totalHarga = newVal.harga;
        } else {
          this.modalDo.totalHarga = 0;
        }
      },
    },
    methods: {
      openStok() {
        window.location.href = "stok.html";
      },
      openTracking() {
        window.location.href = "tracking.html";
      },
      openModal(bahanAjar, isEdit) {
        this.modal.kodeNamaMatkul = `${bahanAjar.kode} / ${bahanAjar.judul}`;
        this.modal.kategori = bahanAjar.kategori;
        this.modal.upbjj = bahanAjar.upbjj;
        this.modal.lokasiRak = bahanAjar.lokasiRak;
        this.modal.harga = bahanAjar.harga;
        this.modal.qty = bahanAjar.qty;
        this.modal.safety = bahanAjar.safety;
        this.modal.catatanHTML = bahanAjar.catatanHTML;
        this.modal.status =
          bahanAjar.qty === 0
            ? "Kosong"
            : bahanAjar.qty < bahanAjar.safety
            ? "Menipis"
            : "Aman";

        this.showModal = true;
        this.showWrapper = true;

        if (isEdit) {
          this.isEdit = true;
        }
      },
      closeModal() {
        this.showModal = false;
        this.showWrapper = false;
        this.modalDo.show = false;
        this.isCreate = false;
        this.isEdit = false;
      },
      createNewBahanAjar() {
        this.modal = {
          kodeNamaMatkul: "",
          kategori: "",
          upbjj: "",
          lokasiRak: "",
          harga: 0,
          qty: 0,
          safety: 0,
          status: "",
          catatanHTML: "",
        };
        this.showModal = true;
        this.showWrapper = true;
        this.isCreate = true;
      },
      saveModal() {
        if (
          !/(\/)/.test(this.modal.kodeNamaMatkul) ||
          !this.modal.kodeNamaMatkul.split(" / ")[1]?.length
        ) {
          alert(
            'Format Kode Mata Kuliah / Nama Mata Kuliah tidak valid. Gunakan format "KODE / NAMA MATA KULIAH".'
          );
          return;
        }

        if (
          !this.modal.kategori ||
          !this.modal.upbjj ||
          !this.modal.lokasiRak ||
          this.modal.harga < 0 ||
          this.modal.qty < 0 ||
          this.modal.safety < 0
        ) {
          alert("Semua field harus diisi dengan benar.");
          return;
        }

        const [kode] = this.modal.kodeNamaMatkul.split(" / ");
        if (this.isCreate) {
          this.dataBahanAjar.stok.push({
            kode: kode,
            judul: this.modal.kodeNamaMatkul.split(" / ")[1],
            kategori: this.modal.kategori,
            upbjj: this.modal.upbjj,
            lokasiRak: this.modal.lokasiRak,
            harga: this.modal.harga,
            qty: this.modal.qty,
            safety: this.modal.safety,
            catatanHTML: this.modal.catatanHTML,
          });
          this.isCreate = false;
        }

        if (this.isEdit) {
          const bahanAjar = this.dataBahanAjar.stok.find(
            (item) => item.kode === kode
          );
          bahanAjar.judul = this.modal.kodeNamaMatkul.split(" / ")[1];
          bahanAjar.kategori = this.modal.kategori;
          bahanAjar.upbjj = this.modal.upbjj;
          bahanAjar.lokasiRak = this.modal.lokasiRak;
          bahanAjar.harga = this.modal.harga;
          bahanAjar.qty = this.modal.qty;
          bahanAjar.safety = this.modal.safety;
          bahanAjar.catatanHTML = this.modal.catatanHTML;
          this.isEdit = false;
        }

        this.closeModal();
      },

      openPopup(message, id) {
        this.popupMessage = message;
        this.popup.id = id;
        this.showWrapper = true;
        this.showPopup = true;
      },
      closePopup() {
        this.showPopup = false;
        this.showWrapper = false;
        this.popupMessage = "";
      },
      deleteBahanAjar() {
        const kodeToDelete = this.popup.id;
        this.dataBahanAjar.stok = this.dataBahanAjar.stok.filter(
          (item) => item.kode !== kodeToDelete
        );
        this.closePopup();
      },

      // DO
      createNewDo() {
        const lastTracking = Object.keys(
          this.dataBahanAjar.tracking[this.dataBahanAjar.tracking.length - 1]
        )[0];
        const lastDoNumber = parseInt(lastTracking.split("-")[1]);
        const newDoNumber = lastDoNumber + 1;
        const nomorDeliveryOrder = `DO${new Date().getFullYear()}-${String(
          newDoNumber
        ).padStart(4, "0")}`;
        this.showWrapper = true;

        this.modalDo = {
          show: true,
          nomorDeliveryOrder: nomorDeliveryOrder,
          nim: "",
          nama: "",
          ekspedisi: "",
          paket: "",
          tanggalKirim: new Date().toISOString().slice(0, 10),
          totalHarga: 0,
        };
      },
      saveModalDo() {
        if (
          !this.modalDo.nim ||
          !this.modalDo.nama ||
          !this.modalDo.ekspedisi ||
          !this.modalDo.paket ||
          !this.modalDo.tanggalKirim
        ) {
          alert("Mohon lengkapi semua data sebelum menyimpan.");
          return;
        }

        const currentDate = new Date();
        const newData = (this.modalDo.nomorDeliveryOrder = {
          nim: this.modalDo.nim,
          nama: this.modalDo.nama,
          status: "Diproses",
          ekspedisi: this.modalDo.ekspedisi.kode,
          tanggalKirim: this.modalDo.tanggalKirim,
          paket: this.modalDo.paket.kode,
          totalHarga: this.modalDo.totalHarga,
          perjalanan: [
            {
              waktu: `${currentDate
                .toISOString()
                .slice(0, 10)} ${currentDate.toLocaleTimeString([], {
                hour12: false,
              })}`,
              keterangan: "Pesanan diproses di UPBJJ",
            },
          ],
        });
        this.dataBahanAjar.tracking.push({
          [this.modalDo.nomorDeliveryOrder]: newData,
        });

        this.closeModal();
      },
    },
  });
});
