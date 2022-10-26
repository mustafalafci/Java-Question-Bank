package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_StreamAPI {
    public static void main(String[] args) {
        /*
        Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
        yazınız.
        Not:
        Mountain Array ==> [0, 2, 5, 3, 1]
        Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra surekli azalan değer alıyorsa Mauntain Array' dir.
        Mountain Array Değil ==> [5, 2, 7, 1, 4]
        Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra surekli artan değer alıyorsa Mauntain Array değildir.
         */
        int a[] = {0, 2, 5, 3, 1};

        List<Integer> list = new ArrayList<>(); // Yeni List olustur.
        Arrays.stream(a).forEach(t -> list.add(t));
        int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
        int idxOfMax = list.indexOf(max);
        List<Integer> part1 = new ArrayList<>();
        list.stream().filter(t -> list.indexOf(t) <= idxOfMax).forEach(t -> part1.add(t));
        List<Integer> sortedPart1 = new ArrayList<>();
        part1.stream().forEach(t -> sortedPart1.add(t));
        Collections.sort(sortedPart1);
        List<Integer> part2 = new ArrayList<>();
        list.stream().filter(t -> list.indexOf(t) >= idxOfMax).forEach(t -> part2.add(t));
        List<Integer> reverseSortedPart2 = new ArrayList<>();
        part2.stream().forEach(t -> reverseSortedPart2.add(t));
        Collections.sort(reverseSortedPart2);
        Collections.reverse(reverseSortedPart2);
        if (part1.equals(sortedPart1) && part2.equals(reverseSortedPart2)) {
            System.out.println(list + " Mountain Arraydir");
        } else {
            System.out.println(list + " Mountain Array degildir");
        }


    }
}

