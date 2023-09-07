package Buoi_08.btvn.svmanagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DataValidation {
    /**
     * Input and validate full name
     */
    public static String ensureValidFullName(Scanner sc) {
        String result;
        byte count = 0;
        while (count < 3) {
            result = sc.nextLine();
            if (result.trim().length() < 10 || result.trim().length() > 50) {
                System.err.println("Student's FullName is invalid, please retry!!!");
                count++;
            } else return result;
        }
        System.err.println("Over 3 times");
        System.exit(0);
        return null;
    }

    /**
     * Validate the date
     */
    public static String ensureValidDate(Scanner sc) throws InvalidDOBException {
        String date = sc.nextLine();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateFormat.parse(date);
            return date;
        } catch (Exception e) {
            throw new InvalidDOBException("The DoB is invalid. Exit Program");
        }
    }

    /**
     * Validate SDT
     *
     * @param text
     */
    public static String ensureValidPhoneNumber(Scanner sc) throws InvalidPhoneNumberException {
        String phoneNumber = sc.nextLine().trim();
        final String SDT_REGEX = "^(090|098|091|031|035|038)?\\d{7}$";
        if (phoneNumber.matches(SDT_REGEX)) {
            return phoneNumber;
        } else throw new InvalidPhoneNumberException("The phone number is invalid");

        // Su dung contains
//        List<String> phoneConcepts = Arrays.asList("090", "098", "091", "031", "035", "038");
//        boolean isPhone = false;
//        for (String phonePrefix : phoneConcepts) {
//            if (phoneNumber.contains(phonePrefix)) {
//                isPhone = true;
//                break;
//            }
//        }
    }

    /**
     * Input and validate integer number
     */
    public int enterAndValidateInt(int limitHi, int limitLo) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        byte countEnterWro = 0;
        while (countEnterWro < 3) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number < limitLo || number > limitHi) {
                    System.err.println("Input files have unknow errors !!!");
                    countEnterWro++;
                } else return number;
            } catch (NumberFormatException e) {
                System.err.println("Enter number");
                countEnterWro++;
            }
        }
        System.err.println("Enter wrong number over 3 times.");
        System.exit(0);
        return number;
    }

    /**
     * Input and validate float number
     */
    public float enterAndValidateFloat(float limitHi, float limitLo) {
        Scanner scanner = new Scanner(System.in);
        float number = 0f;
        byte countEnterWro = 0;
        while (countEnterWro < 3) {
            try {
                number = Float.parseFloat(scanner.nextLine());
                if (number < limitLo || number > limitHi) {

                    System.err.println("Input files have unknow errors !!!");
                    countEnterWro++;
                } else return number;
            } catch (NumberFormatException e) {
                System.err.println("Enter number");
                countEnterWro++;
            }
        }
        System.err.println("Enter wrong number over 3 times.");
        System.exit(0);
        return number;
    }

    /**
     * Input and validate a string
     */
    public String enterAndValidateString() {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        byte countEnterWro = 0;
        while (countEnterWro < 3) {
            text = scanner.nextLine();
            if (text.trim().isEmpty()) {
                System.err.println("Invalid string.");
                countEnterWro++;
            } else return text;
        }
        System.err.println("Enter wrong number over 3 times.");
        System.exit(0);
        return text;
    }

}
