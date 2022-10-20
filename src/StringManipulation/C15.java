package StringManipulation;

public class C15 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
büyük harfle yazdırınız.
Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
         */
        String a="uWuA";
        String b=a.substring(0,a.length()-1).toUpperCase();
        System.out.println(b);
    }
}
