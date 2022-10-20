package StringManipulation;

public class C02 {
    public static void main(String[] args) {
        /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String str="$13.99"
        String str2="$10.55"
        ipucu=Double.parseDouble() methodunu kullanabilirsiniz.
         */
        String str="$13.99";
        String str2="$10.55";
        String newStr=str.replaceFirst("[$]","");
        String newStr2=str2.replaceFirst("[$]","");
        double n01=Double.parseDouble(newStr);
        double n02=Double.parseDouble(newStr2);

        System.out.println(n01+n02);



    }
}
