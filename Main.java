import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tiket tiket1 = new Tiket();
        tiket1.setHargaTiket(35000);
        System.out.println("\n************* SISTEM PEMESANAN TIKET BIOSKOP ************");
        System.out.print("Masukkan nama Anda : ");
        String nama = input.next();
        System.out.print("Masukkan email Anda : ");
        String email = input.next();

        tiket1.setNama(nama);
        tiket1.setEmail(email);

        boolean chf = true;
        while (chf) {
            System.out.println("\n>> Film Sedang Tayang <<");
            System.out.println("1. Little Mermaid");
            System.out.println("2. SpiderMan");
            System.out.println("3. KKN di Desa Penari");
            System.out.println("4. Fast X");
            System.out.println("5. Dilan 1990");
            System.out.print("-> Masukkan film pilihan Anda : ");
            String i = input.next();
            switch (i) {
                case "1":
                    tiket1.setJudul("Little Mermaid");
                    chf = false;
                    break;
                case "2":
                    tiket1.setJudul("SpiderMan");
                    chf = false;
                    break;
                case "3":
                    tiket1.setJudul("KKN di Desa Penari");
                    chf = false;
                    break;
                case "4":
                    tiket1.setJudul("Fast X");
                    chf = false;
                    break;
                case "5":
                    tiket1.setJudul("Dilan 1990");
                    chf = false;
                    break;
                default:
                    System.out.println("\nERROR : Input yang Anda  masukkan salah!");
            }
        }

        boolean chj = true;
        while (chj) {
            System.out.println("\n>> Pilih Jam Tayang <<");
            System.out.println("1. 13:15");
            System.out.println("2. 14:50");
            System.out.println("3. 16:20");
            System.out.println("4. 18:30");
            System.out.println("5. 19:45");
            System.out.print("-> Masukkan jam tayang pilihan Anda : ");
            String j = input.next();
            switch (j) {
                case "1":
                    tiket1.setJam("13.15 WIB");
                    chj = false;
                    break;
                case "2":
                    tiket1.setJam("14.50 WIB");
                    chj = false;
                    break;
                case "3":
                    tiket1.setJam("16.20 WIB");
                    chj = false;
                    break;
                case "4":
                    tiket1.setJam("18.30 WIB");
                    chj = false;
                    break;
                case "5":
                    tiket1.setJam("19.45 WIB");
                    chj = false;
                    break;
                default:
                    System.out.println("\nERROR : Input yang Anda  masukkan salah!");
            }
        }

        System.out.print("-> Masukkan jumlah tiket : ");
        tiket1.setJumlahTiket(input.nextInt());
        int total = tiket1.getHargaTiket() * tiket1.getJumlahTiket();
        tiket1.setTotalHarga(total);

        System.out.println("\n============ INVOICE PEMESANAN TIKET BIOSKOP ===========");
        System.out.println("Nama\t\t: " + tiket1.getNama());
        System.out.println("Email\t\t: " + tiket1.getEmail());
        System.out.println("--------------------------------------------------------");
        System.out.println("Judul Film\t: " + tiket1.getJudul());
        System.out.println("Jam Tayang\t: " + tiket1.getJam());
        System.out.println("Total Harga\t: Rp " + tiket1.getHargaTiket() + " x " + tiket1.getJumlahTiket());
        System.out.println("\t\t\t: Rp " + tiket1.getTotalHarga());
        System.out.println("========================================================");
        System.out.println("\n");
    }
}