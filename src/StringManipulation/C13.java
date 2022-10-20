package StringManipulation;

public class C13 {
    public static void main(String[] args) {
        /*
         Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
toplamını bulunuz.
         */
        String a="mustafa";
        int ilk=a.charAt(0),son=a.charAt(a.length()-1);
        System.out.println(ilk+son);


    }
}
