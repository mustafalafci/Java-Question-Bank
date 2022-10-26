package Lists;

import java.util.ArrayList;
import java.util.List;

public class C03_SayilarinCarpimi {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int mult=1;
        for (Integer w:myList){

            if (w%2==0){
                mult*=w;
            }
        }
        System.out.println(mult);

        // II.Yol

        int m=1;

        for(Integer w : myList){
            if(w%2!=0){
                continue;
            }
             m= m * w;
        }
        System.out.println(m);


    }
}
