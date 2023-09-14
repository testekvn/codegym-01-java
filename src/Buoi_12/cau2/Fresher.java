package Buoi_12.cau2;

public class Fresher extends Employee{
    //region Fields of Fresher
    String graduationDate;  //Thoi gian tot nghiep
    String graduationRank; //Xep loai tot nghiep

    public Fresher(String id, String name, int rank, String empCode, String fullName, String doB, String email, int empType, String graduationRank, String graduationDate) {
        super(id, name, rank, empCode, fullName, doB, email, empType);
        this.graduationRank = graduationRank;
        this.graduationDate = graduationDate;
    }
    //endregion

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }



    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Thoi gian tot nghiep: "+graduationDate);
        System.out.println("Xep loai tot nghiep: "+graduationRank);
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
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
