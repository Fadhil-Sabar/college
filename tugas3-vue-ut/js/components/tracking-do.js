Vue.component('tracking-do', {
    props: ['tracking', 'data-bahan-ajar', 'create-new-do'],
    template: '#tpl-tracking-do',
    methods: {
        searchDo(event) {
            event.preventDefault();

            const doData = Object.values(this.tracking.find(item => item[this.searchTracking] || Object.values(item)[0].nim === this.searchTracking))[0];
            if(!doData){
                alert("Nomor DO tidak ditemukan.");
                return;
            }

            this.table = {
                show: true,
                nama: doData.nama,
                nim: doData.nim,
                nomorDo: this.searchTracking,
                tanggalKirim: doData.tanggalKirim,
                ekspedisi: doData.ekspedisi,
                status: doData.status,
                perjalanan: doData.perjalanan
            }
        },
        handleEscTracking(){
          this.searchTracking = ''
        }
    },
    computed: {
    },
    data(){
        return {
            searchTracking: '',
            table: {
                show: false,
                nama: '',
                nomorDo: '',
                tanggalKirim: '',
                ekspedisi: '',
                status: '',
                perjalanan: []
            },
        }
    }
});