package com;

import com.client.Context;
import com.strategy.SelectionSort;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    private static Context context;
    private static List<Integer> array;

    public static void main(String[] args) {
        context = new Context();

        context.setSort(new SelectionSort());
        System.out.println("Исходный массив: ");
        array = Demo.randomArray();
        System.out.println(array);

        System.out.println("Отсортированный массив: ");
        long start = System.currentTimeMillis();
        context.sort(array);
        System.out.println(array);

        System.out.println("Время выполнения программы: " + (System.currentTimeMillis() - start));

    }

    public static List<Integer> randomArray() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add((int) (Math.random() * 49));
        }
        return list;
    }
}
