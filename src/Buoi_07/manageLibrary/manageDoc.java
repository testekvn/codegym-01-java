package Buoi_07.manageLibrary;

import java.util.ArrayList;
import java.util.List;

public class manageDoc {
    private final List<document> listDoc = new ArrayList<>();

    public void addDocument(document doc) {
        listDoc.add(doc);
    }

    public void deleteDoc(String docCode){

    }
    public void displayDoc(){
//        book book = new book(10, "NXB Kim Dong", 1, "Nam Cao", 100);
//        magazine magazine = new magazine(20, "NXB Alpha", 2, "Thoi Trang", 2);
//        newsPaper newsPaper = new newsPaper(30, "NXB Giao Duc", 3, "08/29/2023");
//        book.displayDoc();
//        magazine.displayDoc();
//        newsPaper.displayDoc();
        System.out.println(listDoc);
    }
    //Buoi_07.manageLibrary.book@70177ecd > thieu ham toString
    @Override
    public String toString() {
        return "manageDoc{" +
                "listDoc=" + listDoc +
                '}';
    }
}
