package StringManipulation;

public class C12 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek:'Ali Can' için n yazdırmalısınız.
        ‘Miami’ için i yazdırmalısınız
         */
        String a="Ali Can ".trim();
        char b=a.charAt(a.length()-1);
        System.out.println(b);
    }
}
