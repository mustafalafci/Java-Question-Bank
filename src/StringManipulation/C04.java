package StringManipulation;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
        Kullanicidan isim isteyin.Eger
        -isim "a" harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
        -isim "Z" harfi iceriyora "Girdiginiz isim Z harfi iceriyor"
        -ikisi de yoksa "Girdiginiz isim a veya Z harfi icermiyor" yazdirin.
         */
        Scanner hakan=new Scanner(System.in);
        System.out.println("Kullanici isim gir ocu: ");
        String ilker=hakan.nextLine();
        if (ilker.contains("a") && ilker.contains("Z")){
            System.out.println("Girdiginiz isim a ve Z harfi iceriyor");
        } else if (ilker.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        } else if (ilker.contains("Z")) {
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
    }
}
