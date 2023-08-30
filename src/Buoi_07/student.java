package Buoi_07;

public class student extends perSon {
    private final String name;
    double gpa;
        public student(String name, int age, String address, double gpa) {
            super(name, age, address);
            this.name = name;
            this.gpa = gpa;
        }
        public double getGpa(){
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
            System.out.println("Update GPA!");
        }

        @Override
        public void display() {
            super.display();
            System.out.println("GPA: "+ gpa);
            System.out.println("==============================================");
        }
    }

