package Buoi_07.manageLibrary;

import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) {
        //1. Tao tai lieu
        Document book = new Book(10, "Sach - NXB Kim Dong", 1, "Nam Cao", 100);
        Document magazine = new Magazine(20, "Tap Chi - NXB Alpha", 2, "Thoi Trang", 2);
        Document newsPaper = new Newspapers(30, "Bao - NXB Giao Duc", 3, "08/29/2023");

        //2. Them moi tai lieu
        List<Document> documentList = new ArrayList<>();
        documentList.add(book);
        documentList.add(book);
        documentList.add(magazine);
        documentList.add(newsPaper);
        documentList.add(book);
        documentList.add(magazine);


        //3. Hien thi danh sach tai lieu
        System.out.println("Danh sach tai lieu:\n" + documentList);

        //4. Xoa tai lieu theo ma tai lieu
        System.out.println("Nhap ma tai lieu can xoa: ");
        Scanner sc = new Scanner(System.in);
        int codeOfDelete = sc.nextInt();
        sc.nextLine();
        for (Document indexOfCode : documentList) {
            if (indexOfCode.getCode() == codeOfDelete) {
                documentList.remove(indexOfCode);
                break;
            }
        }
        System.out.println("Danh sach tai lieu sau khi xoa tai lieu:\n" + documentList);

        //5. Tim kiem tai lieu theo loai: Sach, bao, tap chi
        System.out.println("Nhap loai tai lieu can tim kiem: \nNhap 1: For Book;\nNhap 2: For Magazine.. \nNhap 3: For Newspapers");
        String typeDoc = sc.nextLine();

        for (Document document : documentList) {
            if (typeDoc.equalsIgnoreCase("1") && document instanceof Book) {
                System.out.println(document + "\n");
            }

            if (typeDoc.equalsIgnoreCase("2") && document instanceof Magazine) {
                System.out.println(document + "\n");
            }

            if (typeDoc.equalsIgnoreCase("3") && document instanceof Newspapers) {
                System.out.println(document + "\n");
            }
        }

        // region Nhieu loai

        System.out.println("Nhap loai tai lieu can tim kiem: \nNhap 1: For Book;\nNhap 2: For Magazine.. \nNhap 3: For Newspapers");
        typeDoc = sc.nextLine();

        Map<String, List<Document>> documentMap = new HashMap<>();
//        documentMap.put("1", List.of(book));
//        List<Document> bookList = documentMap.get("1");
        //endregion
        for (Document document : documentList) {
            String type = document.getType();
            if (type.equalsIgnoreCase(typeDoc)) { // 1 = 1
                List<Document> tmp;
                // TH 1: Chua co trong map va can khoi tao new list
//                if (!documentMap.containsKey(typeDoc)) {
//                    tmp = new ArrayList<>();
//                } else {
//                    // Lay ra danh sach book da co
//                    tmp = documentMap.get(typeDoc);
//                }
                tmp = !documentMap.containsKey(typeDoc) ? new ArrayList<>() : documentMap.get(typeDoc);

                // Add Book vao list
                tmp.add(document);
                // Tao danh sach book trong map vs key = 1
                documentMap.put(typeDoc, tmp);
            }
        }

//        for (Document document : documentList) {
//            if (document.getType().equalsIgnoreCase(typeDoc)) { // 1 = 1
//                List<Document> tmp =!documentMap.containsKey(typeDoc) ? new ArrayList<>() : documentMap.get(typeDoc);
//                tmp.add(document);
//                documentMap.put(typeDoc, tmp);
//            }
//        }
        System.out.println(documentMap.get(typeDoc));


//        if (typeDoc.equalsIgnoreCase("sach")) {
//            System.out.println("Sach:\n" + "Ma tai lieu-" + book.getCode() + " Nha phat hanh-" + book.getPublisherName() + " So phat hanh-" + book.getIssueNum() + " Ten tac gia-" + ((Book) book).getAuthorName() + " So trang-" + ((Book) book).getPageNum());
//        } else if (typeDoc.equalsIgnoreCase("tap chi")) {
//            System.out.println("Tap chi:\n" + "Ma tai lieu-" + magazine.getCode() + " Nha phat hanh-" + magazine.getPublisherName() + " So phat hanh-" + magazine.getIssueNum() + " Loai tap chi-" + ((Magazine) magazine).getTypeMagazine() + " So phat hanh trong thang-" + ((Magazine) magazine).getIssueMonth());
//        } else if (typeDoc.equalsIgnoreCase("bao")) {
//            System.out.println("Sach:\n" + "Ma tai lieu-" + newsPaper.getCode() + " Nha phat hanh-" + newsPaper.getPublisherName() + " So phat hanh-" + newsPaper.getIssueNum() + " Ngay phat hanh-" + ((Newspapers) newsPaper).getIssueDay());
//        } else {
//            System.out.println("Type Doc: " + typeDoc);
//        }
    }

}
