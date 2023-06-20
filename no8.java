import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int arrayLength = scanner.nextInt();

        if (arrayLength < 1) {
            System.out.println("Array kosong!");
            return;
        }

        String[] array = new String[arrayLength];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.next();
        }

        System.out.print("Masukkan panjang minimum teks: ");
        int minLength = scanner.nextInt();
        System.out.print("Masukkan panjang maksimum teks: ");
        int maxLength = scanner.nextInt();

        List<Integer> teks = maxminteks(array, minLength, maxLength);

        if (teks.isEmpty()) {
            System.out.println("Teks tidak ditemukan dalam range panjang yang ditentukan.");
        } else {
            System.out.println("Teks ditemukan pada indeks berikut: ");
            for (int index : teks) {
                System.out.println(index);
            }
        }
    }

    private static List<Integer> maxminteks(String[] array, int minLength, int maxLength) {
        List<Integer> teks = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String text = array[i];
            int textLength = text.length();
            if (textLength >= minLength && textLength <= maxLength) {
                teks.add(i);
            }
        }
        return teks;
    }
}
