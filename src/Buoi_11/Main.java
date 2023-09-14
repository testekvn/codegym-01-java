package Buoi_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        String filePath = "C:/Users/minh/IdeaProjects/codegym-01-java/src/Buoi_11/nyc.txt";
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
        //duyẹt vòng for để làm đặt vé
    }
}
