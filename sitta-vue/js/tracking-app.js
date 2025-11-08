const { createApp } = Vue;

createApp({
    watch: {
        'modal.paket'(newVal) {
            if(paket){
                this.modal.totalHarga = newVal.harga;
            } else {
                this.modal.totalHarga = 0;
            }
        }
    },
    methods: {
        openDashboard() {
            window.location.href = 'index.html';
        },
        createNewDo() {
            const lastTracking = Object.keys(dataBahanAjar.tracking)[Object.keys(dataBahanAjar.tracking).length - 1];
            const lastDoNumber = parseInt(lastTracking.split('-')[1]);
            const newDoNumber = lastDoNumber + 1;
            const nomorDeliveryOrder = `DO${new Date().getFullYear()}-${String(newDoNumber).padStart(4, '0')}`;

            this.modal = {
                show: true,
                nomorDeliveryOrder: nomorDeliveryOrder,
                nim: '',
                nama: '',
                ekspedisi: '',
                paket: '',
                tanggalKirim: '',
                totalHarga: 0,
            };
        },
        closeModal() {
            this.modal.show = false;
        },
        saveModal() {
            if(!this.modal.nim || !this.modal.nama || !this.modal.ekspedisi || !this.modal.paket || !this.modal.tanggalKirim){
                alert("Mohon lengkapi semua data sebelum menyimpan.");
                return;
            }

            const currentDate = new Date()
            this.tracking[this.modal.nomorDeliveryOrder] = {
                nim: this.modal.nim,
                nama: this.modal.nama,
                status: "Diproses",
                ekspedisi: this.modal.ekspedisi.kode,
                tanggalKirim: this.modal.tanggalKirim,
                paket: this.modal.paket.kode,
                totalHarga: this.modal.totalHarga,
                perjalanan: [
                    {waktu: `${currentDate.toISOString().slice(0,10)} ${currentDate.toLocaleTimeString([], {
                        hour12: false
                    })}`, keterangan: "Pesanan diproses di UPBJJ"}
                ]
            };

            this.closeModal();
        },
        searchDo(event) {
            event.preventDefault();

            const doData = dataBahanAjar.tracking[this.nomorDeliveryOrder];
            if(!doData){
                alert("Nomor DO tidak ditemukan.");
                return;
            }

            this.table = {
                show: true,
                nama: doData.nama,
                nim: doData.nim,
                nomorDo: this.nomorDeliveryOrder,
                tanggalKirim: doData.tanggalKirim,
                ekspedisi: doData.ekspedisi,
                status: doData.status,
                perjalanan: doData.perjalanan
            }
        }
    },
    computed: {
    },
    data() {
        return {
            nomorDeliveryOrder: '',
            modal: {
                show: false,
                nomorDeliveryOrder: '',
                nim: '',
                nama: '',
                ekspedisi: '',
                paket: '',
                tanggalKirim: '',
                totalHarga: 0,
            },
            table: {
                show: false,
                nama: '',
                nomorDo: '',
                tanggalKirim: '',
                ekspedisi: '',
                status: '',
                perjalanan: []
            },
            ...dataBahanAjar
        }
    }
}).mount("#app");
