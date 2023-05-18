package com.sbaws.product.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArraysTest {
    public static void main(String[] args) {
        //merge two arrays and sorted and DSC
        int[] a1 = {25, 14, 36, 89, 75, 19};
        int[] a2 = {89, 23, 65, 45, 25, 2, 99};

        int[] finalArray = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).toArray();
        Arrays.stream(finalArray).boxed().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
    }
}
