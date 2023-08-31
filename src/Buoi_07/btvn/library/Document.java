package Buoi_07.btvn.library;
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
public class Document {
    int code;           //Mã tài liệu
    String publisherName;  //Nhà xuất bản
    int issueNum;          //Số phát hành

    public int getCode() {
        return code;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Document(){
        publisherName = "NXB Giáo dục";
    }

    public Document(int code, String publisherName, int issueNum){
        this.code = code;
        this.publisherName = publisherName;
        this.issueNum = issueNum;
    }
    public void displayDoc(){
        System.out.println("Document code: "+ code);
        System.out.println("Publisher name: "+ publisherName);
        System.out.println("Issue number: "+ issueNum);
    }

    public String getType(){
        return "Document";
    }
    @Override
    public String toString() {
        return "Document{" +
                "code=" + code +
                ", publisherName='" + publisherName + '\'' +
                ", issueNum=" + issueNum +
                '}';
    }
}
