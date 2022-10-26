package Arrays;

import java.util.Arrays;

public class C07_SesliHarf {
    /*
    Verilen bir String'deki sesli harf sayısını bulunuz.
     */
    public static void main(String[] args) {

        String a="Adini sen koy Ali";
        String []arr=a.split("");
        int counter=0;
        for (String w:arr){
            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "u":
                case "o":
                    counter++;

            }
        }System.out.print(counter);



    }
    }


