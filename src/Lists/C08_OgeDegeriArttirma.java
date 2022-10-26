package Lists;

import java.util.ArrayList;
import java.util.List;

public class C08_OgeDegeriArttirma {
    public static void main(String[] args) {
        /*
        Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
         */
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);


        for (Integer w:h) {

            if (w==7 || w==10){
                continue; // bu sayilar ise devam et bir sey yapma !
            }else {

                h.set(h.indexOf(w),w+2); //set() yeniden düzenler (index , düzenlenecek yer)
            }

        }
        System.out.println(h);

    }
}
