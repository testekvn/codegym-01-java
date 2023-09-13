package Buoi_09.QuanLyKhuPho;

import java.util.ArrayList;
import java.util.List;

/**
 Hãy xây dựng lớp Nguoi để quản lý thông tin của mỗi cá nhân.
 Xây dựng lớp HoGiaDinh để quản lý thông tin của từng hộ gia đình.
 Xây dựng lớp KhuPho để quản lý các thông tin của từng hộ gia đình.
 Nhập n hộ dân. (n nhập từ bàn phím), hiển thị thông tin của các hộ trong khu phố.
 */
public class QuanLyKhuPho {
    public static void main(String[] args) {
        // region Them moi thanh vien
        Person memberFirst = new Person("Van Anh", "22", "Tester");
        Person memberSecond = new Person("Minh Anh", "22", "Developer");
        Person memberThird = new Person("Huyen Anh", "23", "Banker");

        List<Person> personList = new ArrayList<>();
        personList.add(memberSecond);
        personList.add(memberFirst);
        personList.add(memberThird);

        System.out.println("Danh sach thanh vien: " + personList);
        // endregion

        // region Them moi ho gia dinh
        HoGiaDinh hoGiaDinh1 = new HoGiaDinh("181 Tran Quoc Vuong", personList);
        HoGiaDinh hoGiaDinh2 = new HoGiaDinh("56 Cau Giay", personList);

        List<HoGiaDinh> hoGiaDinhList = new ArrayList<>();
        hoGiaDinhList.add(hoGiaDinh1);
        hoGiaDinhList.add(hoGiaDinh2);

        System.out.println("Danh sach ho gia dinh: " + hoGiaDinhList);
        Person personFourth = new Person("Quynh Anh", "32", "Teacher");
        hoGiaDinh1.addPerson(personFourth);

        System.out.println("Ho gia dinh moi them thanh vien: " + hoGiaDinh1);
        System.out.println("So luong thanh vien cua ho gia dinh moi: " + hoGiaDinh1.getSoLuongThanhVien());
        // endregion


        // region Them moi khu pho
        List<HoGiaDinh> khuPhoList = new ArrayList<>();
        khuPhoList.add(hoGiaDinh1);
        KhuPho khuPho = new KhuPho(khuPhoList);
        System.out.println("Khu pho: " + khuPho.getListHoGiaDinh());

        // endregion
    }
}
