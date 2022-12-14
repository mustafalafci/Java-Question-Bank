package Arrays;

import java.util.Arrays;

public class C03_MaxMin {
    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        bulunuz.

                Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

         */

        // 1. Yol:
        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));//[-12, -5, -2, 18, 23]
        Integer minPositive = a[a.length-1];
        Integer maxNegative = a[0];
        for (Integer w : a) {
            if (w >= 0) { // 18, 23
                minPositive = Math.min(minPositive, w); // 18
            }
            if (w < 0) {
                maxNegative = Math.max(maxNegative, w); // -12
            }
        }
        System.out.println("Minimum positive: " + minPositive);
        System.out.println("Maximum negative: " + maxNegative);


        // 2. Yol:
        int[] b = new int[]{-12, 18, -5, 23, -2};

        Arrays.sort(b); //[-12, -5, -2, 18, 23] ///
        for (Integer i = 0; i < b.length; i++) {
            if (b[i] < 0 && b[i + 1] > 0) {

                System.out.println("Maximum negative: " + b[i]);
                System.out.println("Minimum positive: " + b[i + 1]);
            }
        }
    }
}




