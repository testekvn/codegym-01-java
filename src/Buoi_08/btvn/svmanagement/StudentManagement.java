package Buoi_08.btvn.svmanagement;

import java.util.*;

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

        boolean isFakeData = true;
        if (!isFakeData) {
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
        } else {
            students = fakeDataForTesting();
        }


        // Handle Logic
        List<GoodStudent> goodStudents = new ArrayList<>();
        List<NormalStudent> normalStudents = new ArrayList<>();
        for (Student v : students) {
            if (v instanceof GoodStudent) {
                goodStudents.add((GoodStudent) v);
            }
            if (v instanceof NormalStudent) {
                normalStudents.add((NormalStudent) v);
            }
        }

        // Sap xep hoc sinh Gioi theo diem GPA giam dan va Ho ten tang dan
        System.out.println("VDebug - Before\n" + goodStudents);
        Collections.sort(goodStudents, Comparator.comparingDouble(GoodStudent::getGpa).reversed()
                .thenComparing(GoodStudent::getFullName));
        System.out.println("VDebug - After\n" + goodStudents);

        // Sap xep hoc sinh Trung binh theo diem thi dau vao giam dan, diem TOEIC giam dan va ho ten tang dan
        System.out.println("VDebug - Before\n" + normalStudents);
        Collections.sort(normalStudents, Comparator.comparingDouble(NormalStudent::getEntryTestScore)
                .thenComparingInt(NormalStudent::getEnglishScore).reversed()
                .thenComparing(NormalStudent::getFullName));
        System.out.println("VDebug - After\n" + normalStudents);

        System.out.print("\nPlease input the number of candidate: ");
        int numOfCandidate = sc.nextInt();
        System.out.println("\nThe candidates: ");

        if (numOfCandidate < goodStudents.size()) {
            // Neu so luong candidate can lay < so luong HS Gioi -> In ra danh sach tu 0 toi so luong candidate can lay
            for (int i = 0; i < numOfCandidate; i++) {
                System.out.println(goodStudents.get(i));
            }
        } else {
            // Neu so luong candidate > so luong HS Gioi -> In ra toan bo danh sach hoc sinh gioi va tinh so luong candidate can lay o HD TB
            for (GoodStudent goodStudent : goodStudents) {
                System.out.println(goodStudent);
            }

            int remainingCandidate = numOfCandidate - goodStudents.size();
            // Tuong tu voi HS Gioi, ta co so luong HS TB can lay
            if (remainingCandidate < normalStudents.size()) {
                for (int i = 0; i < remainingCandidate; i++) {
                    System.out.println(normalStudents.get(i));
                }
            } else {
                for (NormalStudent normalStudent : normalStudents) {
                    System.out.println(normalStudent);
                }
            }
        }
    }


    /**
     * Fake Data for Testing.
     * @return The a student list
     */
    public static List<Student> fakeDataForTesting() {
        List<Student> students = new ArrayList<>();
        students.add(new GoodStudent("Nguyen Van A", "01/01/2000", "Nam", "0912345678", "KMA", "Gioi", 8.5f, "Sinh vien gioi"));
        students.add(new GoodStudent("Nguyen Van B", "12/12/2000", "Nam", "0912345678", "KMA", "Gioi", 8.6f, "Sinh vien gioi"));
        students.add(new GoodStudent("Nguyen Van C", "12/12/2000", "Nam", "0912345678", "KMA", "Gioi", 8.9f, "Sinh vien gioi"));
        students.add(new GoodStudent("Nguyen Van D", "12/12/2000", "Nam", "0912345678", "KMA", "Gioi", 8.5f, "Sinh vien gioi"));
        students.add(new GoodStudent("Nguyen Ngoc Nam", "12/12/2000", "Nam", "0912345678", "KMA", "Gioi", 9.0f, "Sinh vien gioi"));
        students.add(new GoodStudent("Nguyen Ngoc Tuan", "12/12/2000", "Nam", "0912345678", "KMA", "Gioi", 9.0f, "Sinh vien gioi"));
        students.add(new GoodStudent("Nguyen Thi Ngan", "12/12/2000", "Nam", "0912345678", "KMA", "Gioi", 8.1f, "Sinh vien gioi"));
        students.add(new NormalStudent("Nguyen Van F", "12/12/2000", "Nam", "0350000000", "HLU", "Khá", 650, 7.4f));
        students.add(new NormalStudent("Nguyen Van H", "12/12/2000", "Nam", "0350000000", "HLU", "Khá", 550, 7.2f));
        students.add(new NormalStudent("Nguyen Anh Toan", "12/12/1999", "Nam", "0350000000", "HLU", "Khá", 550, 7.2f));
        students.add(new NormalStudent("Nguyen Van I", "12/12/2000", "Nam", "0350000000", "HLU", "Khá", 700, 7.5f));
        students.add(new NormalStudent("Nguyen Van Khoa", "12/12/2000", "Nam", "0350000000", "HLU", "Khá", 900, 9.1f));
        students.add(new NormalStudent("Nguyen Van Cuong", "12/12/2000", "Nam", "0350000000", "HLU", "Khá", 800, 9.1f));
        students.add(new NormalStudent("Nguyen Thi A", "12/12/2000", "Nam", "0350000000", "HLU", "Khá", 750, 7.5f));
        return students;
    }


}
