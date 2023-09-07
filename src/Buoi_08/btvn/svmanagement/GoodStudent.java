package Buoi_08.btvn.svmanagement;

/**
 * Hoc sinh kha, gioi
 */
public class GoodStudent extends Student {
    private float gpa;
    private String bestRewardName;
    public GoodStudent(){}
    public GoodStudent(float gpa, String bestRewardName) {
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, float gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public float getGpa() {
        return gpa;
    }

    /**
     * Set gpa score in range [0,10]. Default value: 5.0
     *
     * @param gpa : the test score
     */
    public void setGpa(float gpa) {
        if (gpa < 0 || gpa > 10) {
            gpa = 5.0f;
        }
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
        return "GoodStudent{" +
                super.toString() +
                ", gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
                '}';
    }

    public void ShowMyInfo() {
        System.out.println(this.toString());
    }

}
