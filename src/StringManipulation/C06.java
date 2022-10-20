package StringManipulation;

import java.util.Scanner;

public class C06 {public static void main(String[] args) {
          /*
        Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
          */
    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen Isminizi ve Soyisminizi girin");
    String nameSurname = scan.nextLine();
     //Mustafa Lafcı
    int isim = nameSurname.indexOf(" ");// MUSTAFA 7
    int soyIsim = nameSurname.substring(isim).trim().length();// " LAFCI"//5
    if (isim > soyIsim) {
        System.out.println("isim daha uzun");
    } else if (isim < soyIsim) {
        System.out.println("soyisim daha uzun");

    } else {
        System.out.println("İsim soyisim esit");
    }
    }
}


