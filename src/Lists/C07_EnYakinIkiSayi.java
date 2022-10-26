package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_EnYakinIkiSayi {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

         */
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h); // [12, 13, 15, 31, 54]


        int minDiff=h.get(3)-h.get(2);// Herhangi birisinin farkı verilir. //23
        System.out.println(minDiff);

        for (int i = 1; i <h.size(); i++) {

            minDiff=Math.min(minDiff,h.get(i)- h.get(i-1)); // Math.min aradaki en düşük farki verir
        }
        for (Integer i=1;i<h.size();i++){
            if (h.get(i)-h.get(i-1)==minDiff){
                System.out.println(h.get(i)+" and "+ h.get(i-1));
            }
        }

    }
}
