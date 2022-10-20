package Arrays;

public class C09_ObjeVarMiYokMu {
    /*
    Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
     */
    public static void main(String[] args) {
        String[] arr = new String[]{"Apex", "apex" ,"is", "an", "object", "oriented", "programming", "language"};
        String s = "Apex";
        int counter = 0;
        for(String w : arr){
            if(w.equalsIgnoreCase("Apex")){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(s + " arrayde vardir "+counter+ " tane vardır");
        }else{
            System.out.println(s + " arrayde yoktur");
        }

    }
}
