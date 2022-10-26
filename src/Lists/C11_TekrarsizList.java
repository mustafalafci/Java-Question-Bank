package Lists;

import java.util.ArrayList;
import java.util.List;

public class C11_TekrarsizList {
    public static void main(String[] args) {
        /*
        Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
        olup olmadığını kontrol ediniz.
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(4);
        myList.add(1);
        myList.add(8);
        myList.add(4);
        myList.add(2);
        myList.add(8);
        myList.add(3);

//   ***     Integer counter = 0;
//        for (Integer w : myList) {
//            for (Integer k : myList) {
//                if (w == k) {
//                    counter++;
//                }
//            }
//        }
//        if (counter == myList.size()) {
//            System.out.println("Tekrarlanan oge yoktur");
//        } else {
//            System.out.println("En az 1 oge tekrarlanmistir");
//        }

        List<Integer> tekrarsizliste=new ArrayList<>();
        int counterr=0;
        for (Integer w:myList){
            if (!tekrarsizliste.contains(w)){
                tekrarsizliste.add(w);
            }else {
                counterr++;

            }
        }
        System.out.println(tekrarsizliste);
        System.out.println(counterr+" oge tekrarlanmistir");

    }
}

