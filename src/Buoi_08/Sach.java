package Buoi_08;

public class Sach extends TaiLieu {
    String tacGia;
    int soTrang;

    public Sach() {
        super();
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach(int maTaiLieu, String nhaXuatBan, int soPhatHanh, String tacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soPhatHanh);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap ten tac gia: ");
        tacGia = scanner.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                ", maTaiLieu=" + maTaiLieu +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }
}
