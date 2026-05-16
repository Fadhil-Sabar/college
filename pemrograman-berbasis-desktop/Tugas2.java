import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
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
                    "Nama: " + this.getNama() + " | Harga: Rp" + this.getHarga());
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

    static ArrayList<Menu> menuList = new ArrayList<>(Arrays.asList(
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
            new Menu("Es Jeruk", 10000, Kategori.MINUMAN)));

    static Scanner sc = new Scanner(System.in);

    public static void clearWithBlankLines() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("===========================");
        System.out.println("Selamat datang di RM Sabila");
        System.out.println("===========================");

        mainMenu();
    }

    public static void mainMenu() {
        while (true) {
            clearWithBlankLines();
            System.out.println("Silahkan pilih menu yang ingin diakses");
            System.out.println("1. Menu Pelanggan");
            System.out.println("2. Menu Pemilik");
            System.out.println("0. Keluar");
            String input = sc.nextLine();
            switch (input) {
                case "1" -> menuPelanggan();
                case "2" -> menuPemilik();
                case "0" -> {
                    return;
                }
                default -> System.out.println("Input tidak valid.");
            }
        }
    }

    public static void menuPelanggan() {
        while (true) {
            clearWithBlankLines();
            System.out.println("===========================");
            System.out.println("1. Lihat & Pesan Menu");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            String input = sc.nextLine().trim();
            switch (input) {
                case "1" -> prosesOrder();
                case "0" -> {
                    return;
                }
                default -> System.out.println("Input tidak valid.");
            }

        }
    }

    public static void prosesOrder() {

        clearWithBlankLines();
        System.out.println("===========================");
        System.out.println("Berikut untuk daftar menu yang tersedia");
        System.out.println("-- Makanan --");
        for (Menu menu : menuList) {
            if (menu.getKategori() == Kategori.MAKANAN)
                menu.cetakMenu();
        }
        System.out.println("-- Minuman --");
        for (Menu menu : menuList) {
            if (menu.getKategori() == Kategori.MINUMAN)
                menu.cetakMenu();
        }

        System.out.println("===========================");
        System.out.println("Silahkan masukan menu dengan format");
        System.out.println("Nama menu = jumlah pesanan, contoh:");
        System.out.println("Dimsum Mentai = 2");
        System.out.println("Ketika selesai jika tidak ada pesanan lagi");
        System.out.println("===========================");

        ArrayList<Menu> listPesanan = new ArrayList<Menu>();

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            String[] parts = input.split(" = ");
            if (parts.length != 2) {
                System.out.println(
                        "Format tidak valid, gunakan: Nama Makanan = Jumlah");
                continue;
            }

            String namaPesanan = parts[0].trim();
            int jumlah = Integer.parseInt(parts[1].trim());

            boolean ketemu = false;
            for (Menu m : menuList) {
                if (m.getNama().equalsIgnoreCase(namaPesanan)) {
                    Menu pesanan = new Menu(
                            m.getNama(),
                            m.getHarga(),
                            m.getKategori());
                    pesanan.setJumlah(jumlah);
                    listPesanan.add(pesanan);
                    System.out.println(
                            "Ditambahkan: " + m.getNama() + " x" + jumlah);
                    ketemu = true;
                    break;
                }
            }
            if (!ketemu) {
                System.out.println(
                        "Menu \"" + namaPesanan + "\" tidak ditemukan!");
            }
        }

        int subtotal = 0;
        for (Menu p : listPesanan) {
            if (p == null)
                continue;
            subtotal += p.getJumlah() * p.getHarga();
        }

        if (subtotal > 50000) {
            for (Menu p : listPesanan) {
                if (p == null)
                    continue;
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
            if (p == null)
                continue;
            System.out.println(
                    p.getNama() +
                            " x" +
                            p.getJumlah() +
                            " = Rp" +
                            (p.getJumlah() * p.getHarga()));
            if (p.getBonus() > 0) {
                System.out.println(
                        "  + Gratis " + p.getNama() + " x" + p.getBonus());
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

        System.out.println("===========================");
        System.out.println("Pesanan Selesai, tekan enter untuk lanjut ke menu sebelumnya");
        System.out.println("===========================");
        scanner.nextLine();

    }

    public static void menuPemilik() {
        while (true) {
            clearWithBlankLines();
            System.out.println("===========================");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Ubah Harga Menu");
            System.out.println("3. Hapus Menu");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            String input = sc.nextLine().trim();
            switch (input) {
                case "1" -> tambahMenu();
                case "2" -> ubahMenu();
                case "3" -> hapusMenu();
                case "0" -> {
                    return;
                }
                default -> System.out.println("Input tidak valid.");
            }

        }
    }

    public static void tambahMenu() {
        clearWithBlankLines();
        System.out.println("\n=== Tambah Menu Baru ===");
        System.out.print("Nama menu baru: ");
        String nama = sc.nextLine().trim();
        if (nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong.");
            return;
        }

        int harga;

        while (true) {
            System.out.print("Harga: Rp");
            try {
                harga = Integer.parseInt(sc.nextLine().trim());
                if (harga <= 0) {
                    System.out.println("Harga harus lebih dari 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Harga harus berupa angka.");
            }
        }

        Kategori kategori;
        while (true) {
            System.out.println("Kategori: 1. Makanan  2. Minuman");
            System.out.print("Pilih: ");
            String k = sc.nextLine().trim();
            if (k.equals("1")) {
                kategori = Kategori.MAKANAN;
                break;
            } else if (k.equals("2")) {
                kategori = Kategori.MINUMAN;
                break;
            } else
                System.out.println("Input tidak valid.");
        }

        System.out.println("\nKonfirmasi tambah menu:");
        System.out.println("Nama     : " + nama);
        System.out.println("Harga    : Rp" + harga);
        System.out.println("Kategori : " + kategori);
        System.out.print("Apakah yakin? (Ya/Tidak): ");
        String konfirmasi = sc.nextLine().trim();

        if (konfirmasi.equalsIgnoreCase("Ya")) {
            menuList.add(new Menu(nama, harga, kategori));
            System.out.println("Menu \"" + nama + "\" berhasil ditambahkan.");
        } else {
            System.out.println("Penambahan menu dibatalkan.");
        }
    }

    public static void listMenu() {
        for (int i = 0; i < menuList.size(); i++) {
            Menu m = menuList.get(i);
            System.out.println((i + 1) + ". " + m.getKategori() + " - "
                    + m.getNama() + " | Rp" + m.getHarga());
        }

    }

    public static void ubahMenu() {
        System.out.println("\n=== Ubah Harga Menu ===");

        listMenu();

        int nomor;
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin diubah (0 = batal): ");
            try {
                nomor = Integer.parseInt(sc.nextLine().trim());
                if (nomor == 0) {
                    System.out.println("Dibatalkan.");
                    return;
                }
                if (nomor >= 1 && nomor <= menuList.size())
                    break;
                System.out.println("Nomor tidak valid.");
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka.");
            }
        }

        Menu dipilih = menuList.get(nomor - 1);
        System.out.println("Menu dipilih: " + dipilih.getNama()
                + " | Harga saat ini: Rp" + dipilih.getHarga());

        int hargaBaru;
        while (true) {
            System.out.print("Harga baru: Rp");
            try {
                hargaBaru = Integer.parseInt(sc.nextLine().trim());
                if (hargaBaru <= 0) {
                    System.out.println("Harga harus lebih dari 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Harga harus berupa angka.");
            }
        }

        System.out.println("\nKonfirmasi perubahan:");
        System.out.println("Menu       : " + dipilih.getNama());
        System.out.println("Harga lama : Rp" + dipilih.getHarga());
        System.out.println("Harga baru : Rp" + hargaBaru);
        System.out.print("Apakah yakin? (Ya/Tidak): ");
        String konfirmasi = sc.nextLine().trim();

        if (konfirmasi.equalsIgnoreCase("Ya")) {
            dipilih.setHarga(hargaBaru);
            System.out.println("Harga berhasil diubah menjadi Rp" + hargaBaru + ".");
        } else {
            System.out.println("Perubahan harga dibatalkan.");
        }
    }

    public static void hapusMenu() {
        System.out.println("\n=== Hapus Menu ===");

        listMenu();

        int nomor;
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin dihapus (0 = batal): ");
            try {
                nomor = Integer.parseInt(sc.nextLine().trim());
                if (nomor == 0) {
                    System.out.println("Dibatalkan.");
                    return;
                }
                if (nomor >= 1 && nomor <= menuList.size())
                    break;
                System.out.println("Nomor tidak valid.");
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka.");
            }
        }

        Menu dipilih = menuList.get(nomor - 1);

        System.out.println("\nKonfirmasi hapus menu:");
        System.out.println("Nama     : " + dipilih.getNama());
        System.out.println("Harga    : Rp" + dipilih.getHarga());
        System.out.println("Kategori : " + dipilih.getKategori());
        System.out.print("Apakah yakin? (Ya/Tidak): ");
        String konfirmasi = sc.nextLine().trim();

        if (konfirmasi.equalsIgnoreCase("Ya")) {
            menuList.remove(dipilih);
            System.out.println("Menu \"" + dipilih.getNama() + "\" berhasil dihapus.");
        } else {
            System.out.println("Penghapusan menu dibatalkan.");
        }
    }
}
