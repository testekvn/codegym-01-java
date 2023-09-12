package Buoi_10.Jame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        String filePath = "C:/Users/minh/IdeaProjects/codegym-01-java/src/Buoi_10/Jame/file.txt";
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("line:" + line);
            }
        } catch (IOException e) {
            System.out.println("" + e);

        }
    }
}
