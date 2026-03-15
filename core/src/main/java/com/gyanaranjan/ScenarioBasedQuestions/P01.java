package com.gyanaranjan.ScenarioBasedQuestions;
/*  Read Csv data from file and process through java Stream Api (java8) ,grouping by Tract. data
* by Transaction id and convert Traction data as json.
*/


import java.nio.file.Files;
import java.nio.file.Path;

class P01 {
     public static void main(String[] args) {
         // Read  Csv file
         Path path = Path.of("");
         if(Files.exists(path)){
              
         }else {
             System.out.println("File s not Exist ");
         }
     }

}
