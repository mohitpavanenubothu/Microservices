package com.sbaws.product.java8;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Satya");
        hm.put(2, "Suvarna");
        hm.put(3, "Mohit");
        hm.put(4, "Vinay");

        //using for-each loop
        for (Integer key : hm.keySet()) {
            /*String value = hm.get(key);
            System.out.println("" + key + ":" + value);*/
            System.out.println(key);
        }
    }
}
