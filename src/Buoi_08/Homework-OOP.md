
1. Thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo.
+ Tài liệu có các thuộc tính sau; Mã tài liệu, Tên nhà xuất bản, Số phát hành.
+ Sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
+ Tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
+ Báo cần quản lý thêm: Ngày phát hành. <br>
  Thực hiện các yêu cầu sau:
   + Xây dựng các lớp để quản lý tài liệu cho thư viện một cách hiệu quả.
   + Xây dựng lớp QuanLySach chứa các tập dữ liệu (Dữ liệu tự tạo) có các chức năng sau
      + Thêm mới tài liêu: Sách, tạp chí, báo.
      + Xoá tài liệu theo mã tài liệu.
      + Hiện thị thông tin về tài liệu.
      + Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.


2. Để quản lý các hộ dân cư trong một khu phố, tổ trưởng cần các thông tin sau: Số thành viên trong gia đình, Số nhà, thông tin mỗi cá nhân trong gia đình. <br>
   Với mỗi cá nhân, người ta quản lý các thông tin sau: Họ tên, Tuổi, Nghề nghiệp, số chứng minh nhân dân.
+ Hãy xây dựng lớp Nguoi để quản lý thông tin của mỗi cá nhân.
+ Xây dựng lớp HoGiaDinh để quản lý thông tin của từng hộ gia đình.
+ Xây dựng lớp KhuPho để quản lý các thông tin của từng hộ gia đình.
+ Nhập n hộ dân. (n nhập từ bàn phím), hiển thị thông tin của các hộ trong khu phố.

3. Viết chương trình quản lý việc tuyển sinh viên sau khi tốt nghiệp đại học.
+ Có 2 loại sinh viên bao gồm sinh viên tốt nghiệp loại khá giỏi (GoodStudent) và sinh viên tốt nghiệp loại trung bình (NormalStudent).
+ Cả 2 loại sinh viên trên đều phải cung cấp các thông tin sau khi nộp hồ sơ xin việc: Họ tên (fullName), Ngày tháng năm sinh (doB), Giới tính (sex), Số điện thoại (phoneNumber), Tên trường đã học (universityName), Xếp loại tốt nghiệp (gradeLevel).
+ Riêng sinh viên loại khá giỏi phải có thêm thông tin: điểm trung bình học tập (gpa) theo thang điểm 10, tên của loại học bổng (hoặc giải thưởng) cao nhất đã từng giành được (bestRewardName).
+ Riêng sinh viên loại trung bình thì phải có thêm các thông tin: điểm TOEIC (englishScore), điểm thi đầu vào chuyên môn do công ty tổ chức thi (entryTestScore) theo thang điểm 10. <br>
  Thực hiện các tính năng:
+ Thiết kế và viết code thể hiện các class của các sinh viên và lớp học của chương trình làm sao để tuân thủ theo mô hình OOP <br>
  Lưu ý: Bất kì một sinh viên nào cũng cần có một phương thức có tên là ShowMyInfor để hiển thị thông tin của sinh viên đó ra màn hình cosole, yêu cầu này là bắt buộc với các thành viên xây dựng code cho chương trình này. Bạn hãy lưu ý khi thiết kế code để thỏa mãn yêu cầu này.

+ Kiểm tra ràng buộc dữ liệu cho chương trình. Dữ liệu của các file input phải tuân thủ theo ràng buộc sau:
   + Họ tên sinh viên có chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự. Nếu sai cho phép nhập tổng 3 lần. Quá hạn dừng chương trình và không được nhập thông tin nữa
   + Chương trình phải bắt được lỗi sai định dạng ngày tháng năm đối với trường DoB phải theo định dạng dd/MM/YYYY. Throw InvalidDOBException nếu có thông tin không chính xác
   + Số điện thoại: phải là chuỗi số có chiều dài 10 ký tự và phải bắt đầu bằng một trong các chuỗi số: 090, 098, 091, 031, 035 hoặc 038. Throw InvalidPhoneNumberException nếu SĐT không hợp lệ
   + Ngoài ra nếu có bất cứ một exception nào khác trong quá trình thực thi chương trình, hãy thông báo ra màn hình nội dung “Input files have unknow errors !!!”

