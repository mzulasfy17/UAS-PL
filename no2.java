import java.util.Scanner;

    public class no2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan teks: ");
            String text = scanner.nextLine();

            System.out.println("=================================");
            System.out.println("Hasil Pengecekan Panjang Teks");
            System.out.println("=================================");

            System.out.println("Teks: " + text);
            System.out.println("Panjang teks: " + text.length() + " karakter");

            if (text.length() == 5) {
                System.out.println("Status: Panjang teks adalah 5 karakter");
            } else {
                System.out.println("Status: Panjang teks bukan 5 karakter");
            }

            System.out.println("=================================");
        }
    }