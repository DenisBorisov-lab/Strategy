package com.strategy;

import java.util.List;

public class SelectionSort implements Sort {
    @Override
    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
}
