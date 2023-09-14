package Buoi_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        String filePath = "C:\\Users\\Admin\\codegym-01-java\\src\\Buoi_09\\ListStudent.txt";
        try  {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) !=null) {
                System.out.println("Line: " + line);
            }
        }catch (Exception e){
            System.out.println(" "+e);
        }
//duyệt vòng for đẻ đặt vé

    }
}
