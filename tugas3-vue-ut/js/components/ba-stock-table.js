Vue.component('ba-stock-table', {
    props: ['stok', 'open-modal', 'upbjj-list', 'kategori-list', 'create-new-bahan-ajar', 'open-popup'],
    template: '#tpl-stock',
    watch: {
        status(newVal) {
            this.$root.modal.status = newVal;
        }
    },
    methods: {
        openDashboard() {
            window.location.href = 'index.html';
        },
        clearFilters() {
            this.selectedUpbjj = '';
            this.selectedKategori = '';
            this.selectedStatus = '';
        },
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
                stok = stok.filter(item => item.upbjj === this.selectedUpbjj);
            }

            if(this.selectedKategori){
                stok = stok.filter(item => item.kategori === this.selectedKategori);
            }

            if(this.selectedStatus){
                stok = stok.filter(item => {
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
        },
        status(){
            return this.$root.modal.qty === 0 ? "Kosong" : this.$root.modal.qty < this.$root.modal.safety ? "Menipis" : "Aman";
        }
    },
    data() {
        return {
            selectedUpbjj: '',
            selectedKategori: '',
            selectedStatus: '',
            sortBy: '',
            statusList: [
                "Aman",
                "Menipis",
                "Kosong"
            ],
        }
    }
});