package Buoi_07.QuanLySach;

import java.util.*;

public class ManageDocument {
    public static void main(String[] args) {
//        1. Create data
        Document newBook = new Book("1", "Sach", 12, "Vn", 3);
        Document newMegazine = new Megazines("2", "Tap chi", 23, "Jan");
        Document newNewsapapers = new Newspapers("3", "Bao", 3, "1st");

//        2. Add data
        List<Document> listDocument = new ArrayList<>();
        // add data in list
        listDocument.add(newBook);
        listDocument.add(newMegazine);
        listDocument.add(newNewsapapers);

//        3. Print data
        System.out.println(listDocument);

        System.out.print("Nhap ma tieu lieu can xoa: ");
        Scanner sc = new Scanner(System.in);
        String idDel = sc.nextLine();
        for (Document document : listDocument) {
            if (document.getIdDoc().equals(idDel)){
                listDocument.remove(document);
                break;
            }
        }

        System.out.println("Danh sach tai lieu sau khi xoa tai lieu:\n" + listDocument);

        System.out.println("Nhap loai tai lieu can tim kiem: \nNhap 1: For Book;\nNhap 2: For Magazine.. \nNhap 3: For Newspapers");
        String typeDoc = sc.nextLine();
        Map<String, List<Document>> documentMap = new HashMap<>();
        for (Document document: listDocument){
            String type = document.getType();
            if (type.equalsIgnoreCase(typeDoc)){
                List<Document> tmp; // Init list
                if (!documentMap.containsKey(typeDoc)){
                    tmp = new ArrayList<>();
                } else {
                    tmp = documentMap.get(typeDoc);
                }
                tmp.add(document);
                documentMap.put(typeDoc, tmp);
            }
        }
        System.out.println(documentMap.get(typeDoc));

    }
}
