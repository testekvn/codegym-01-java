package Buoi_11;

public class Phanlop {
    private float tuSo;
    private float mauSo;

    public Phanlop(float tu, float mau) {
        this.tuSo = tu;
        this.mauSo = mau;
    }

    public static void main(String[] args) {
        Phanlop phanlop = new Phanlop(2f,3f);
        Phanlop phanlop2 = new Phanlop(5f,3f);
        System.out.println(phanlop.sum(phanlop, phanlop2));
    }

    public float sum(Phanlop phanlop, Phanlop phanlop2) {
        return (phanlop.tuSo/phanlop.mauSo)+(phanlop2.tuSo/ phanlop2.mauSo);
    }
}
