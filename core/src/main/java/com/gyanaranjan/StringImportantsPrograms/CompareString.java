package com.gyanaranjan.StringImportantsPrograms;

// Compare the String Value :-->

public class CompareString {
   static  String[] arr = {
          "apple" ,"ram","Hari","rintu","rahul","lipa","soumya","laxmi"};

    public static void main(String[] args) {
        for(int j =0; j< arr.length;j++){
            for(int i = j + 1;i<arr.length;i++) {
//                if (arr[i].compareTo(arr[j]) < 0) {
                if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                    String s = arr[j];
                    arr[j] = arr[i];
                    arr[i] = s;
                }
            }
                System.out.println(arr[j]);

        }
    }
}
