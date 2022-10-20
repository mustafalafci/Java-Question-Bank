package StringManipulation;

public class C10 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
konsolda yazdırınız.
Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
         */
        String a= " Miami 33018!!! ";
        String b=a.replaceAll("\\s","").replaceAll("[\\p{Punct}]","");
        int c=b.length();
        System.out.println(c);
    }
}
