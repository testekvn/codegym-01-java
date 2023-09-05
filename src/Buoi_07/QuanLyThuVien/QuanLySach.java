package Buoi_07.QuanLyThuVien;

import java.util.*;

public class QuanLySach {
    public static void main(String[] args) {
        Library book = new Book("1", "minh", 100, "Quang", 1234);
        Library magazine = new Magazine("20", "Tap Chi - NXB Alpha", 2, 12, "s");
        Library newspaper = new Newspaper("3", "vuong", 234, "15");

        List<Library> libraryList = new ArrayList<>();
        libraryList.add(book);
        libraryList.add(magazine);
        libraryList.add(book);
        libraryList.add(newspaper);
        libraryList.add(book);

        System.out.println("\n" + libraryList);
        System.out.println("Nhap ma tai lieu can xoa: ");
        Scanner sc = new Scanner(System.in);
        String idOfDelete = sc.nextLine();
        for (Library indexOfid : libraryList) {
            if (indexOfid.getId() == idOfDelete) {
                libraryList.remove(indexOfid);
                break;
            }
            System.out.println("Danh sach tai lieu sau khi xoa tai lieu:\n" + libraryList);
        }
        System.out.println("Nhập loại tài liệu cần tìm: \nNhập 1: Book; \nNhập 2: Magazine; \nNhập 3: Newspaper");
        String typeDoc = sc.nextLine();

        for (Library library : libraryList) {
            if (typeDoc.equalsIgnoreCase("1") && library instanceof Book) {
                System.out.println(library + "\n");
            }
            if (typeDoc.equalsIgnoreCase("2") && library instanceof Magazine) {
                System.out.println(library + "\n");
            }
            if (typeDoc.equalsIgnoreCase("3") && library instanceof Newspaper) {
                System.out.println(library + "\n");
            }
        }
        System.out.println("Nhập loại tài liệu cần tìm: \nNhập 1: Book; \nNhập 2: Magazine; \nNhập 3: Newspaper");
        typeDoc = sc.nextLine();

        Map<String, List<Library>> libraryMap = new HashMap<>();
        for (Library library : libraryList) {
            String type = library.getType();
            List<Library> tmp;
            if (!libraryMap.containsKey(typeDoc)) {
                tmp = new ArrayList<>();
            } else {
                tmp = libraryMap.get(typeDoc);
            }
            tmp = !libraryMap.containsKey(typeDoc) ? new ArrayList<>() : libraryMap.get(typeDoc);
            tmp.add(library);
            libraryMap.put(typeDoc, tmp);
        }
        System.out.println(libraryMap.get(typeDoc));
    }


}

