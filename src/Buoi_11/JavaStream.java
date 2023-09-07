package Buoi_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaStream {
    public static void main(String[] args) {
        String filePath ="E:\\Intellij\\codegym-01-java\\src\\Buoi_11\\listMember";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Exception: "+e);
        }
    }
}
