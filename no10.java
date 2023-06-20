import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    public class no10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int narray = scanner.nextInt();

            int[] array = new int[narray];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            List<Integer> kelipatan5 = cariKelipatan5(array);
            Collections.sort(kelipatan5);

            if (kelipatan5.isEmpty()) {
                System.out.println("tidak ada!");
            } else {
                for (int angka : kelipatan5) {
                    System.out.println(angka);
                }
            }
        }

        private static List<Integer> cariKelipatan5(int[] array) {
            List<Integer> kelipatan5 = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 5 == 0) {
                    kelipatan5.add(array[i]);
                }
            }
            return kelipatan5;
        }
    }
