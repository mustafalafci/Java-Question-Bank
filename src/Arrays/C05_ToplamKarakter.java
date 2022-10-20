package Arrays;

public class C05_ToplamKarakter {
    /*
     String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
     */
    public static void main(String[] args) {
        String[] arr = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int sum=0;
        for(String w:arr){
            sum=sum+w.length();
        }
        System.out.println(sum);//Toplam Karakter Sayisi

        // II.Yol
        int a=0;
        for (int i = 0; i <arr.length ; i++) {
            a=a+arr[i].length();

        }
        System.out.println(a);

    }

}
