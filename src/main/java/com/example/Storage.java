package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public static void writeContent(String line){
        try {
            tryWriteContent(line);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void tryWriteContent(String line) throws IOException{
        FileWriter fileWriter = new FileWriter("adat.txt", true);
        fileWriter.write(line + "\n");
        fileWriter.close();
    }
}
