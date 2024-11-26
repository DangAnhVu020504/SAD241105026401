1. Maintain Timecard (Duy trì bảng chấm công)
- Mô tả:
+ Nhân viên nhập số giờ làm việc vào bảng chấm công (Timecard) dựa trên mã charge code (charge number).
+ Dữ liệu sẽ được lưu trữ và sử dụng để tính toán lương.
- Các bước chính:
+ Lấy bảng chấm công hiện tại hoặc tạo bảng mới nếu chưa có.
+ Hiển thị thông tin bảng chấm công (nếu có).
+ Cập nhật giờ làm việc cho từng mã charge code.
+ Lưu bảng chấm công sau khi cập nhật.
- Thành phần liên quan:
+ Employee: Người thực hiện việc duy trì bảng chấm công.
+ Timecard: Lưu trữ thông tin giờ làm việc và mã charge code.
+ ProjectManagementDatabase: Cung cấp danh sách mã charge code hợp lệ.
  
2. Process Payroll (Xử lý lương)
- Mô tả:
+ Tính toán lương cho nhân viên dựa trên giờ làm việc và các thông tin liên quan (thưởng, phụ cấp, khấu trừ).
+ Gửi yêu cầu chuyển khoản đến ngân hàng.
- Các bước chính:
+ Thu thập thông tin bảng chấm công và các yếu tố tính lương.
+ Tính toán tổng thu nhập.
+ Tạo phiếu lương (Paycheck).
+ Gửi thông tin thanh toán đến hệ thống ngân hàng.
+ Lưu thông tin phiếu lương vào hệ thống.
- Thành phần liên quan:
+ Employee, Timecard, Paycheck, BankSystem.
  
3. Generate Reports (Tạo báo cáo)
- Mô tả:
+ Tạo báo cáo liên quan đến bảng chấm công, lương hoặc thông tin nhân viên.
- Các bước chính:
+ Chọn loại báo cáo cần tạo.
+ Truy xuất dữ liệu từ cơ sở dữ liệu liên quan.
+ Tạo báo cáo và hiển thị cho người dùng hoặc lưu trữ.
- Thành phần liên quan:
+ Employee, Timecard, Paycheck.
  
4. Manage Employee (Quản lý nhân viên)
- Mô tả:
+ Thêm, sửa hoặc xóa thông tin nhân viên trong hệ thống.
- Các bước chính:
+ Nhập thông tin nhân viên mới hoặc cập nhật thông tin hiện tại.
+ Lưu dữ liệu nhân viên vào cơ sở dữ liệu.
- Thành phần liên quan:
+ Employee.
  
5. Maintain Charge Codes (Duy trì mã charge code)
- Mô tả:
+ Quản lý các mã charge code để nhân viên nhập giờ làm việc đúng dự án.
- Các bước chính:
+ Thêm, chỉnh sửa hoặc xóa mã charge code.
+ Lưu dữ liệu mã charge code vào cơ sở dữ liệu dự án.
- Thành phần liên quan:
+ ProjectManagementDatabase.
  
6. Manage Purchase Orders (Quản lý đơn mua hàng)
- Mô tả:
+ Lưu trữ và theo dõi các đơn mua hàng do nhân viên tạo ra.
- Các bước chính:
+ Nhập thông tin đơn mua hàng.
+ Cập nhật trạng thái đơn mua hàng.
+ Lưu thông tin đơn mua hàng vào cơ sở dữ liệu.
- Thành phần liên quan:
+ Employee, PurchaseOrder.
