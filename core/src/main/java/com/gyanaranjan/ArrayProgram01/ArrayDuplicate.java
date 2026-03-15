package com.gyanaranjan.ArrayProgram01;

import java.util.*;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,5,6,8,8,9,10,10,67};
//        // :-> Normal way :-
//       for(int i=0;i< arr.length;i++){
//           for(int j=1;j< arr.length-1;j++){
//               if(arr[i]==arr[j]){
//                  System.out.println(arr[i]);
//              }
//           }
//       }
//                 Create a HashSet to store unique elements
                Set<Integer> set = new HashSet<>();

                // Create a list to store the unique elements in the order they appear
                List<Integer> uniqueList = new ArrayList<>();

                // Iterate through the array
                for (int i = 0; i < arr.length; i++) {
                    // If the element is not already present in the set,
                    // add it to both the set and the list
                    if (!set.contains(arr[i])) {
                        set.add(arr[i]);
                        uniqueList.add(arr[i]);
                    }
                }

                // Convert the list back to an array
                int[] uniqueArray = new int[set.size()];
                for (int i = 0; i <set.size(); i++) {
                    uniqueArray[i] = uniqueList.get(i);
                }

                // Print the unique array
                System.out.println(Arrays.toString(uniqueArray));






//         *** -> In java 8 ways
//         List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
//         Set settoarr = new HashSet();
//         List list1 = new ArrayList<>();
//         list.addAll(list);
//          Object[] arra1=list1.toArray();
//        System.out.println(Arrays.toString(arra1));

//         settoarr.addAll(list);
//         Object[] array = list.toArray();
//         System.out.println(Arrays.toString(array));


    }
}
