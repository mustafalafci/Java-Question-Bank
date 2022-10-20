package StringManipulation;

import java.util.Locale;

public class C16 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
karakterleri büyük harflerle yazdırınız.
Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
         */
        String str="Java".toUpperCase();
        String a=str.substring(1,str.length()-1);
        System.out.println(a);

    }
}
