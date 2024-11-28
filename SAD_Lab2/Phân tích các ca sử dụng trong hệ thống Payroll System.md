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
+ ![Diagram](https://planttext.com/api/plantuml/png/T90x3i9034JxFOMLdWjGe1IaH49y3c1shMGX-v7N2U9i51o9Ax0f4eL8gIoDvur7_hu_PH9awLohK4jWg5nimuj8nInRRIDwWOjrf97DdtZaS2Sj1_HOaoClUnIyOIAbnX3Ox2OMjb1KNeZX6VW1JUWu5MhQPkTgu82UIDXIJw0Rv3gFO2ZpwypYTEOxzj1ZQyqYOzvXZboZGQ7LkdFh6NCp6OMCOQ5AycRuwmy00F__0m00)
  
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
+ ![Diagram](https://planttext.com/api/plantuml/png/N90z3i8m34RtdCBApWKOK0L2h9NA1KngYQZv8t6HUZO6ZiGLI56RjgoVdfy_-_DwLuanSc-DGCK-mja6umSY4NAibGxe6AxQaiBORi8Q1tKdrMt28xgk6HAJ5M9MmUvG3B07sVGtgnbuZbfabA8GcPxL8tr2etg3JC2UqO1sobkIeZ2PNxR-_EHQ23XOoeKYFNfABCMA-TjGHwyefNbagov7PF12ZkBO94p05bqx6tmks7HXbNkDZ_u2003__mC0)
  
3. Generate Reports (Tạo báo cáo)
- Mô tả:
+ Tạo báo cáo liên quan đến bảng chấm công, lương hoặc thông tin nhân viên.
- Các bước chính:
+ Chọn loại báo cáo cần tạo.
+ Truy xuất dữ liệu từ cơ sở dữ liệu liên quan.
+ Tạo báo cáo và hiển thị cho người dùng hoặc lưu trữ.
- Thành phần liên quan:
+ Employee, Timecard, Paycheck.
+ ![Diagram](https://planttext.com/api/plantuml/png/R91D2i8m48NtESNGlHTm8Ts8Mn4lC2G31lFdT2hqR5ru9AzWHHCIw_RDztWVyvmV_I38CdgdK4jasFlauaIaqX9RRHC6WRFrf95D4nvnqXVILwLo1pQxWi8MkXFTHXe4c59awLIvhJXXItS2oQ51mPOl6mj_e42CKl5veL79WhLAmecZSwLGc1N_LKev_2ZL_5-btu6UWdb_zmK00F__0m00)
  
4. Manage Employee (Quản lý nhân viên)
- Mô tả:
+ Thêm, sửa hoặc xóa thông tin nhân viên trong hệ thống.
- Các bước chính:
+ Nhập thông tin nhân viên mới hoặc cập nhật thông tin hiện tại.
+ Lưu dữ liệu nhân viên vào cơ sở dữ liệu.
- Thành phần liên quan:
+ Employee.
+ ![Diagram](https://planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bTYSab-aO9hRa5EVcLgAbS1K3WpERCWCQy4BkYIM9AOb5YSoiK54r7GjSEGLR1IK79CIL40cbPQa99OaggG2bETcPUMhyI5eG678S69PKXwWIObAd4vfEQbW5pB1G000F__0m00)
  
5. Maintain Charge Codes (Duy trì mã charge code)
- Mô tả:
+ Quản lý các mã charge code để nhân viên nhập giờ làm việc đúng dự án.
- Các bước chính:
+ Thêm, chỉnh sửa hoặc xóa mã charge code.
+ Lưu dữ liệu mã charge code vào cơ sở dữ liệu dự án.
- Thành phần liên quan:
+ ProjectManagementDatabase.
+ ![Diagram](https://planttext.com/api/plantuml/png/XD0n3i8m30NGFQUmkdC11bG4Z4Wi7C349WGrJfIu0sTZw95w1P81n59r_Vf--lBydlgYc7KCWq6hCSCff26-c4sgiRS-eIXSSdoorJCAEWuiUaJ56nOsvjk7pMwv1blezaHGVIQlO1-O7OEDnAKposThvZKHAlzpK0DS8N-Jgt28SlSvD49S6zEpKFl61m00__y30000)
  
6. Manage Purchase Orders (Quản lý đơn mua hàng)
- Mô tả:
+ Lưu trữ và theo dõi các đơn mua hàng do nhân viên tạo ra.
- Các bước chính:
+ Nhập thông tin đơn mua hàng.
+ Cập nhật trạng thái đơn mua hàng.
+ Lưu thông tin đơn mua hàng vào cơ sở dữ liệu.
- Thành phần liên quan:
+ Employee, PurchaseOrder.
+ ![Diagram](https://planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bTYSab-aO9hRa5EVcLgAbS1K3WpERCWCQz48Q2qA3aZiJZLloWbjSWbiIGn2SZXueAfLT2rmwv4mKf1oRaeDR4aLQ40Ag-G3rAWn8LTFJw3WXFBC8qXoWcX1IcOJb00Uhoaj9WSbuGK9IPdOpZ58JKl1HIEN000003__mC0)
