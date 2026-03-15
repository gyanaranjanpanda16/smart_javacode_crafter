package com.gyanaranjan.ToughJavaProgram17042024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassMethod {
    public static void main(String[] args) {
        List<Integer> objects = new ArrayList<>();
        for(int i = 0; i<10; i++){
            objects.add(i);
        }
        Collections.rotate(objects,-15);
        System.out.println(objects);
    }
}
