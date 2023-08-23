package Buoi_07;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        // Access modify

        // thuoc tinh la bien, p
        // java khong cho phep da ke thua do ====>> nguyen tac thiet ke cua Java
        // Ke thua da cap: single, multilevel, hier

        Student.changeScore(8);
        Student studentName = new Student("Van Anh");
        System.out.println(studentName.getName());

        studentName.setName("Manh Dung");
        System.out.println(studentName.getName());
    }
}
