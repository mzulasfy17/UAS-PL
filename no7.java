import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no7 {

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

        List<Integer> panjangteks = panjangteks(array, 5);

        if (panjangteks.isEmpty()) {
            System.out.println("Teks dengan panjang 5 karakter tidak ditemukan dalam array.");
        } else {
            System.out.println("Teks dengan panjang 5 karakter ditemukan pada indeks berikut:");
            for (int index : panjangteks) {
                System.out.println(index);
            }
        }
    }

    private static List<Integer> panjangteks(String[] array, int length) {
        List<Integer> teks = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == length) {
                teks.add(i);
            }
        }
        return teks;
    }
}
