package Buoi_12;

import java.util.Date;

public class Fresher extends Employee {
    private Date graduationDate;
    private String graduationRank;

    public Fresher() {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                '}';
    }
}
