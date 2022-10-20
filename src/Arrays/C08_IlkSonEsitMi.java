package Arrays;

public class C08_IlkSonEsitMi {
    /*
   Ilk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
    */
    public static void main(String[] args) {


        String[] arr = new String[]{"adana", "kelaynak", "ilker", "hakan"};

        for (String w:arr){

                if (w.substring(0,1).equals(w.substring(w.length()-1))){
                    System.out.print(w+ " ");

            }
        }

    }

}