+ In ra danh sách sv trúng tuyển theo các nguyên tắc sau:
   + Người dùng sẽ nhập vào số lượng sinh viên cần tuyển dụng (tối thiểu là 11, tối đa là 15).
   + Chương trình sẽ tự động chọn ra ứng viên phù hợp cho công ty theo các bước như sau:
      + Nếu số lượng ứng viên là sinh viên khá giỏi có nhiều hơn số lượng cần tuyển thì xét ưu tiên theo điểm GPA. Nếu xuất hiện ứng viên khá giỏi có cùng điểm GPA thì xét ưu tiên theo họ tên. Vd: nếu họ tên là Nguyễn Văn A và Nguyễn Văn B thì ứng viên Nguyễn Văn A được chọn. (Giả sử không bao giờ có sinh viên có trùng họ tên nhau).
      + Nếu số lượng ứng viên là sinh viên khá giỏi ít hơn hoặc bằng số lượng cần tuyển thì nhận hết sinh viên khá giỏi.
      + Sau khi tuyển hết ứng viên khá giỏi, nếu vẫn chưa đủ số lượng cần tuyển, chương trình sẽ lấy ứng viên trung bình. Các ứng viên trung bình được xét ưu tiên theo điểm thi đầu vào, nếu điểm thi đầu vào bằng nhau thì xét đến điểm TOEIC. Nếu xuất hiện ứng viên trung bình có cùng điểm TOEIC thì xét ưu tiên theo họ tên.

4. Xây dựng hệ thống quản lý ve máy bay 
+ Xây dựng lớp Chuyenbay gồm:
  + Thuộc tính: tenchuyen, ngaybay, giave, kyhieuchuyen, soluongve, danh sách người trên chuyến bay đó
  + Phương thức: PrintInfo (~ In ra thông tin), và các phương thức getter/setter
+ Xây dựng lớp Nguoi gồm:
  + Thuộc tính: hoten, gioitinh, tuoi
  + Phương thức: PrintInfo(In ra thông tin người), và các phương thức getter/setter
+ Xây dựng lớp Hanhkhach (mỗi hành khách được mua nhiều vé) kế thừa lớp Nguoi bổ sung thêm:
  + Thuộc tính: Danh sách Chuyenbay; int soluong (Tổng số lượng vé); 
  + Phương thức: PrintInfo(In ra thông tin hành khách), và các phương thức getter/setter; Phương thức tính số tiền hành khách đã mua vé máy bay, phương thức đặt vé máy bay (Người dùng đặt vé và cập nhật các chuyến bay vào danh sách của người dùng); Phương thức tính tổng số tiền người dùng phải trả cho tất cả các chuyến bay

Chương trình chính:
   + Xây dựng N số chuyến bay (Thông tin chuyến bay được nhập từ bàn phím)
   + Nhập vào 1 danh sách M hành khách (M nhập từ bàn phím).
   + Thực hiện đặt vé cho các khách hàng và tính danh sách số tiền phải trả cho mỗi khách hàng. In ra thông tin danh sách khách hàng với số tiền mua vé tăng dần
   + In ra danh sách các chuyến bay theo thứ tự số lượng khách hàng giảm dần
   + Nếu khách hàng đã mua tổng 10tr tiền vé, sẽ được khuyến mại 20% cho 03 lần tiếp theo, hãy viết chương trình và tính tổng tiền với khách hàng đáp ứng yêu cầu này

5. V.Anh được người yêu tặng sinh nhật hàng năm với số tiền random trong khoảng từ 1tr tới 10tr.
Hãy phát triển chương trình tính số tiền mà V.Anh có thể nhận được trong mỗi năm mà tuổi cô ấy là số chẵn.
   (Áp dụng map để lưu dữ liệu và xử lý thông tin lưu  trữ tiền hàng năm, biết tổn số tiền ban đầu cô ấy có là 1tr; In ra thông tin số tiền cô ấy được tặng hàng năm)