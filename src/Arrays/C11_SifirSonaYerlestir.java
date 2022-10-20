package Arrays;

import java.util.Arrays;

public class C11_SifirSonaYerlestir {
    /*
    Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
    Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

     */
    public static void main(String[] args) {


        Integer[] arr = new Integer[]{5, 0, 2, 0, 3};

        Integer[] newArr = new Integer[arr.length];

        int idx=0;
        int lastidx=arr.length-1;
        for (int i = 0; i <newArr.length ; i++) {

            if (arr[i]>0){ // [5, , , ,0]

                newArr[idx] = arr[i];

                idx++;

            }else {
                newArr[lastidx]=0;
                lastidx--;

            }

        }

        System.out.print(Arrays.toString(newArr));
    }
}
