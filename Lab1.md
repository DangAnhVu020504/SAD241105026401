**Phân tích Hệ thống Payroll System**
1. Phân tích Kiến trúc
* 1.1 Đề xuất Kiến trúc
- Kiến trúc hệ thống đề xuất: Mô hình client-server.
- Client: Giao diện người dùng chạy trên nền Windows cho phép nhân viên:
+ Nhập thông tin phiếu thời gian (timecard).
+ Chọn phương thức thanh toán.
+ Xem báo cáo cá nhân, chẳng hạn như số giờ làm việc, số lương đã nhận, và đơn hàng cho nhân viên hưởng hoa hồng.
- Server: Máy chủ xử lý các tác vụ:
+ Tính toán lương và các khoản hoa hồng.
+ Truy xuất và lưu trữ dữ liệu phiếu thời gian từ Project Management Database (DB2).
+ Tự động thực hiện quy trình tính lương vào ngày thứ Sáu hàng tuần và ngày làm việc cuối tháng.
+ Giao tiếp với cơ sở dữ liệu cũ: Dùng JDBC để kết nối với cơ sở dữ liệu dự án (Project Management Database) 
nhằm truy xuất thông tin mã dự án và dữ liệu khác mà không cần cập nhật trực tiếp.
+ 1.2 Giải thích Kiến trúc và Biểu đồ Package
- Client-Server: Mô hình này hỗ trợ tính năng tương tác người dùng tốt qua giao diện người dùng trên máy tính cá nhân, đồng thời xử lý nghiệp vụ phức tạp ở máy chủ.
- Các package chính:
+ UI Package: Chứa các lớp giao diện cho người dùng như Employee, Payroll Administrator, và các lớp chức năng liên quan đến thanh toán và quản lý phiếu thời gian.
+ Business Logic Package: Bao gồm các lớp xử lý logic tính toán lương và kiểm tra hợp lệ dữ liệu.
+ Database Access Package: Sử dụng JDBC để truy xuất dữ liệu từ hệ thống DB2 hiện có.
![Diagram](https://planttext.com/api/plantuml/png/R591RiCW4Bpx5IYdv90F-50bgNkmr4gHqgZd3MmT5CnQi8vaLNbP3trIlr1iOzTfpGM6WPsPXU_FhurdS5oN9gb0Ng10iJZcOj-l5-8Z4K8Qy5uybPMX1h7R2WCZphDK7DXfM_Jx7WrAtaDJekKNv3EfvIeLLz8gNhICxbMNAC5DgTieDP2354VyL-fCjVDlv2weKg4jTqLkoM-INUsrnL3ncGejvr85duwCEJIUiHpqhc2q0iOO8hVlrFey4Ha4sv-f7CbGUJR7r48632VmABQoFJ_d8TizTdDKbmw3zdBLem3KiAuhDM5KQ7H4dUJuGElrmtskP6peV-g-0IqVxIGRjAhz5py0003__mC0)

2. Cơ chế Cần Thiết
* 2.1 Danh sách các Cơ chế
- Bảo mật (Security):
+ Mỗi nhân viên chỉ có quyền truy cập và chỉnh sửa phiếu thời gian và đơn hàng của chính mình. Chỉ quản trị viên mới có thể cập nhật thông tin nhân viên và các thiết lập hệ thống quan trọng.
+ Tăng cường tính bảo mật khi truy cập vào hệ thống ngân hàng để xử lý thanh toán qua giao thức bảo mật.
- Lưu trữ Bền vững (Persistency):
+ Sử dụng RDBMS để lưu trữ thông tin nhân viên và phiếu thời gian trong cơ sở dữ liệu.
+ Cung cấp các lớp DBClass để đảm bảo rằng dữ liệu phiếu thời gian và thanh toán được truy xuất và cập nhật một cách nhất quán.
- Giao diện với Hệ thống Cũ (Legacy Interface):
+ Sử dụng JDBC để kết nối với Project Management Database (DB2) trên IBM mainframe nhằm truy xuất dữ liệu mã dự án mà không cần thay đổi cơ sở dữ liệu hiện có.
- Tự động hóa Xử lý Thanh toán:
+ Hệ thống tự động thực hiện quy trình thanh toán định kỳ mà không cần can thiệp thủ công, đồng thời đảm bảo tính chính xác và kịp thời trong việc thanh toán cho nhân viên.
* 2.2 Lý do Lựa chọn
- Các cơ chế trên đảm bảo tính bảo mật và bền vững cho hệ thống, tận dụng được dữ liệu từ hệ thống cũ mà không cần phải thay đổi toàn bộ hạ tầng, đồng thời duy trì khả năng xử lý tự động và hiệu quả.
  ![DiagramDiagram](https://planttext.com/api/plantuml/png/P90n3i8m34NtdC9Yvm8TK5N2NgaIkqaDZPJ4KUqEFHi3H-8Af42HK5V_vwTlF--FMXH7dM8mw9H7ECKSU2OokOozyncJmgx5UUGGkbcKuWvGeEt-2OkA5nHwXxOnPXN1_b3W2ZeAv1IAAL9IqtPBi48LM2yvu0pvamDdzPnaepaEp48_B98Et7zjjgdWZC7tg0IOUf1oqOQr3UnN6QUh7oF8v1o9R4fzSrogb7KHl96fAVNBlru0003__mC0)
  
3. Phân tích Ca Sử dụng "Select Payment"
* 3.1 Mô tả Ca Sử dụng
- Ca sử dụng "Select Payment" cho phép nhân viên chọn phương thức nhận lương (nhận trực tiếp, qua bưu điện, hoặc chuyển khoản ngân hàng).
- Mục tiêu: Nhân viên cập nhật phương thức thanh toán mà họ mong muốn.
* 3.2 Các Lớp Phân tích và Quan hệ
- Lớp Phân tích Chính
+ Employee: Đại diện cho nhân viên, người có thể truy cập và cập nhật phương thức thanh toán.
+ PaymentMethod: Lớp quản lý các phương thức thanh toán (nhận trực tiếp, qua bưu điện, hoặc chuyển khoản ngân hàng).
+ PayrollSystem: Quản lý lưu trữ và xử lý các yêu cầu cập nhật phương thức thanh toán của nhân viên.
- Quan hệ giữa các Lớp:
+ Employee có thuộc tính paymentMethod (thuộc loại PaymentMethod), mô tả cách thức mà nhân viên chọn để nhận lương.
+ PayrollSystem chứa logic xử lý cập nhật thông tin thanh toán của Employee và lưu thay đổi vào cơ sở dữ liệu.
* 3.3 Biểu đồ Sequence cho "Select Payment"
- Nhân viên đăng nhập vào hệ thống và chọn "Select Payment".
- PayrollSystem hiển thị các phương thức thanh toán.
- Nhân viên chọn phương thức mong muốn và nhập thông tin cần thiết (địa chỉ nhận lương, tên ngân hàng, hoặc số tài khoản).
- PayrollSystem xác nhận thông tin, lưu cập nhật và kết thúc quy trình.
  ![DiagramDiagram](https://planttext.com/api/plantuml/png/R91DJiD038NtSmgh-rwW2rI5T4r4AlPcnXIB-PFjqEPiB3WILo011e5Ww--zzqb-UtdTgw7ObA93RqNWa6eiCv6hovazLym6cm5dAJ6Eingb3Q32CFvEz6XuZqeViE-SQqEmlLh2ExYfbE78YJnASCEutljk1xTamlHCG1TMutm2Qw6-W-rNknKXa257_JD_o4O2ZsKIXNEH9sgE5TvXv816d_o7VCH5FDMLXN-zroK_i2JGoNlILctoRux69KDQ4dWYjwSSre--0m00__y30000)
  
4. Phân tích Ca Sử dụng "Maintain Timecard"
* 4.1 Mô tả Ca Sử dụng
- Ca sử dụng "Maintain Timecard" cho phép nhân viên nhập giờ làm việc cho các dự án trong khoảng thời gian trả lương hiện tại.
- Mục tiêu: Nhân viên ghi lại số giờ làm việc và mã dự án, đảm bảo dữ liệu lương chính xác.
* 4.2 Các Lớp Phân tích và Quan hệ
- Lớp Phân tích Chính:
+ Employee: Đại diện cho nhân viên, người nhập và quản lý dữ liệu thời gian làm việc.
+ Timecard: Đối tượng lưu trữ thông tin số giờ làm việc và mã dự án.
+ PayrollSystem: Xử lý lưu trữ và kiểm tra tính hợp lệ của phiếu thời gian trước khi lưu dữ liệu.
- Quan hệ giữa các Lớp:
+ Employee có quan hệ "sở hữu" với nhiều Timecard.
+ PayrollSystem tương tác với Timecard để xác thực và lưu trữ thông tin khi nhân viên gửi phiếu thời gian.
* 4.3 Biểu đồ Sequence cho "Maintain Timecard"
- Nhân viên mở Maintain Timecard.
- PayrollSystem hiển thị phiếu thời gian hiện tại hoặc tạo phiếu mới nếu chưa có.
- Nhân viên chọn mã dự án và nhập số giờ làm việc cho từng ngày.
- Nhân viên có thể lưu lại hoặc chọn gửi phiếu thời gian:
+ Khi gửi, PayrollSystem kiểm tra hợp lệ (số giờ, mã dự án).
+ Sau khi gửi, phiếu chuyển sang chế độ chỉ đọc.
  ![Diagram](https://planttext.com/api/plantuml/png/R94zJWCn48NxFOLBA7A1BL0AA58W8ILIwc7tGGnZpyepYRH2d8o28t45ziS9QvJERvxzvflnpzVtMesI7GDN3PEgUmWTIm-uZyevXwmszxNRMlBnTQn62bZgZlg0Q8-mWxIrUrhAqLSm6YlADxUrEucVxA68jFC13QK_uxFAH6Td9hAiIgA379Fk9RrZwE-ZJLH9teQsYukNo09bpWtJUTTtnMGjZ3phrOGapDjU3M5EE17xbWmvV1DVP1pcMOH1CHCrKBqswcNjgzNTlmKMrlbjLG8KrXgn7J_q5m00__y30000)
  
5. Hợp nhất Kết quả Phân tích
- Bản phân tích hệ thống Payroll System cho thấy:
- Kiến trúc client-server đảm bảo hệ thống hoạt động hiệu quả với số lượng lớn người dùng.
- Cơ chế bảo mật và lưu trữ đảm bảo dữ liệu nhạy cảm và tính liên tục của dữ liệu.
- Các ca sử dụng "Select Payment" và "Maintain Timecard" cho phép nhân viên thao tác nhanh chóng và an toàn.
  ![Diagram](https://planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bTYSab-aO9hRa5EVcLgAfIh591OMPIVawFWc9ARcPTPN5AK21HMKaWiXeXmSPKMfoOd5gSgA0MdvgGcboW0DUIcvfM0bOGw6oBaVHCpyqg0M24aCnSeL9G2LMB4nGMpL47N3gm7bM_41RPAGHVAut98pKi1kHW0003__mC0)
  
  ![Diagram](https://planttext.com/api/plantuml/png/X5FBJiD03BpdArQzS-4BsZG8YYWg3N1tDwPTs4Urwo15g5_6WK_Y5_1I4jeD3POYHVB4CvvnFjy_ne70KsrqjWNv0ciKemKqtcajoYOGcf5uomHNrtwOYSN-lMt5aXf24ACBizMkGHGpI-YVG1w1Ofs94ZLAuY6DGKj9SmxA4Z_YNXcKuAkklqkvMfsJoYYh0daWvuU8vs3Z1WSQdrm2kKIBF0V54hVEKqZOTzcn5taTb4KMS-FMIWxuqcfTU2SPh-owBsyAMjOwafUWmIiC9m5JPupYCSwcc2kmbSRMN357shW13nz1gmg81_Nrj0c8Nr22w9oSoBWLoxB4Q_vZMW44AmZTLwTTkoxowL2Wp6VZAP4JHNwUDEzgz4qq_3b2zjb_UrBa0pVr1_n7Rfz-YSGflN8S6_2ysMrjLkZJH4g-oeEZMw9qlkeVrYuRewtYZ_W5003__mC0)
