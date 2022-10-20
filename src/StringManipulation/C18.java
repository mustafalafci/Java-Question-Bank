package StringManipulation;

public class C18 {
    public static void main(String[] args) {
        /*
        Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
yazınız.
Örnek:‘ Ali ’ için kodunuz konsolda false yazmalıdır
 ‘Ali’ için kodunuz konsolda true yazmalıdır
         */
        String a="ali ";
        int c=a.length(); //5 3 4
        int b=a.trim().length();//ali 3
        if (c==b){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
