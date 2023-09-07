package Buoi_09.qlsv;

public class GoodStudent extends Student {
    //region Fields GoodStudent
    double gpa;             //Điểm trung bình học tập
    String bestRewardName;  //Học bổng(giải thưởng)
    //endregion
    public GoodStudent(String fullName, String dob, String sex, String phoneNumber, String universityName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullName, dob, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void ShowMyInfor() {
        System.out.println("Thông tin GoodStudent");
        super.ShowMyInfor();
        System.out.println("Điểm trung bình học tập: "+gpa);
        System.out.println("Học bổng(giải thưởng): "+bestRewardName);
    }

    @Override
    public String studentType() {
        return "1";
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        //double gpaComp = ((GoodStudent) student).getGpa();
//        int gpaCompare = Double.compare(this.gpa, student.getGpa);
//        if (gpaCompare != 0) {
//            return -gpaCompare;
//        }
        return fullName.compareTo(student.getFullName());
    }
}
