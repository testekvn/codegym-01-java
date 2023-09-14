package Buoi_12.KiemTra;

public class Experience extends Employee {
    private int explnYear;
    private String proSkill;

    public Experience() {

    }

    public Experience(int explnYear, String proSkill) {
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }

    public Experience(String empCode, String fullName, String doB, String email, String empType, String empCertificates, int explnYear, String proSkill) {
        super(empCode, fullName, doB, email, empType, empCertificates);
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }

    public float getExplnYear() {
        return explnYear;
    }

    public void setExplnYear(int explnYear) {
        this.explnYear = explnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                super.toString() +
                "explnYear=" + explnYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
    public void showInfo(){
        System.out.println(this.toString());
    }
}
