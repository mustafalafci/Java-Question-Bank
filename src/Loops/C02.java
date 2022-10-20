package Loops;

public class C02 {
    public static void main(String[] args) {
        /*
         Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
          Örneğin; accessories ´ ces
         */
        String a = "aleykumselam"; // alem

        String d = "";//alem
        for (int i = 0; i < a.length(); i++) {

            String c = a.substring(i, i + 1);//0->a
            if (a.indexOf(c) != a.lastIndexOf(c)) {
                if (!d.contains(c)) { //alem
                    d = d + c;
                }
            }
        }
        System.out.println(d);
    }
}
