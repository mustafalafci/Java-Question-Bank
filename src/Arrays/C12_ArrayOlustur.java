package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C12_ArrayOlustur {
    /*
     Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
büyük öğeler arasındaki farkı konsolda yazdırınız.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Kac tane Tamsayi gireceksiniz  "); //
        int a= scan.nextInt();

        Integer []arr=new Integer[a];

        for (Integer w:arr){

            for (int i = 0; i <a ; i++) {

                    System.out.println((i+1)+". sayinizi giriniz");
                    int b = scan.nextInt();
                    arr[i] = b;

            }System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("en buyuk oge: "+arr[arr.length-1]+"\n"+"en kucuk oge: "+arr[0]+"\n"+"farkı: "+(arr[arr.length-1]-arr[0]));
            break;
        }
    }
}
