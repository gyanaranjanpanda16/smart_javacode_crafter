package com.gyanaranjan.FileIO;

import java.io.File;
import java.io.IOException;

class Program01 {
     public static void main(String[] args) throws IOException {
        // FILE :--
        // FILE - WRITER :--
        // FILE- READER :--
        // BUFFER WRITER :--
        // BUFFER READER :--
         File f = new File("C:\\Users\\gyanaranjanpanda\\Desktop\\a.mp4");
//         f.createNewFile();
         f.mkdir();
         System.out.println(f.exists());



     }
}
