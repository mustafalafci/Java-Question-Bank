package Arrays;

import java.util.Arrays;

public class C06_KelimeSayisi {
    /*
     Verilen bir String'de 'a' veya 'A' ile başlayan kelime sayısını bulunuz.
     */
    public static void main(String[] args) {
        String a="Adana merkez patlıyor adam";
        String[]arr=a.split(" ");
        System.out.println(Arrays.toString(arr));
        int sayac=0;
        for (String w:arr){
            if (w.startsWith("A") ||w.startsWith("a")){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
