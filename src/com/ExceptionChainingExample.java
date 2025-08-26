package com;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionChainingExample {
	
    public static void readFile(String fileName) throws Exception {
        try {
            
            FileReader fr = new FileReader(fileName);
            fr.close();
        } catch (IOException ioe) {
            throw new Exception("Failed to read the file!", ioe);
        }
    }

    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }

}
