package Lists;

import java.util.ArrayList;
import java.util.List;

public class C01_OgeList {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
         */
        List<Integer> tamSayi=new ArrayList<>();
        tamSayi.add(1);
        tamSayi.add(2);
        tamSayi.add(3);
        tamSayi.add(4);
        tamSayi.add(5);

        int sum=0;
        for (Integer w:tamSayi) {

            sum = sum +w;
        }
        System.out.println(sum);
    }
}
