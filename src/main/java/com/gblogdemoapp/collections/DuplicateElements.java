package com.gblogdemoapp.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 10, 40, 50, 20);
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
