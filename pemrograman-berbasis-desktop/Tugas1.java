import java.util.Scanner;

public class Tugas1 {

    enum Kategori {
        MAKANAN,
        MINUMAN,
    }

    public static class Menu {

        private String nama;
        private int harga;
        private Kategori kategori;
        private int bonus;
        private int jumlah;

        public Menu(String nama, int harga, Kategori kategori) {
            this.nama = nama;
            this.harga = harga;
            this.kategori = kategori;
        }

        public Menu(String nama, int harga, Kategori kategori, int bonus) {
            this.nama = nama;
            this.harga = harga;
            this.kategori = kategori;
            this.bonus = bonus;
        }

        public String getNama() {
            return nama;
        }

        public int getHarga() {
            return harga;
        }

        public Kategori getKategori() {
            return kategori;
        }

        public int getBonus() {
            return bonus;
        }

        public int getJumlah() {
            return jumlah;
        }

        public void setJumlah(int jumlah) {
            this.jumlah = jumlah;
        }

        public void cetakMenu() {
            System.out.println(
                "Nama: " + this.getNama() + " | Harga: Rp" + this.getHarga()
            );
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setHarga(int harga) {
            this.harga = harga;
        }

        public void setKategori(Kategori kategori) {
            this.kategori = kategori;
        }

        public void setBonus(int bonus) {
            this.bonus = bonus;
        }
    }

    public static void main(String[] args) {
        Menu[] menuList = {
            new Menu("Dimsum Mentai", 15000, Kategori.MAKANAN),
            new Menu("Sate Taichan", 20000, Kategori.MAKANAN),
            new Menu("Dendeng", 25000, Kategori.MAKANAN),
            new Menu("Rendang", 30000, Kategori.MAKANAN),
            new Menu("Makaroni", 10000, Kategori.MAKANAN),
            new Menu("Bihun Rebus", 12000, Kategori.MAKANAN),
            new Menu("Kwetiau Goreng", 15000, Kategori.MAKANAN),
            new Menu("Matcha", 20000, Kategori.MINUMAN),
            new Menu("Teh Manis", 5000, Kategori.MINUMAN),
            new Menu("Kopi", 10000, Kategori.MINUMAN),
            new Menu("Susu Jahe", 10000, Kategori.MINUMAN),
            new Menu("Es Jeruk", 10000, Kategori.MINUMAN),
        };

        System.out.println("===========================");
        System.out.println("Selamat datang di RM Sabila");
        System.out.println("===========================");

        System.out.println("Berikut untuk daftar menu yang tersedia");
        System.out.println("-- Makanan --");
        for (Menu menu : menuList) {
            if (menu.getKategori() == Kategori.MAKANAN) menu.cetakMenu();
        }
        System.out.println("-- Minuman --");
        for (Menu menu : menuList) {
            if (menu.getKategori() == Kategori.MINUMAN) menu.cetakMenu();
        }

        System.out.println("===========================");
        System.out.println("Silahkan masukan menu dengan format");
        System.out.println("Nama menu = jumlah pesanan, contoh:");
        System.out.println("Dimsum Mentai = 2");
        System.out.println("Kosongkan jika tidak ada pesanan lagi");
        System.out.println("===========================");

        Menu[] listPesanan = new Menu[4];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listPesanan.length; i++) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(" = ");
            if (parts.length != 2) {
                System.out.println(
                    "Format tidak valid, gunakan: Nama Makanan = Jumlah"
                );
                i--;
                continue;
            }

            String namaPesanan = parts[0].trim();
            int jumlah = Integer.parseInt(parts[1].trim());

            boolean ketemu = false;
            for (Menu m : menuList) {
                if (m.getNama().equalsIgnoreCase(namaPesanan)) {
                    listPesanan[i] = new Menu(
                        m.getNama(),
                        m.getHarga(),
                        m.getKategori()
                    );
                    listPesanan[i].setJumlah(jumlah);
                    System.out.println(
                        "Ditambahkan: " + m.getNama() + " x" + jumlah
                    );
                    ketemu = true;
                    break;
                }
            }
            if (!ketemu) {
                System.out.println(
                    "Menu \"" + namaPesanan + "\" tidak ditemukan!"
                );
                i--;
            }
        }
        scanner.close();

        int subtotal = 0;
        for (Menu p : listPesanan) {
            if (p == null) continue;
            subtotal += p.getJumlah() * p.getHarga();
        }

        if (subtotal > 50000) {
            for (Menu p : listPesanan) {
                if (p == null) continue;
                if (p.getKategori() == Kategori.MINUMAN) {
                    p.setBonus(p.getJumlah());
                    break;
                }
            }
        }

        System.out.println("===========================");
        System.out.println("Ringkasan Pesanan:");
        System.out.println("===========================");
        for (Menu p : listPesanan) {
            if (p == null) continue;
            System.out.println(
                p.getNama() +
                    " x" +
                    p.getJumlah() +
                    " = Rp" +
                    (p.getJumlah() * p.getHarga())
            );
            if (p.getBonus() > 0) {
                System.out.println(
                    "  + Gratis " + p.getNama() + " x" + p.getBonus()
                );
            }
        }

        int diskon = subtotal > 100000 ? (subtotal * 10) / 100 : 0;
        int setelahDiskon = subtotal - diskon;
        int pajak = (setelahDiskon * 10) / 100;
        int biayaPelayanan = 20000;
        int grandTotal = setelahDiskon + pajak + biayaPelayanan;

        System.out.println("===========================");
        System.out.println("Subtotal       : Rp" + subtotal);
        if (diskon > 0) {
            System.out.println("Diskon 10%     : -Rp" + diskon);
            System.out.println("Setelah Diskon : Rp" + setelahDiskon);
        }
        System.out.println("PPN 10%        : Rp" + pajak);
        System.out.println("Biaya Pelayanan: Rp" + biayaPelayanan);
        System.out.println("===========================");
        System.out.println("Grand Total    : Rp" + grandTotal);
        System.out.println("===========================");
    }
}
