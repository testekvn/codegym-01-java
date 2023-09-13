package Buoi_12.DiaCD;

import java.util.Scanner;

/**Viết chương trình xây dựng đối tượng CD gồm có các thuộc tính sau:

 Mã CD là số nguyên.
 Tựa CD: chuỗi ký tự.
 Ca sỹ: chuỗi ký tự.
 Số bài hát: số nguyên (>0).
 Giá thành : số thực (>0).
 Các thuộc tính khai báo private, định nghĩa các phương thức get/set cho từng thuộc tính.

 Viết các constructor để khởi tạo đối tượng CD.

 Override phương thức toString của lớp Object.

 Xây dựng lớp lưu danh sách các CD (dùng mảng).

 Phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD và kích thước mảng còn cho phép.
 Tính số lượng CD có trong danh sách.
 Tình tổng giá thành của các CD.
 Phương thức sắp xếp danh sách giảm dần theo giá thành.
 Phương thức sắp xếp danh sách tăng dần theo tựa CD.
 Phương thức xuất toàn bộ danh sách
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong cua mang CD: ");
        int soLuong = sc.nextInt();
        DiaCD[] arrListCD = new DiaCD[soLuong];
        int count=0;
        while (count < soLuong){
                System.out.println("Nhap thong tin cua dia thu: " + (count+1));
                System.out.print("Nhap id: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap tua CD: ");
                String tuCD = sc.nextLine();
                System.out.println("Nhap Ca si: ");
                String singer = sc.nextLine();
                System.out.println("Nhap bai hat: ");
                int numberOfSong = sc.nextInt();
                System.out.println("Nhap gia thanh: ");
                float price = sc.nextFloat();
                DiaCD diaCD = new DiaCD(id, tuCD, singer, numberOfSong, price);
                arrListCD[count] = diaCD;// gan vi tri cd = DiaCD duoc khoi tao
            count++;
        }
        for (DiaCD a : arrListCD) {
            System.out.println(a.toString());;
        }

        System.out.println("So luong: " + arrListCD.length);

        float sum=0;
        for (int i = 0; i < soLuong; i++) {
            sum += arrListCD[i].getPrice();
        }
        System.out.println(sum);

        System.out.println("Sap xep");
        DiaCD cd = new DiaCD();
        for (int i = 0; i < soLuong; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (arrListCD[i].getPrice() > arrListCD[j].getPrice()){
                    cd = arrListCD[i];
                    arrListCD[i] = arrListCD[j];
                    arrListCD[j] = cd;
                }
            }
        }
        for (DiaCD a : arrListCD) {
            System.out.println(a.toString());
        }

    }

}
