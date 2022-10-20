package StringManipulation;

public class C09 {
    public static void main(String[] args) {
        /*
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
karakter sayısının toplamını yazdırınız.
Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
*/
        String a=" al i ",b=" veli ",c=" must ";
        int aN=a.replaceAll("\\s","").length(),bN=b.replaceAll("\\s","").length(),cN=c.replaceAll("\\s","").length();
        System.out.println(""+(aN+bN+cN));
    }
}
