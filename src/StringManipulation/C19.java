package StringManipulation;

public class C19 {
    public static void main(String[] args) {
        /*
        Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
yazınız.
Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
 ‘ali.’ için kodunuz konsolda false yazdırmalıdır
 ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
 ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
 ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
         */
        String a = "Ali.";
        int b = a.length();
        char c=a.charAt(0),d=a.charAt(a.length()-1);
        int trim = a.trim().length();
        boolean buyuk = c>='A' && c<='Z';
        boolean nokta = c=='.';
        if (trim != b) {
            if (buyuk) {
                if (nokta) {
                    System.out.println("True");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("false");
            }
            }
        }
    }
