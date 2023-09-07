package Buoi_08.btvn.svmanagement;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Class quan ly hoc sinh va giai quyet bai toan
 */
public class StudentManagement {
    public static void main(String[] args) throws InvalidDOBException, InvalidPhoneNumberException {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("-----------------------------------------------------");
        System.out.println("Student Management Application\nDeveloped by Vincent");

        System.out.print("START this program:\n" +
                "1. Please input the number of student in range [11,15] and default 12: ");
        // Number of student
        String numOfStudentStr = sc.nextLine();
        int numOfStudents = 12;
        try {
            numOfStudents = Integer.parseInt(numOfStudentStr);
            if (numOfStudents < 11 || numOfStudents > 15)
                System.out.println("Your data is incorrect, the number of student will be 12 (default value)");
        } catch (Exception e) {
            System.out.println("VDebug - NumOfStudent: " + e);
            System.out.println("Your data is incorrect, the number of student will be 12 (default value)");
        }

        // Input the student information
        int studentCount = 1;
        String studentType;
        System.out.println("Please input student information");

        while (studentCount <= numOfStudents) {
            System.out.printf("\nStudent: %s \nSelect student type (1 - For Normal, otherwise for Good): ", studentCount);
            ++studentCount;
            studentType = sc.nextLine();

            Student student = studentType.equalsIgnoreCase("1") ? new NormalStudent() : new GoodStudent();

            // Input student information
            System.out.print("\tEnter full name :");
            student.setFullName(DataValidation.ensureValidFullName(sc));

            System.out.print("\tEnter birthday (Format: dd/MM/yyyy) :");
            student.setDoB(DataValidation.ensureValidDate(sc));

            System.out.print("\tEnter gender:");
            String gender = sc.nextLine();
            student.setGender(gender);

            System.out.print("\tEnter phone number:");
            student.setPhoneNumber(DataValidation.ensureValidPhoneNumber(sc));

            System.out.print("\tEnter university:");
            student.setUniversityName(sc.nextLine().trim());

            System.out.print("\tEnter grade level:");
            student.setGradeLevel(sc.nextLine().trim());

            // Input other
            if (studentType.equalsIgnoreCase("1")) {
                // Input for Normal Student
                System.out.println("\tThis is Normal Student, please add more info:");
                System.out.print("\t\tEnter TOEIC score:");
                ((NormalStudent) student).setEnglishScore(Integer.parseInt(sc.nextLine().trim()));

                System.out.print("\t\tEnter entry test score:");
                ((NormalStudent) student).setEntryTestScore(Float.parseFloat(sc.nextLine().trim()));
            } else {
                // Input for Good Student
                System.out.println("\tThis is Good Student, please add more info:");
                System.out.print("\t\tEnter GPA score:");
                ((GoodStudent) student).setGpa(Float.parseFloat(sc.nextLine().trim()));

                System.out.print("\t\tEnter best reward name:");
                ((GoodStudent) student).setBestRewardName(sc.nextLine().trim());

            }
            student.ShowMyInfo();
            students.add(student);
        }

        // Handle Logic
        int numOfCandidate = 3;
        List<GoodStudent> goodStudents = new ArrayList<>();
        for (Student v : students) {
            if (v instanceof GoodStudent) {
                goodStudents.add((GoodStudent) v);
            }
        }

        Collections.sort(goodStudents, Comparator.comparing(GoodStudent::getGpa).thenComparing(GoodStudent::getFullName));
    }


}
