package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C13_AnagramMi {
    /*
     Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("iki String giriniz :");
        String s1 = scan.nextLine(); //anan
        String s2 = scan.nextLine(); //NaNa
        String a1[] = s1.toLowerCase().split("");//anan
        Arrays.sort(a1); // aann
        String a2[] = s2.toLowerCase().split("");//nana
        Arrays.sort(a2);//  aann

        if (s1.length() != s2.length()) {
            System.out.println("Anagram Degil");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Anagram Degil");
        } else if (Arrays.equals(a1, a2)) {
            System.out.println("Anagramdir");
        } else {
            System.out.println("Anagram Degil");
        }
    }
}









