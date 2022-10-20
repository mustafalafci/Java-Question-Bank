package StringManipulation;

public class C03 {
    public static void main(String[] args) {
        /*
        String methodlarini kullanarak " Java ogrenmek123 Cok guzel@ " String'ini
                                        "Java ogrenmek cok guzel."sekline getirin
         */
        String a=" Java ogrenmek123 Cok guzel@ ";
        String b=a.replaceAll("[0-9]","").replaceAll("[\\p{Punct}]","").trim().toLowerCase();
        String c=b.substring(1).toLowerCase();//java ogrenmek cok guzel
        String d=b.substring(0,1);//J
        System.out.println(b);








    }
}
