package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.io.*;

public class WritingDataToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("C:\\Users\\gyanaranjanpanda\\Desktop\\read.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fr);
        bufferedWriter.write("hii i good in Java");
        bufferedWriter.write("Hello, do you know im good in Spring-Boot");
        bufferedWriter.write("also good in Micro-Services");


        System.out.println("Finish Task Completed :-->");
        bufferedWriter.close();
    }
}
