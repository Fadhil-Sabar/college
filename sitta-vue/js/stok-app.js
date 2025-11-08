const { createApp } = Vue;

createApp({
    methods: {
        openDashboard() {
            window.location.href = 'index.html';
        },
        openModal(bahanAjar) {
            this.modal.kodeNamaMatkul = `${bahanAjar.kode} / ${bahanAjar.judul}`;
            this.modal.kategori = bahanAjar.kategori;
            this.modal.upbjj = bahanAjar.upbjj;
            this.modal.lokasiRak = bahanAjar.lokasiRak;
            this.modal.harga = bahanAjar.harga;
            this.modal.qty = bahanAjar.qty;
            this.modal.safety = bahanAjar.safety;
            this.modal.catatanHTML = bahanAjar.catatanHTML;
            this.modal.status = bahanAjar.qty === 0 ? "Kosong" : bahanAjar.qty < bahanAjar.safety ? "Menipis" : "Aman";

            this.showModal = true;
        },
        closeModal() {
            this.stok.find(item => item.kode === this.modal.kodeNamaMatkul.split(' / ')[0]).qty = this.modal.qty;
            this.showModal = false;
        },
        clearFilters() {
            this.selectedUpbjj = '';
            this.selectedKategori = '';
            this.selectedStatus = '';
        }
    },
    computed: {
        filteredSortedStok() {
            let stok = this.stok;

            if(this.sortBy){
                stok = stok.sort((a, b) => {
                    if(this.sortBy === 'harga'){
                        return a.harga - b.harga;
                    }

                    if(this.sortBy === 'stok'){
                        return b.qty - a.qty;
                    }

                    if(this.sortBy === 'judul'){
                        return a.judul.localeCompare(b.judul);
                    }

                    return 0;
                })
            }

            if(this.selectedUpbjj){
                return stok.filter(item => item.upbjj === this.selectedUpbjj);
            }

            if(this.selectedKategori){
                return stok.filter(item => item.kategori === this.selectedKategori);
            }

            if(this.selectedStatus){
                return stok.filter(item => {
                    if(this.selectedStatus === "Aman"){
                        return item.qty >= item.safety;
                    }
                    if(this.selectedStatus === "Menipis"){
                        return item.qty > 0 && item.qty < item.safety;
                    }
                    if(this.selectedStatus === "Kosong"){
                        return item.qty === 0;
                    }
                    return false;
                });
            }

            return stok;
        }
    },
    data() {
        return {
            showModal: false,
            selectedUpbjj: '',
            selectedKategori: '',
            selectedStatus: '',
            sortBy: '',
            modal: {
                kodeNamaMatkul: "",
                kategori: "",
                upbjj: "",
                lokasiRak: "",
                harga: 0,
                qty: 0,
                safety: 0,
                status: "",
                catatanHTML: ""
            },
            statusList: [
                "Aman",
                "Menipis",
                "Kosong"
            ],
            upbjjList: [
                "Jakarta",
                "Surabaya",
                "Makassar",
                "Padang",
                "Denpasar"
            ],
            kategoriList: [
                "MK Wajib",
                "MK Pilihan",
                "Praktikum",
                "Problem-Based"
            ],
            pengirimanList: [
                {
                    kode: "REG",
                    nama: "Reguler (3-5 hari)"
                },
                {
                    kode: "EXP",
                    nama: "Ekspres (1-2 hari)"
                }
            ],
            paket: [
                {
                    kode: "PAKET-UT-001",
                    nama: "PAKET IPS Dasar",
                    isi: [
                        "EKMA4116",
                        "EKMA4115"
                    ],
                    harga: 120000
                },
                {
                    kode: "PAKET-UT-002",
                    nama: "PAKET IPA Dasar",
                    isi: [
                        "BIOL4201",
                        "FISIP4001"
                    ],
                    harga: 140000
                }
            ],
            stok: [
                {
                    kode: "EKMA4116",
                    judul: "Pengantar Manajemen",
                    kategori: "MK Wajib",
                    upbjj: "Jakarta",
                    lokasiRak: "R1-A3",
                    harga: 65000,
                    qty: 28,
                    safety: 20,
                    catatanHTML: "<em>Edisi 2024, cetak ulang</em>"
                },
                {
                    kode: "EKMA4115",
                    judul: "Pengantar Akuntansi",
                    kategori: "MK Wajib",
                    upbjj: "Jakarta",
                    lokasiRak: "R1-A4",
                    harga: 60000,
                    qty: 7,
                    safety: 15,
                    catatanHTML: "<strong>Cover baru</strong>"
                },
                {
                    kode: "BIOL4201",
                    judul: "Biologi Umum (Praktikum)",
                    kategori: "Praktikum",
                    upbjj: "Surabaya",
                    lokasiRak: "R3-B2",
                    harga: 80000,
                    qty: 12,
                    safety: 10,
                    catatanHTML: "Butuh <u>pendingin</u> untuk kit basah"
                },
                {
                    kode: "FISIP4001",
                    judul: "Dasar-Dasar Sosiologi",
                    kategori: "MK Pilihan",
                    upbjj: "Makassar",
                    lokasiRak: "R2-C1",
                    harga: 55000,
                    qty: 0,
                    safety: 8,
                    catatanHTML: "Stok <i>menipis</i>, prioritaskan reorder"
                }
            ],
            tracking: {
                "DO2025-0001": { // Key di dalam 'tracking' masih menggunakan petik karena mengandung hyphen '-'
                    nim: "123456789",
                    nama: "Rina Wulandari",
                    status: "Dalam Perjalanan",
                    ekspedisi: "JNE",
                    tanggalKirim: "2025-08-25",
                    paket: "PAKET-UT-001",
                    total: 120000,
                    perjalanan: [
                        {
                            waktu: "2025-08-25 10:12:20",
                            keterangan: "Penerimaan di Loket: TANGSEL"
                        },
                        {
                            waktu: "2025-08-25 14:07:56",
                            keterangan: "Tiba di Hub: JAKSEL"
                        },
                        {
                            waktu: "2025-08-26 08:44:01",
                            keterangan: "Diteruskan ke Kantor Tujuan"
                        }
                    ]
                }
            }
        }
    }
}).mount("#app");
