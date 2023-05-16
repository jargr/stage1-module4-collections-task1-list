package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int numberA = Integer.parseInt(a);
        int numberB = Integer.parseInt(b);
        int compareFunctions = function(numberA) - function(numberB);
        if (compareFunctions == 0) {
            return numberA - numberB;
        }
        return compareFunctions;
    }

    private int function(int number) {
        return 5 * number * number + 3;
    }
}
