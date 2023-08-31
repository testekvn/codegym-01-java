package Buoi_07.manageLibrary;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Scanner;

public class manageLibrary {
    public static void main(String[] args) {
        //1. Tao tai lieu
        document book = new book(10, "NXB Kim Dong", 1, "Nam Cao", 100);
        document magazine = new magazine(20, "NXB Alpha", 2, "Thoi Trang", 2);
        document newsPaper = new newsPaper(30, "NXB Giao Duc", 3, "08/29/2023");

        //2. Them moi tai lieu
        List<document> documentList = new ArrayList<>();
        documentList.add(book);
        documentList.add(magazine);
        documentList.add(newsPaper);

        //3. Hien thi danh sach tai lieu
        System.out.println("Danh sach tai lieu:\n"+documentList);

        //4. Xoa tai lieu theo ma tai lieu
        System.out.println("Nhap ma tai lieu can xoa: ");
        Scanner sc = new Scanner(System.in);
        int codeOfDelete = sc.nextInt();
        for (document indexOfCode: documentList){
            if (indexOfCode.getDocCode() == codeOfDelete){
                documentList.remove(indexOfCode);
                break;
            }
        }
        System.out.println("Danh sach tai lieu sau khi xoa tai lieu:\n"+documentList);

        //5. Tim kiem tai lieu theo loai: Sach, bao, tap chi
        System.out.println("Nhap loai tai lieu can tim kiem: ");
        String typeDoc = sc.nextLine();
        if (typeDoc.equalsIgnoreCase("sach")){
            System.out.println("Sach:\n"+ "Ma tai lieu-"+ book.getDocCode() +" Nha phat hanh-"+book.getPublisherName()+" So phat hanh-"+book.getIssueNum()+" Ten tac gia-"+ ((book) book).getAuthorName()+" So trang-"+((book) book).getPageNum());
        } else if (typeDoc.equalsIgnoreCase("tap chi")) {
            System.out.println("Tap chi:\n"+ "Ma tai lieu-"+ magazine.getDocCode() +" Nha phat hanh-"+magazine.getPublisherName()+" So phat hanh-"+magazine.getIssueNum()+" Loai tap chi-"+((magazine) magazine).getTypeMagazine()+" So phat hanh trong thang-"+((magazine) magazine).getIssueMonth());
        } else if (typeDoc.equalsIgnoreCase("bao")) {
            System.out.println("Sach:\n"+ "Ma tai lieu-"+ newsPaper.getDocCode() +" Nha phat hanh-"+newsPaper.getPublisherName()+" So phat hanh-"+newsPaper.getIssueNum()+" Ngay phat hanh-"+((newsPaper) newsPaper).getIssueDay());
        }
    }
}
