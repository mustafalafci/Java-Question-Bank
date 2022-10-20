package Arrays;

public class C04_BasHarfAlma {
    /*
String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
alınız.
Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

     */

    public static void main(String[] args) {

        String[]arr=new String[]{ "Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        for (String w:arr){
            if (w.endsWith("n") || w.endsWith("k")){
                System.out.print(w.substring(0,1));
            }
        }
    }
    }



