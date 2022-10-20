package StringManipulation;

public class C14 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
yazdırınız.
Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
         */
        String a="Java";
        String b=a.substring(1);
        System.out.println(b);
    }
}
