package Buoi_08.btvn.svmanagement;

/**
 * Hoc sinh trung binh
 */
public class NormalStudent extends Student {
    private int englishScore;
    private float entryTestScore;

    public NormalStudent(){}
    public NormalStudent(int englishScore, float entryTestScore) {
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, float entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }


    public int getEnglishScore() {
        return englishScore;
    }

    /**
     * Set toeic score. Default value: 500
     */
    public void setEnglishScore(int englishScore) {
        if ((englishScore < 0 || englishScore > 990) && (englishScore % 5) != 0) {
            englishScore = 500; // Default value for TOEIC
        }
        this.englishScore = englishScore;
    }

    public float getEntryTestScore() {
        return entryTestScore;
    }

    /**
     * Set entry test score in range [0,10]. Default value: 5.0
     *
     * @param entryTestScore : the test score
     */
    public void setEntryTestScore(float entryTestScore) {
        if (entryTestScore < 0 || entryTestScore > 10) {
            entryTestScore = 5.0f;
        }
        this.entryTestScore = entryTestScore;
    }


    @Override
    public String toString() {
        return "NormalStudent{" +
                super.toString() +
                ", englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                '}';
    }
    public void ShowMyInfo() {
        System.out.println(this.toString());
    }

}
