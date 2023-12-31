package Buoi_07.ManagementStudent;

/**
 * Sinh viên loại trung bình thì phải có thêm các thông tin:
 * điểm TOEIC (englishScore),
 * điểm thi đầu vào chuyên môn do công ty tổ chức thi (entryTestScore) theo thang điểm 10.
 */
public class AverageStudent extends Student{
    float englishScore;
    float entryTestScore;
    public AverageStudent(String fullName, String sex, String phoneNumber, String universityName, String gradeLevel, float englishScore, float entryTestScore) {
        super(fullName, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public float getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(float englishScore) {
        this.englishScore = englishScore;
    }

    public float getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public String toString() {
        return "AverageStudent{" +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                ", fullName='" + fullName + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }

    @Override
    public void ShowMyInfor() {
        super.ShowMyInfor();
        System.out.println("Toeic' score: " + englishScore);
        System.out.println("điểm thi đầu vào chuyên môn do công ty tổ chức thi:" + entryTestScore);
    }
}
