package com.sbaws.product.java8;

import java.util.Arrays;
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
    }
}
