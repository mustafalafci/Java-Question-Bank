package Lists;

import java.util.ArrayList;
import java.util.List;

public class C05_SayiDegistirme {
    public static void main(String[] args) {
        /*
        Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
         */
        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);

        if (g.contains(15)){
            for (Integer w:g){
                if (w==15){
                    int idx= g.indexOf(15);
                    g.set(idx,51);
                }
            }
            System.out.println(g);
        }else {
            System.out.println("Liste 15 icermiyor");
        }

    }
}
