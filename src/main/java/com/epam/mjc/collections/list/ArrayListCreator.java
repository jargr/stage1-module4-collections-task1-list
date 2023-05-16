package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        var result = new ArrayList<String>();
        int index = 1;
        for (String word: sourceList) {
            if (index % 3 == 0) {
                result.add(word);
                result.add(word);
            }
            index++;
        }
        return result;
    }
}
