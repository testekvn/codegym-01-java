package Buoi_07.ManagementStudent;

/**
 * Sinh viên loại khá giỏi phải có thêm thông tin:
 * điểm trung bình học tập (gpa) theo thang điểm 10,
 * tên của loại học bổng (hoặc giải thưởng) cao nhất đã từng giành được (bestRewardName).
 */
public class ExcellentStudent extends Student{
    float gpa;
    String bestRewardName;
    public ExcellentStudent(String fullName, String sex, String phoneNumber, String universityName, String doB, String gradeLevel, float gpa, String bestRewardName) {
        super(fullName, sex, phoneNumber, universityName, gradeLevel, doB);
        this.bestRewardName = bestRewardName;
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public String toString() {
        return "ExcellentStudent{" +
                "gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", date of birthday='" + doB + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
    public ExcellentStudent() { }

    @Override
    public void ShowMyInfor() {
        super.ShowMyInfor();
        System.out.println("GPA: " + gpa );
        System.out.println("Best reward name: " + bestRewardName);
    }
}
