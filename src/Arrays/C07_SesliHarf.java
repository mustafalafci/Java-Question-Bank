package Arrays;

import java.util.Arrays;

public class C07_SesliHarf {
    /*
    Verilen bir String'deki sesli harf sayısını bulunuz.
     */
    public static void main(String[] args) {
        String a = "Annen1* evde mi annen evde mi";
        String[] arr = a.toLowerCase().split("");
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        for (String w : arr) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println("The number of vowels is " + counter);
    }
}


