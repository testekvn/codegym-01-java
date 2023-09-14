package Buoi_11;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class docfile {
    public static void main(String[] args) {
        String fileXpath = "C:\\Users\\pc\\codegym-01-java\\src\\Buoi_11\\file1";
        try {
            FileReader reader = new FileReader(fileXpath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line: " + line);
            }

        } catch (IOException e) {
            System.out.println(" co ex xay ra" + e);
        }
    }

}
