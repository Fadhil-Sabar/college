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
            ...dataBahanAjar
        }
    }
}).mount("#app");
