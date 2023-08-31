package Buoi_08;

public class TapChi extends TaiLieu {
    int thangPhatHanh;

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    public TapChi(){
        super();
    }

    public TapChi(int maTaiLieu, String nhaXuatBan, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soPhatHanh);
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap thang phat hanh: ");
        thangPhatHanh = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String
    toString() {
        return "TapChi{" +
                "thangPhatHanh=" + thangPhatHanh +
                ", maTaiLieu=" + maTaiLieu +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }
}
