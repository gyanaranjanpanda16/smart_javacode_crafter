package com.gyanaranjan.CollectionFrameworkProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Alliterator {
    public static void main(String[] args) {
      List list = new ArrayList<>();
      list.add("b");
      list .add("d");
      list .add("e");
      list .add("w");
//      Iterator01 ite = objects.iterator();
//        while(ite.hasNext()){
//            System.out.println(ite.next());
//        }
//        for(Object l :objects){
//            System.out.println(l);
//        }
//        System.out.println(objects);
//        iterator works only one direction .
//        list-iterator works on bidirectional.
        ArrayList list2 = new ArrayList();
        ListIterator list1 = list .listIterator(list .size());
        while(list1.hasPrevious()){
          list1.add(list1.previous());
        }
        for(Object obj : list2){
            System.out.print(obj);
        }
        }

    }

