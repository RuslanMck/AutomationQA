package sort;

import java.util.HashSet;
import java.util.Set;

public class MathSort<T> {

    private Set<T> firstNumbers = new HashSet<>();
    private Set<T> secondNumbers = new HashSet<>();

    public MathSort(Set<T> firstNumbers, Set<T> secondNumbers) {
        this.firstNumbers = firstNumbers;
        this.secondNumbers = secondNumbers;
    }


    public Set<T> union() {
        Set<T> unionResult = new HashSet<>();

        unionResult.addAll(firstNumbers);
        unionResult.addAll(secondNumbers);

        return unionResult;

    }

    public Set<T> intersect() {
        Set<T> unionResult = firstNumbers;
        unionResult.retainAll(secondNumbers);
        return unionResult;

    }
}
