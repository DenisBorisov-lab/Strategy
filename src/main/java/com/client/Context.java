package com.client;

import com.strategy.Sort;

import java.util.List;

public class Context {
    private Sort object;

    public void setSort(Sort object) {
        this.object = object;
    }

    public List<Integer> sort(List<Integer> list) {
        return object.sort(list);
    }
}
