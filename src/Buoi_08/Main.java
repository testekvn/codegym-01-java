package Buoi_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        System.out.println("Nhap loai tai lieu (sach / tapchi / bao): ");
        Scanner sc = new Scanner(System.in);
        String typeDoc = sc.nextLine();
        if (typeDoc.equalsIgnoreCase("sach")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập số lượng sách: ");             //Nhập số lượng sách cần nhập
            int n = scanner.nextInt();
            List<Sach> sachList = null;                                     //Khởi tạo danh sách trống
            sachList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.println("Cuốn sách số: " + (i + 1));
                Sach sach = new Sach();
                sach.input();
                sachList.add(sach);                                         //Thêm vào danh sách
            }
            System.out.println("Danh sách: \n"+sachList);                   //Hiển thị danh sách của tài liệu sách
            System.out.println("Nhập mã sách muốn xóa: ");                  //Nhập mã số sách cần xóa theo số thự tự index trong danh sách
            Scanner deleteBook = new Scanner(System.in);
            int k = deleteBook.nextInt();
            sachList.remove((k-1));                                         //Xóa sách theo số thứ tự index
            System.out.println("Danh sách: \n"+sachList);                   //Danh sách tài liệu sách sau khi xóa
        } else if (typeDoc.equalsIgnoreCase("tap chi")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập số lượng tạp chí: ");
            int n = scanner.nextInt();
            List<Sach> tapChiList = null;
            tapChiList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.println("Cuốn tạp chí số: " + (i + 1));
                Sach sach = new Sach();
                sach.input();
                tapChiList.add(sach);
            }
            System.out.println("Danh sách: \n"+tapChiList);
            System.out.println("Nhập mã sách muốn xóa: ");
            Scanner deleteBook = new Scanner(System.in);
            int k = deleteBook.nextInt();
            tapChiList.remove((k-1));
            System.out.println("Danh sách: \n"+tapChiList);
        } else if (typeDoc.equalsIgnoreCase("bao")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập số lượng tờ báo: ");
            int n = scanner.nextInt();
            List<Sach> baoList = null;
            baoList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.println("Báo số: " + (i + 1));
                Sach sach = new Sach();
                sach.input();
                baoList.add(sach);
            }
            System.out.println("Danh sách: \n" + baoList);
            System.out.println("Nhập mã sách muốn xóa: ");
            Scanner deleteBook = new Scanner(System.in);
            int k = deleteBook.nextInt();
            baoList.remove((k-1));
            System.out.println("Danh sách: \n" + baoList);
        }
    }
}