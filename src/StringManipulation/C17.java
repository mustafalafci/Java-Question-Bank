package StringManipulation;

public class C17 {
    public static void main(String[] args) {
        /*
         Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
         olmadığını kontrol etmek için kod yazınız.
         Örnek:‘Ali   Can’ için konsolda false yazmalıdır.
         ‘ Ali Can ’ için konsolda false yazmalıdır.
         ‘ Ali Can ’ için konsolda false yazmalıdır.
         ‘Ali Can’ için konsolda true yazmalıdır.
         */
        String s = "Abdulrahman Can";//7
        String trimlenmis = s.trim(); //7
        String hicBoslukYok = trimlenmis.replaceAll("\\s", "");//6 //Alican
        if (trimlenmis.length() - hicBoslukYok.length() == 1) {//ortadaki bosluk varmi yokmu
            if (s.length()>trimlenmis.length()) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
            }else {
            System.out.println("false");
        }
    }
}



