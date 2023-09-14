package Buoi_12.cau2;

public class Experience extends Employee{
    //region Fields of Experience
    double expInYear;   //So nam kinh nghiep
    String proSkill;    //Ky nang chuyen mon

    public Experience(String id, String name, int rank, String empCode, String fullName, String doB, String email, int empType, double expInYear, String proSkill) {
        super(id, name, rank, empCode, fullName, doB, email, empType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    //endregion

    public double getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(double expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }



    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("So nam kinh nghiem: "+expInYear);
        System.out.println("Ky nang chuyen mon: "+proSkill);
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                ", empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType=" + empType +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
