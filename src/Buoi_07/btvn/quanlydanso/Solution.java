package Buoi_07.btvn.quanlydanso;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // 1. Tao Person
        Person vAnh = new Person("V.Anh", 22, "Sinh vieen", "22");
        Person mDung = new Person("M.Dung", 23, "Di lam", "23");


        // Tao danh sach cac thanh vien
        List<Person> vFa = new ArrayList<>();
        vFa.add(vAnh);
        vFa.add(mDung);

        System.out.println("Danh sach:\n" + vFa);

        // 2. Tao Family
        Family family = new Family("BT_666",vFa );
        System.out.println("Num Of Person: " + family.getNumOfPerson());

        // Add new person
        Person dAnh = new Person("D.Anh",3,"Hoc sinh","3");
        family.addPerson(dAnh);
        System.out.println("Num Of Person - Added: " + family.getNumOfPerson());

        // 3. Tao khu pho
        List<Family> vKhupho = new ArrayList<>(); // Tao danh sach cac ho gia dinh
        vKhupho.add(family);
        vKhupho.add(family);
        vKhupho.add(family);
        KhuPho khuPho = new KhuPho(vKhupho);
        System.out.println("Khu Pho List: " + khuPho.getFamilyList());
    }
}
