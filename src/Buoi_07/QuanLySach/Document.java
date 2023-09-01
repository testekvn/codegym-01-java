package Buoi_07.QuanLySach;

import java.util.Scanner;

public class Document {

    String idDoc; // id document
    String namePublisher; // tên nhà xuất bản
    int numberPublish; // số phát hành

    public String getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(String idDoc) {
        this.idDoc = idDoc;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public int getNumberPublish() {
        return numberPublish;
    }

    public void setNumberPublish(int numberPublish) {
        this.numberPublish = numberPublish;
    }

    public Document(String idDoc, String namePublisher, int numberPublish) {
        this.idDoc = idDoc;
        this.namePublisher = namePublisher;
        this.numberPublish = numberPublish;
    }

    public void InforDoc(){ // in ra thông tin document
        System.out.println("ID document: " + idDoc);
        System.out.println("Publisher' name: : " + namePublisher);
        System.out.println("Publish' number: : " + numberPublish);
    }

    @Override
    public String toString() { // toString de convert chuoi ra text
        return "Document{" +
                "idDoc='" + idDoc + '\'' +
                ", namePublisher='" + namePublisher + '\'' +
                ", numberPublish=" + numberPublish +
                '}';
    }

    public String getType(){
        return "Document";
    }
}
