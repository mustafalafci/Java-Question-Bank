package Loops;

public class C04 {
    public static void main(String[] args) {
        /*
        Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
Örnek; 223878 => 37
         */
        int a=223878;
        String b=String.valueOf(a);
        System.out.println(b);
        String c="";
        for (int i = 0; i <b.length(); i++) {
            String str=b.substring(i,i+1);
            if (b.indexOf(str) == b.lastIndexOf(str)) {
                if (!c.contains(str)) {
                    c = c + str;
                }
            }
        }
        System.out.println(c);

    }
    }


