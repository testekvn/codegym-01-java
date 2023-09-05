package Buoi_08;

public class Bao extends TaiLieu{
    int ngayPhatHanh;

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public Bao(){
        super();
    }
    public Bao(int maTaiLieu, String nhaXuatBan, int soPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap ngay phat hanh: ");
        ngayPhatHanh = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", maTaiLieu=" + maTaiLieu +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }
}
