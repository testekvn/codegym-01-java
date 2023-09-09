package Buoi_11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "/Users/nguyenvananh/AutoTest/codegym-01-java/src/Buoi_11/Text.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println("Line: " + line);
            }
        } catch (Exception e){
            System.out.println("Exception " + e);
        }
    }
}
