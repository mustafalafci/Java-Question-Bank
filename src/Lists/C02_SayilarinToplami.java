package Lists;

import java.util.ArrayList;
import java.util.List;

public class C02_SayilarinToplami {
    public static void main(String[] args) {
        /*
         Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
         */

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int sum=0;

        for (Integer w:myList) {

            if (w==13){
                break;
            }
            sum=sum+w;

        }
        System.out.println(sum);


    }
}
