import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tugas3 {
    static Scanner sc = new Scanner(System.in);

    static String readLine() {
        return sc.nextLine().trim();
    }

    static Double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Masukkan angka yang valid: ");
            }
        }
    }

    static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Masukkan angka yang valid: ");
            }
        }
    }

    static abstract class MenuItem {
        String nama;
        Double harga;
        String kategori;

        void tampilMenu() {
            System.out.println(this.nama + " | Rp" + this.harga + " | " + this.kategori);
        }

        void editItem() {
            System.out.print("Nama (" + this.nama + "): ");
            String inputNama = sc.nextLine().trim();
            if (!inputNama.isEmpty())
                this.nama = inputNama;

            System.out.print("Harga (" + this.harga + "): ");
            String inputHarga = sc.nextLine().trim();
            if (!inputHarga.isEmpty())
                this.harga = Double.parseDouble(inputHarga);

            System.out.print("Kategori (" + this.kategori + "): ");
            String inputKategori = sc.nextLine().trim();
            if (!inputKategori.isEmpty())
                this.kategori = inputKategori;
        }
    }

    static class Minuman extends MenuItem {
        String jenisMinuman;

        public void setJenisMinuman(String jenisMinuman) {
            this.jenisMinuman = jenisMinuman;
        }

        @Override
        void tampilMenu() {
            System.out.println(this.nama + " | Rp" + this.harga + " | " + this.kategori + " | " + this.jenisMinuman);
        }

        @Override
        void editItem() {
            super.editItem();
            System.out.print("Jenis Minuman (" + this.jenisMinuman + "): ");
            String inputJenis = sc.nextLine().trim();
            if (!inputJenis.isEmpty())
                this.jenisMinuman = inputJenis;
        }
    }

    static class Makanan extends MenuItem {
        String jenisMakanan;

        public void setJenisMakanan(String jenisMakanan) {
            this.jenisMakanan = jenisMakanan;
        }

        @Override
        void tampilMenu() {
            System.out.println(this.nama + " | Rp" + this.harga + " | " + this.kategori + " | " + this.jenisMakanan);
        }

        @Override
        void editItem() {
            super.editItem();
            System.out.print("Jenis Makanan (" + this.jenisMakanan + "): ");
            String inputJenis = sc.nextLine().trim();
            if (!inputJenis.isEmpty())
                this.jenisMakanan = inputJenis;
        }
    }

    static class Diskon extends MenuItem {
        Double diskon;

        @Override
        void tampilMenu() {
            System.out.println(this.nama + " | Diskon " + this.diskon + "%");
        }

        @Override
        void editItem() {
            System.out.print("Nama Diskon (" + this.nama + "): ");
            String inputNama = sc.nextLine().trim();
            if (!inputNama.isEmpty())
                this.nama = inputNama;

            System.out.print("Diskon (%) (" + this.diskon + "): ");
            String inputDiskon = sc.nextLine().trim();
            if (!inputDiskon.isEmpty())
                this.diskon = Double.parseDouble(inputDiskon);
        }
    }

    static class ItemPesanan {
        MenuItem menuItem;
        int jumlah;

        ItemPesanan(MenuItem menuItem, int jumlah) {
            this.menuItem = menuItem;
            this.jumlah = jumlah;
        }

        double subtotal() {
            return menuItem.harga * jumlah;
        }
    }

    public static class Menu {
        ArrayList<MenuItem> listMenu = new ArrayList<MenuItem>();
        private static final String FILE_MENU = "menu.txt";

        void simpanKeFile() {
            try (FileWriter writer = new FileWriter(FILE_MENU)) {
                for (MenuItem item : listMenu) {
                    if (item instanceof Makanan) {
                        Makanan m = (Makanan) item;
                        writer.write("Makanan," + m.nama + "," + m.harga + "," + m.kategori + "," + m.jenisMakanan + "\n");
                    } else if (item instanceof Minuman) {
                        Minuman m = (Minuman) item;
                        writer.write("Minuman," + m.nama + "," + m.harga + "," + m.kategori + "," + m.jenisMinuman + "\n");
                    } else if (item instanceof Diskon) {
                        Diskon d = (Diskon) item;
                        writer.write("Diskon," + d.nama + "," + d.diskon + "\n");
                    }
                }
                writer.flush();
            } catch (IOException e) {
                System.out.println("Gagal menyimpan ke file!");
            }
        }

        void bacaDariFile() {
            File file = new File(FILE_MENU);
            if (!file.exists()) return;

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",", 5);
                    if (parts.length == 0) continue;

                    switch (parts[0]) {
                        case "Makanan":
                            if (parts.length >= 5) {
                                Makanan m = new Makanan();
                                m.nama = parts[1];
                                m.harga = Double.parseDouble(parts[2]);
                                m.kategori = parts[3];
                                m.jenisMakanan = parts[4];
                                listMenu.add(m);
                            }
                            break;
                        case "Minuman":
                            if (parts.length >= 5) {
                                Minuman m = new Minuman();
                                m.nama = parts[1];
                                m.harga = Double.parseDouble(parts[2]);
                                m.kategori = parts[3];
                                m.jenisMinuman = parts[4];
                                listMenu.add(m);
                            }
                            break;
                        case "Diskon":
                            if (parts.length >= 3) {
                                Diskon d = new Diskon();
                                d.nama = parts[1];
                                d.diskon = Double.parseDouble(parts[2]);
                                d.harga = 0.0;
                                d.kategori = "Diskon";
                                listMenu.add(d);
                            }
                            break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Gagal membaca dari file!");
            }
        }

        void addAndWriteMenu(MenuItem item) {
            listMenu.add(item);
            simpanKeFile();
            System.out.println("Data otomatis disimpan ke " + FILE_MENU);
        }

        void tambahMenu() {
            System.out.println("================================");
            System.out.println("Tambah Menu Baru");
            System.out.println("================================");
            System.out.println("Pilih jenis menu:");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Diskon");
            System.out.print("Pilihan: ");
            String pilihan = sc.nextLine().trim();

            switch (pilihan) {
                case "1": {
                    Makanan m = new Makanan();
                    System.out.print("Nama Makanan: ");
                    m.nama = sc.nextLine().trim();
                    System.out.print("Harga: ");
                    m.harga = readDouble();
                    System.out.print("Kategori: ");
                    m.kategori = sc.nextLine().trim();
                    System.out.print("Jenis Makanan: ");
                    m.jenisMakanan = sc.nextLine().trim();
                    addAndWriteMenu(m);
                    System.out.println("Makanan berhasil ditambahkan!");
                    break;
                }
                case "2": {
                    Minuman m = new Minuman();
                    System.out.print("Nama Minuman: ");
                    m.nama = sc.nextLine().trim();
                    System.out.print("Harga: ");
                    m.harga = readDouble();
                    System.out.print("Kategori: ");
                    m.kategori = sc.nextLine().trim();
                    System.out.print("Jenis Minuman: ");
                    m.jenisMinuman = sc.nextLine().trim();
                    addAndWriteMenu(m);
                    System.out.println("Minuman berhasil ditambahkan!");
                    break;
                }
                case "3": {
                    Diskon d = new Diskon();
                    System.out.print("Nama Diskon: ");
                    d.nama = sc.nextLine().trim();
                    System.out.print("Besar Diskon (%): ");
                    d.diskon = readDouble();
                    d.harga = 0.0;
                    d.kategori = "Diskon";
                    addAndWriteMenu(d);
                    System.out.println("Diskon berhasil ditambahkan!");
                    break;
                }
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }

        void cetakMenu() {
            System.out.println("================================");
            System.out.println("Daftar Menu");
            System.out.println("================================");
            if (listMenu.size() == 0) {
                System.out.println("Belum ada menu apapun");
                System.out.println("================================");
                return;
            }
            for (int index = 0; index < listMenu.size(); index++) {
                System.out.print((index + 1) + ". ");
                listMenu.get(index).tampilMenu();
            }
            System.out.println("================================");
        }

        void cetakMenuPesanan() {
            int no = 0;
            for (int index = 0; index < listMenu.size(); index++) {
                no++;
                System.out.print(no + ". ");
                listMenu.get(index).tampilMenu();
            }
            if (no == 0) {
                System.out.println("Belum ada menu yang tersedia!");
            }
        }

        int indexMenuPesanan(int no) {
            int counter = 0;
            for (int index = 0; index < listMenu.size(); index++) {
                counter++;
                if (counter == no) return index;
            }
            return -1;
        }

        void editMenu() {
            if (listMenu.size() == 0) {
                System.out.println("================================");
                System.out.println("Belum ada menu untuk diedit");
                System.out.println("================================");
                return;
            }

            cetakMenu();
            System.out.print("Pilih nomor menu yang ingin diedit: ");
            int index = sc.nextInt() - 1;
            sc.nextLine();

            if (index < 0 || index >= listMenu.size()) {
                System.out.println("Nomor menu tidak valid!");
                return;
            }

            System.out.println("================================");
            System.out.println("Edit Menu - " + listMenu.get(index).nama);
            System.out.println("================================");
            System.out.println("Kosongkan field jika tidak ingin mengubah");
            listMenu.get(index).editItem();
            System.out.println("Menu berhasil diubah!");
        }

        void hapusMenu() {
            if (listMenu.size() == 0) {
                System.out.println("================================");
                System.out.println("Belum ada menu untuk dihapus");
                System.out.println("================================");
                return;
            }

            cetakMenu();
            System.out.print("Pilih nomor menu yang ingin dihapus: ");
            int index = sc.nextInt() - 1;
            sc.nextLine();

            if (index < 0 || index >= listMenu.size()) {
                System.out.println("Nomor menu tidak valid!");
                return;
            }

            MenuItem dihapus = listMenu.remove(index);
            System.out.println(dihapus.nama + " berhasil dihapus dari menu!");
        }
    }

    public static class Pesanan {
        ArrayList<ItemPesanan> listPesanan = new ArrayList<ItemPesanan>();
        Menu menu;
        boolean sedangMemesan = false;
        private static final String FILE_STRUK = "struk.txt";

        Pesanan(Menu menu) {
            this.menu = menu;
        }

        void mulaiPesan() {
            if (menu.listMenu.size() == 0) {
                System.out.println("================================");
                System.out.println("Belum ada menu yang tersedia!");
                System.out.println("Silahkan tambah menu terlebih dahulu.");
                System.out.println("================================");
                return;
            }

            sedangMemesan = true;
            System.out.println("================================");
            System.out.println("Mode Pesanan Aktif!");
            System.out.println("================================");
            System.out.println("Masukkan nomor menu yang ingin dipesan.");
            System.out.println("Ketik 0 untuk selesai memesan.");
            System.out.println("================================");

            listPesanan.clear();

            while (sedangMemesan) {
                menu.cetakMenuPesanan();
                System.out.print("Pilih nomor menu: ");
                int no = readInt();
                int index = menu.indexMenuPesanan(no);

                if (index == -1) {
                    if (listPesanan.size() == 0) {
                        System.out.println("================================");
                        System.out.println("Belum ada item yang dipesan!");
                        System.out.print("Batalkan pesanan? (y/n): ");
                        String konfirmasi = sc.nextLine().trim();
                        if (konfirmasi.equalsIgnoreCase("y")) {
                            sedangMemesan = false;
                            System.out.println("Pesanan dibatalkan.");
                        }
                    } else {
                        sedangMemesan = false;
                        System.out.println("Pemesanan selesai!");
                    }
                    System.out.println("================================");
                    continue;
                }

                if (index < 0 || index >= menu.listMenu.size()) {
                    System.out.println("Nomor menu tidak valid!");
                    continue;
                }

                MenuItem dipilih = menu.listMenu.get(index);

                System.out.print("Jumlah " + dipilih.nama + ": ");
                int jumlah = readInt();

                if (jumlah <= 0) {
                    System.out.println("Jumlah tidak valid!");
                    continue;
                }

                boolean ditemukan = false;
                for (ItemPesanan item : listPesanan) {
                    if (item.menuItem == dipilih) {
                        item.jumlah += jumlah;
                        ditemukan = true;
                        System.out.println("Jumlah " + dipilih.nama + " ditambah menjadi " + item.jumlah);
                        break;
                    }
                }

                if (!ditemukan) {
                    listPesanan.add(new ItemPesanan(dipilih, jumlah));
                    System.out.println(jumlah + "x " + dipilih.nama + " ditambahkan ke pesanan!");
                }
            }
        }

        void cetakPesanan() {
            if (listPesanan.size() == 0) {
                System.out.println("================================");
                System.out.println("Belum ada pesanan!");
                System.out.println("================================");
                return;
            }

            System.out.println("================================");
            System.out.println("Pesanan Saat Ini");
            System.out.println("================================");
            for (int i = 0; i < listPesanan.size(); i++) {
                ItemPesanan item = listPesanan.get(i);
                if (item.menuItem instanceof Diskon) {
                    System.out.println((i + 1) + ". " + item.menuItem.nama + " (" + ((Diskon) item.menuItem).diskon + "%)");
                } else {
                    System.out.println((i + 1) + ". " + item.menuItem.nama + " x" + item.jumlah + " = Rp" + item.subtotal());
                }
            }
            System.out.println("================================");
        }

        double hitungTotal() {
            double total = 0;
            double totalDiskonPersen = 0;

            for (ItemPesanan item : listPesanan) {
                if (item.menuItem instanceof Diskon) {
                    totalDiskonPersen += ((Diskon) item.menuItem).diskon;
                } else {
                    total += item.subtotal();
                }
            }

            if (totalDiskonPersen > 0) {
                double potongan = total * (totalDiskonPersen / 100);
                total -= potongan;
            }

            return total;
        }

        void cetakTotal() {
            if (listPesanan.size() == 0) {
                System.out.println("================================");
                System.out.println("Belum ada pesanan!");
                System.out.println("================================");
                return;
            }

            System.out.println("================================");
            System.out.println("Rincian Pesanan");
            System.out.println("================================");

            double subtotalSebelumDiskon = 0;
            double totalDiskonPersen = 0;

            for (ItemPesanan item : listPesanan) {
                if (item.menuItem instanceof Diskon) {
                    Diskon d = (Diskon) item.menuItem;
                    totalDiskonPersen += d.diskon;
                    System.out.println("Diskon: " + d.nama + " (" + d.diskon + "%)");
                } else {
                    double sub = item.subtotal();
                    subtotalSebelumDiskon += sub;
                    System.out.println(item.menuItem.nama + " x" + item.jumlah + " = Rp" + sub);
                }
            }

            System.out.println("------------------------------");
            System.out.println("Subtotal: Rp" + subtotalSebelumDiskon);

            if (totalDiskonPersen > 0) {
                double potongan = subtotalSebelumDiskon * (totalDiskonPersen / 100);
                System.out.println("Diskon: -Rp" + potongan + " (" + totalDiskonPersen + "%)");
            }

            double totalAkhir = hitungTotal();
            System.out.println("Total: Rp" + totalAkhir);
            System.out.println("================================");
        }

        void cetakStruk() {
            if (listPesanan.size() == 0) {
                System.out.println("================================");
                System.out.println("Belum ada pesanan untuk dicetak!");
                System.out.println("================================");
                return;
            }

            StringBuilder sb = new StringBuilder();

            double subtotalSebelumDiskon = 0;
            double totalDiskonPersen = 0;

            for (ItemPesanan item : listPesanan) {
                if (item.menuItem instanceof Diskon) {
                    Diskon d = (Diskon) item.menuItem;
                    totalDiskonPersen += d.diskon;
                } else {
                    double sub = item.subtotal();
                    subtotalSebelumDiskon += sub;
                    String baris = item.menuItem.nama + "," + item.jumlah + "," + (long) sub + "\n";
                    sb.append(baris);
                    System.out.println(item.menuItem.nama + " x" + item.jumlah + " = Rp" + (long) sub);
                }
            }

            if (totalDiskonPersen > 0) {
                double potongan = subtotalSebelumDiskon * (totalDiskonPersen / 100);
                sb.append("Diskon," + totalDiskonPersen + "," + (long) potongan + "\n");
                System.out.println("Diskon (" + totalDiskonPersen + "%): -Rp" + (long) potongan);
            }

            double totalAkhir = hitungTotal();
            sb.append("Subtotal," + (long) subtotalSebelumDiskon + "\n");
            sb.append("Total," + (long) totalAkhir + "\n");

            System.out.println("--------------------------------------------");
            System.out.println("Subtotal: Rp" + (long) subtotalSebelumDiskon);
            System.out.println("TOTAL: Rp" + (long) totalAkhir);
            System.out.println("============================================");
            System.out.println("       Terima kasih telah berbelanja!");
            System.out.println("============================================");

            try (FileWriter writer = new FileWriter(FILE_STRUK)) {
                writer.write(sb.toString());
                writer.flush();
                System.out.println("Struk berhasil disimpan ke " + FILE_STRUK);
            } catch (IOException e) {
                System.out.println("Gagal menyimpan struk ke file!");
            }

            listPesanan.clear();
        }

        void lihatStrukSebelumnya() {
            File file = new File(FILE_STRUK);
            if (!file.exists()) {
                System.out.println("================================");
                System.out.println("Belum ada struk tersimpan!");
                System.out.println("================================");
                return;
            }

            System.out.println("============================================");
            System.out.println("       STRUK SEBELUMNYA");
            System.out.println("============================================");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts[0].equals("Subtotal")) {
                        System.out.println("Subtotal: Rp" + parts[1]);
                    } else if (parts[0].equals("Total")) {
                        System.out.println("TOTAL: Rp" + parts[1]);
                    } else if (parts[0].equals("Diskon")) {
                        System.out.println("Diskon (" + parts[1] + "%): -Rp" + parts[2]);
                    } else {
                        System.out.println(parts[0] + " x" + parts[1] + " = Rp" + parts[2]);
                    }
                }
            } catch (IOException e) {
                System.out.println("Gagal membaca struk!");
            }
            System.out.println("============================================");
        }
    }

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("Selamat Datang di RM Sabila");
        System.out.println("================================");
        menuUtama();
    }

    public static void clearWithBlankLines() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    static void menuUtama() {
        Menu menu = new Menu();
        menu.bacaDariFile();
        Pesanan pesanan = new Pesanan(menu);

        while (true) {
            System.out.println("Silahkan pilih menu yang ingin diakses");
            System.out.println("1. Daftar Menu");
            System.out.println("2. Tambah Menu");
            System.out.println("3. Edit Menu");
            System.out.println("4. Hapus Menu");
            System.out.println("5. Pesan");
            System.out.println("6. Total Pesanan");
            System.out.println("7. Cetak Struk Pesanan");
            System.out.println("8. Lihat Struk Sebelumnya");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            String input = sc.nextLine().trim();

            switch (input) {
                case "1":
                    menu.cetakMenu();
                    break;
                case "2":
                    menu.tambahMenu();
                    break;
                case "3":
                    menu.editMenu();
                    break;
                case "4":
                    menu.hapusMenu();
                    break;
                case "5":
                    pesanan.mulaiPesan();
                    break;
                case "6":
                    pesanan.cetakTotal();
                    break;
                case "7":
                    pesanan.cetakStruk();
                    break;
                case "8":
                    pesanan.lihatStrukSebelumnya();
                    break;
                case "0":
                    System.out.println("Terima kasih telah berkunjung!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("================================");
                    System.out.println("Menu tidak valid, harap pilih menu yang sesuai");
                    System.out.println("================================");
                    break;
            }
        }
    }

}
