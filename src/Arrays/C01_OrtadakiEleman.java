package Arrays;

import java.util.Arrays;

public class C01_OrtadakiEleman {
    public static void main(String[] args) {
        /*
         Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
         Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
         (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */
        Integer arr[]=new Integer[]{12, 5, 8}; //1

        Arrays.sort(arr);

        if (arr.length%2!=0) {

            Integer a = arr.length / 2;

            System.out.println(arr[a]);

        }else { // 5 8 12 13

                      //   12              + 8       =       /2   = 10
                      //  arr[2]           + arr [1]
            int b = (arr[(arr.length / 2)] + arr[(arr.length / 2 - 1)])/2;
            System.out.println(b);

        }

    }
}
