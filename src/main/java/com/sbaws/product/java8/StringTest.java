package com.sbaws.product.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringTest {
    public static void main(String[] args) {
        String str = "Java SpringBoot MS";
        //Number of Occurences
        Map<String, Long> countMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Each Char occurance::" + countMap);

        //find all duplicate elements from a given String
        List<String> duplicateKeys = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Duplicate elements above String is::" + duplicateKeys);

    }
}
