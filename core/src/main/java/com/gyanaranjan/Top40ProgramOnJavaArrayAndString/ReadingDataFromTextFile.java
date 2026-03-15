package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromTextFile {
    public static void main(String[] args) throws IOException {
       // Approach :1 :-  use file reader or Buffer Reader
        FileReader fr = new FileReader("C:\\Users\\gyanaranjanpanda\\Desktop\\read.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);
        String str;
       while((str=bufferedReader.readLine())!=null){
           System.out.println(str);
       }
       bufferedReader.close();

    }
}
