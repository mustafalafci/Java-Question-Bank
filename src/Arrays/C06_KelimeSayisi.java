package Arrays;

import java.util.Arrays;

public class C06_KelimeSayisi {
    /*
     Verilen bir String'de 'a' veya 'A' ile başlayan kelime sayısını bulunuz.
     */
    public static void main(String[] args) {
        String a = "Adını sen koy ali";
        String[] arr = a.split(" ");

        int counter=0;
        for (String w:arr){
            if (w.startsWith("a") || w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);

    }
    }
