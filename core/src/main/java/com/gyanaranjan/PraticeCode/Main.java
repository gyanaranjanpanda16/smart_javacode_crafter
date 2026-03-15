package com.gyanaranjan.PraticeCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> plist = new ArrayList<>();
        plist.add(new Product(1,"atta",110));
        plist.add(new Product(1,"rice",100));
        plist.add(new Product(1,"tea",60));
        plist.add(new Product(1,"sugar",60));
        Map<Integer, List<Product>> collect = plist.stream().filter(p -> p.getPrice() < 100).collect(Collectors.groupingBy(Product::getPrice));
//                forEach(System.out::println);


    }
}
