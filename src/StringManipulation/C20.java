package StringManipulation;

public class C20 {
    public static void main(String[] args) {
        /*
        Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
sembol olmalıdır.
Örnek:
 'A2b!' için kodunuz konsolda false yazdırmalıdır.
 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
 '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
 '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
 '! a b 3 k' kodunuz konsolda false yazdırmalıdır.
         */
        String a="A2b3cdef";
        int b=a.length();
        int c=a.replaceAll("[\\s]","").length();
        boolean A=b==c && c>7;
        boolean B=a.replaceAll("[^\\p{Punct}]","").length()>0;
        boolean sonuc= A && B;
        System.out.println(sonuc);

    }
}
