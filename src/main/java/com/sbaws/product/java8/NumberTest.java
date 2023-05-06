package com.sbaws.product.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        //1. Min or Max number
        Integer maxNumber = list.stream().max((s1, s2) -> s1.compareTo(s2)).get();
        System.out.println("Max Number of above list is::" + maxNumber);

        //2. ASC or DSC order
        List<Integer> dscOrder = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Decending order::" + dscOrder);

        //3. Start or end
        List<String> endsWith = list.stream().map(s -> s + "").filter(s -> s.endsWith("8")).collect(Collectors.toList());
        System.out.println("EndsWith 8 is:::" + endsWith);

        //4. even or Odd
        List<Integer> evenNumber = list.stream().filter(e -> e % 2 == 0).sorted().distinct().collect(Collectors.toList());
        System.out.println("Even Number of above list is::" + evenNumber);

        //5. Duplicates
        List<Integer> duplicateNumber = list.stream().filter(i -> Collections.frequency(list, i) > 1).sorted().distinct().collect(Collectors.toList());
        System.out.println("Duplicate Numbers of above list is::" + duplicateNumber);

        // all numbers are divisible by 2 or not
        boolean areDivisiblebytwo = list.stream().allMatch(n -> n % 2 == 0);
        if (areDivisiblebytwo) {
            System.out.println(areDivisiblebytwo);
        } else {
            System.out.println(areDivisiblebytwo);
        }
    }
}
