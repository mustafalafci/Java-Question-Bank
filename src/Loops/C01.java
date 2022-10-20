package Loops;

public class C01 {
    public static void main(String[] args) {
        /*
        120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        ardışık tam sayı arasında boşluk bırakarak yazınız.
         */
        // I.YOL
        for (int i = 120; i>10 ; i--) {
            if (i%4==0 && i%6==0){
                System.out.print(i+", ");
            }
        }
        System.out.println();
        // II.YOL
        int i=120;
        while (i>10){
            if (i%4==0 && i%6==0) {
                System.out.print(i + ", ");
            }

            i--;
        }
        System.out.println();
        // III.YOL
        int a=120;
        do {

            if (a%4==0 && a%6==0){
                System.out.print(a+", ");

            }
            a--;
        }while (a>10);

    }
}
