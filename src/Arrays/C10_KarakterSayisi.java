package Arrays;

public class C10_KarakterSayisi {
    /*
    Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız
     */


    public static void main(String[] args) {

        String[] arr = new String[]{"Apex", "apex" ,"is", "an", "object", "oriented", "programming", "language"};

        int sum=0;
        for (String w:arr){
            sum+=w.length();


        }
        System.out.println(sum);
    }
}
