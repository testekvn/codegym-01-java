package Buoi_12.DiaCD;

/**
 * Viết chương trình xây dựng đối tượng CD gồm có các thuộc tính sau:
 *
 * Mã CD là số nguyên.
 * Tựa CD: chuỗi ký tự.
 * Ca sỹ: chuỗi ký tự.
 * Số bài hát: số nguyên (>0).
 * Giá thành : số thực (>0).
 * Các thuộc tính khai báo private, định nghĩa các phương thức get/set cho từng thuộc tính.
 */
public class DiaCD {
    private int id;
    private String tuCD;
    private String singer;
    private int numberOfSong;
    private float price;

    public DiaCD(){ }
    @Override
    public String toString() {
        return "DiaCD{" +
                "id='" + id + '\'' +
                ", tuCD='" + tuCD + '\'' +
                ", singer='" + singer + '\'' +
                ", numberOfSong=" + numberOfSong +
                ", price=" + price +
                '}';
    }

    public DiaCD(int id, String tuCD, String singer, int numberOfSong, float price) {
        this.id = id;
        this.tuCD = tuCD;
        this.singer = singer;
        this.numberOfSong = numberOfSong;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTuCD() {
        return tuCD;
    }

    public void setTuCD(String tuCD) {
        this.tuCD = tuCD;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumberOfSong() {
        return numberOfSong;
    }

    public void setNumberOfSong(int numberOfSong) {
        this.numberOfSong = numberOfSong;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
