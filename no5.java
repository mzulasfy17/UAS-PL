import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class no5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jumlah elemen array: ");
            int arrayLength = scanner.nextInt();

            if (arrayLength < 1) {
                System.out.println("Array kosong!");
                return;
            }

            int[] array = new int[arrayLength];
            System.out.println("Masukkan elemen array:");
            for (int i = 0; i < arrayLength; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Masukkan angka yang ingin dicari: ");
            int batas = scanner.nextInt();

            List<Integer> indices = cariangka(array, batas);

            if (indices.isEmpty()) {
                System.out.println("Angka tidak ditemukan dalam array.");
            } else {
                System.out.println("Angka ditemukan pada indeks berikut: ");
                for (int index : indices) {
                    System.out.println(index);
                }
            }
        }

        private static List<Integer> cariangka(int[] array, int target) {
            List<Integer> angka = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    angka.add(i);
                }
            }
            return angka;
        }
    }
