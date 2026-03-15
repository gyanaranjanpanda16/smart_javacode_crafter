package com.gyanaranjan.FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class Program02 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\gyanaranjanpanda\\Desktop\\a.txt");
        fileWriter.write(567);
    }
}
