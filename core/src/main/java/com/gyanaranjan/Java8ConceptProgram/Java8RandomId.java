package com.gyanaranjan.Java8ConceptProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Java8RandomId {
    public static void main(String[] args) {
        List l = new ArrayList();
        for(int i=0;i<5;i++){
            UUID uuid = UUID.randomUUID();
            l.add(uuid);
        }
        for(Object a :l){
            System.out.println(a);
        }
    }
}
