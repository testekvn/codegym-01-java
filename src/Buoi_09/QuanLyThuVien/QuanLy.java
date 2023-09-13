package Buoi_09.QuanLyThuVien;

import Buoi_07.QuanLySach.Document;

import java.util.*;

/**
 * Xây dựng các lớp để quản lý tài liệu cho thư viện một cách hiệu quả.
 * Xây dựng lớp QuanLySach chứa các tập dữ liệu (Dữ liệu tự tạo) có các chức năng sau
 *
 * Thêm mới tài liêu: Sách, tạp chí, báo.
 * Xoá tài liệu theo mã tài liệu.
 * Hiện thị thông tin về tài liệu.
 * Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
 */
public class QuanLy {
    public static void main(String[] args) {
        TaiLieu sach = new Sach("id", "Nha xuat ban 1", 1, "Nam Cao", 9);
        TaiLieu tapChi = new TapChi("12", "Nha xuat ban 2", 3, "Ngay 30/08");
        TaiLieu fashion = new TapChi("14", "Channel", 3, "Ngay 31/08");

        TaiLieu sachTruyenKieu = new Sach("13", "Nha xuat ban 1", 1, "Nguyen Du", 33);
        List<TaiLieu> listTaiLieu = new ArrayList<>();

        listTaiLieu.add(sach);
        listTaiLieu.add(tapChi);
        listTaiLieu.add(sachTruyenKieu);

        System.out.print("Danh sach tai lieu: " + listTaiLieu);

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhap id can xoa: ");
        String id = sc.nextLine();
        for ( TaiLieu a: listTaiLieu) {
            if (a.getId().equalsIgnoreCase(id)){
                listTaiLieu.remove(a);
                break;
            }
        }
        System.out.println("Danh sach sau khi xoa: " + listTaiLieu);

        // Tim kiem
        System.out.println("Nhap loai tai lieu can tim kiem: \nNhap 1: Sach \nNhap 2: Tap chi..");
        String typeDoc = sc.nextLine();
        Map<String, List<TaiLieu>> map = new HashMap<>();
        boolean check = true;
        for (TaiLieu document: listTaiLieu) {
            String searchType = document.type();
            if (searchType.equalsIgnoreCase(typeDoc)){
                List<TaiLieu> tmp;
                if (!map.containsKey(typeDoc)){
                    tmp = new ArrayList<>();
                } else {
                    tmp = map.get(typeDoc);
                }
                tmp.add(document);
                map.put(typeDoc, tmp);
                check = false;
            }
        }
        if (check){
            System.out.println("Nhap sai");
        } else {
            System.out.println(map.get(typeDoc));

        }

    }
}
