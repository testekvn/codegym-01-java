package Buoi_07.manageLibrary;
/*
Thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo.


Tài liệu có các thuộc tính sau; Mã tài liệu, Tên nhà xuất bản, Số phát hành.
Sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
Tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
Báo cần quản lý thêm: Ngày phát hành.
Thực hiện các yêu cầu sau:

Xây dựng các lớp để quản lý tài liệu cho thư viện một cách hiệu quả.
Xây dựng lớp QuanLySach chứa các tập dữ liệu (Dữ liệu tự tạo) có các chức năng sau

Thêm mới tài liêu: Sách, tạp chí, báo.
Xoá tài liệu theo mã tài liệu.
Hiện thị thông tin về tài liệu.
Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.

 */
public class document {
    int docCode;           //Mã tài liệu
    String publisherName;  //Nhà xuất bản
    int issueNum;          //Số phát hành

    public int getDocCode() {
        return docCode;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public document(){
        publisherName = "NXB Giáo dục";
    }

    public document(int docCode, String publisherName, int issueNum){
        this.docCode = docCode;
        this.publisherName = publisherName;
        this.issueNum = issueNum;
    }
    public void displayDoc(){
        System.out.println("Document code: "+ docCode);
        System.out.println("Publisher name: "+ publisherName);
        System.out.println("Issue number: "+ issueNum);
    }

    @Override
    public String toString() {
        return "document{" +
                "docCode=" + docCode +
                ", publisherName='" + publisherName + '\'' +
                ", issueNum=" + issueNum +
                '}';
    }
}
