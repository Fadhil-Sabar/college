const apiService = {
    getBahanAjar: async function () {
        try {
            const response = await fetch('data/dataBahanAjar.json');
            if (!response.ok) {
                throw new Error('Gagal mengambil data bahan ajar');
            }
            const data = await response.json();
            return data;
        } catch (error) {
            console.error('Gagal mengambil bahan ajar:', error);
            throw error;
        }
    }
};