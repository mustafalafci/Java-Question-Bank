package Arrays;

public class C04_BasHarfAlma {
    /*
String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
alınız.
Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

     */

    public static void main(String[] args) {

        // I.YOL
        String[] b = new String[]{"Kemal", "Jonathan", "Jackson", "Mark", "Angie", "Veli"};
        for (int i = 0; i <b.length ; i++) {
            if (b[i].endsWith("n") || b[i].endsWith("k")){
                System.out.print(b[i].substring(0,1)+", ");
            }
        }
        //II.YOL
        String[] c = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        String initials = "";
        for(String w : c){
            if(w.endsWith("n") || w.endsWith("k")){
                initials = initials + w.substring(0,1);
            }
        }
        System.out.println(initials);

    }

}

