package Buoi_10.CD;

public class Cd {
    private int idCD;
    private String tuaCD;
    private String caSi;
    private int soBaiHat;
    private int giaThanh;

    public Cd(int idCD, String tuaCD, String caSi, int soBaiHat, int giaThanh) {
        this.idCD = idCD;
        this.tuaCD = tuaCD;
        this.caSi = caSi;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getIdCD() {
        return idCD;
    }

    public void setIdCD(int idCD) {
        this.idCD = idCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public int getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "idCD=" + idCD +
                ", tuaCD='" + tuaCD + '\'' +
                ", caSi='" + caSi + '\'' +
                ", soBaiHat=" + soBaiHat +
                ", giaThanh=" + giaThanh +
                '}';
    }

    public Cd() {
        super();
    }
    public void Show(){
        System.out.println(this.toString());
    }
}
