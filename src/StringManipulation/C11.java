package StringManipulation;

public class C11 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
         */
        String a="1a3Bcf4!...";
        int b=a.replaceAll("[0-9]","").length();
        System.out.println(b);
    }
}
