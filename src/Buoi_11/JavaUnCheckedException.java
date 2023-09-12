package Buoi_11;

public class JavaUnCheckedException extends RuntimeException {
    public JavaUnCheckedException(String msg) {
        super(msg);
        System.out.println("This is JavaUnCheckedException: " + msg);
    }
}
