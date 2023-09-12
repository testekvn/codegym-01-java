package Buoi_11;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class JavaCheckedException extends java.lang.Exception {
    public JavaCheckedException(String msg) {
        super(msg);
        System.out.println("This is Java Exception");
    }
}
