package Loops;

public class C03 {
    public static void main(String[] args) {
        /*
        Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır
         */
        String a="kabaks";

        String str="";

        for (int i =a.length()-1; i>-1 ; i--) {
            char ch=a.charAt(i);
            str=str+ch;
        }if (a.equals(str)){
            System.out.println("Palindromedir.");
        }else {
            System.out.println("degildir.");
        }
    }
}
