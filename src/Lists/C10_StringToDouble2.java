package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_StringToDouble2 {
    public static void main(String[] args) {
        /*
        Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
         */
        List<String> myList = new ArrayList<>();
        myList.add("12.99");
        myList.add("$8.25");
        myList.add("$23.60");
        myList.add("$54.45");

        List<Double> decimalList = new ArrayList<>(); // Yeni ArrayList olustur
        for(String w : myList){
            Double price = Double.valueOf(w.replace("$", "")); // String sayi yap
            decimalList.add(price);    // Yeni ArrayListe Sayilari Ata
        }
        Collections.sort(decimalList); // Sıralama yap
        Double sum = decimalList.get(0) + decimalList.get(decimalList.size()-1);
        //    Toplam=    minimum deger  + maximum deger
        System.out.println(sum); // yazdir


    }
}
