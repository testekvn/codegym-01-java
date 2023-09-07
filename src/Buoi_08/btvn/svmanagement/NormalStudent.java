package Buoi_08.btvn.svmanagement;

/**
 * Hoc sinh trung binh
 */
public class NormalStudent extends Student {
    private int englishScore;
    private float entryTestScore;

    public NormalStudent(int englishScore, float entryTestScore) {
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, float entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                super.toString() +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                '}';
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public float getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }
}
