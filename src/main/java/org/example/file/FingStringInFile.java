package org.example.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FingStringInFile {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath="src/main/java/org/example/file/input.txt";
        String searchString="value";

        System.out.println(isStringExist(filePath,searchString));//true
        readAllValueFromFile(filePath);
    }

    private static void readAllValueFromFile(String filePath) throws FileNotFoundException {
        File file=new File(filePath);
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println("All Value from file=> \n" + scanner.nextLine()); //some value for reading
        }
    }

    private static boolean isStringExist(String filePath, String searchString) throws FileNotFoundException {

        File file=new File(filePath);
        Scanner scanner=new Scanner(file);

        while (scanner.hasNextLine()){
            String line =scanner.nextLine();
            if (line.contains(searchString)){
                scanner.close();
                return true;
            }
        }
        scanner.close();
        return false;
    }
}
