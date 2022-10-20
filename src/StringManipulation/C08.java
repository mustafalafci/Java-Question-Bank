package StringManipulation;

import java.util.Scanner;
import java.util.Spliterator;

public class C08 {
    public static void main(String[] args) {
        /*
        Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
        Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Sehir ismi giriniz: ");
        String sehir= scan.nextLine();
        String a=sehir.substring(0,1).toUpperCase()+sehir.substring(1).toLowerCase();
        System.out.println(a);

    }
}
