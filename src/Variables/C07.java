package Variables;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        /*
       7- İki tamsayıyı degistirmek için bir kod yaziniz.
         */
       Scanner scan=new Scanner(System.in);
        System.out.println("İki tam sayi giriniz: ");
        int n01= scan.nextInt();
        int n02= scan.nextInt();
        System.out.println("birinci sayi: "+n01+" "+"ikinci sayi: "+n02);
        //degistirelim
        n01=n01+n02;//n01 30
        n02=n01-n02;//30-20=10

        //n02 30-20=10

        System.out.println(n02);


    }
}
