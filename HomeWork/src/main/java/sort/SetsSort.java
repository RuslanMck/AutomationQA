package sort;

import sort.MathSort;

import java.util.HashSet;
import java.util.Set;

public class SetsSort {

    public static void Sort(){
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();

        first.add(1);
        first.add(10);
        first.add(2);
        first.add(7);
        first.add(5);
        first.add(9);
        first.add(8);

        second.add(0);
        second.add(4);
        second.add(3);
        second.add(1);
        second.add(5);
        second.add(6);
        second.add(2);

        MathSort<Integer> mathSort = new MathSort<>(second, first);

        System.out.println(mathSort.union());
        System.out.println(mathSort.intersect());
    }
}
