# CÁC HỆ THỐNG CON CỦA HỆ THỐNG PAYROLL SYSTEM
## 1. PrintService Subsystem
  - Mô tả: Subsystem này đảm nhận việc in ấn các tài liệu liên quan đến bảng lương như paycheck, báo cáo, hoặc các chứng từ cần thiết.
  - Chức năng chính:
    - In bảng lương cho nhân viên (Paycheck).
    - Hỗ trợ in báo cáo hàng tháng/quý.
    - Cung cấp dịch vụ in tài liệu chung trong hệ thống.
  - Thành phần liên quan:
    - IPrintService: Giao diện cung cấp chức năng in ấn.
      - Phương thức:
        - print(Paycheck, String format) - In bảng lương theo định dạng.
      - Printer: Thiết bị in.
  - Tương tác với hệ thống khác:
    - PayrollController: Gửi yêu cầu in Paycheck sau khi xử lý tính lương.
    - Employee: Cung cấp thông tin cần thiết để in (ví dụ: địa chỉ gửi hoặc phương thức nhận paycheck).
**Biểu đồ ngữ cảnh**
- ![Diagram](https://planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bTYSab-aK90OcLHVawEStvU2OXEBL98B5O8S8RAkkOMvEHNfgQ2185iBgwYrEIInBpqd5I5WABCl9BWrAAopEHKXMek1I28BW29QG2DJCv8JSxMKGWk0GgaAwJb5-KcbcZ6SjLoSGKuA-Zgsg7gjb9mVxXxRQP2vU5LfGh93tSjBrN8p5E06SE5eXQa6UWIe1vF92KEgNaf83y10000__y30000)
  
## 2. BankSystem Subsystem
  - Mô tả: Subsystem này xử lý tất cả các giao dịch liên quan đến ngân hàng, bao gồm thanh toán trực tiếp cho nhân viên qua tài khoản ngân hàng.
  - Chức năng chính:
    - Xử lý thanh toán trực tiếp (Direct Deposit).
    - Tích hợp với các hệ thống ngân hàng bên ngoài để thực hiện giao dịch.
    - Gửi thông báo xác nhận giao dịch thành công.
  - Thành phần liên quan:
    - IBankSystem: Giao diện để giao tiếp với hệ thống ngân hàng.
      - Phương thức:
        - deposit(Paycheck, BankInformation) - Thực hiện giao dịch chuyển khoản.
    - BankInformation: Lớp chứa thông tin tài khoản ngân hàng của nhân viên.
  - Tương tác với hệ thống khác:
    - PayrollController: Gửi thông tin thanh toán cho hệ thống ngân hàng.
    - Employee: Cung cấp thông tin ngân hàng của nhân viên để thực hiện giao dịch.
**Biểu đồ ngữ cảnh**
- ![Diagram](https://planttext.com/api/plantuml/png/J8-nIWH138RxF4LA3xmNi933HSHkGJkn2BFZpR2poJ6R1PVZgYiiV0gn40GBsvl2ufvadi1NSEUms3GX-V_l9_bDFwjUAUhG1I2Z4h6cCKe8bR2MRYDIZtNrhruHjsLn_QmsCeKo0qHhb7WTx4c_6tkr7Mu1ftfex4PwhsTJhd7MjESdpoq_IUn8lV3Y4NO0TONBvUMSly2RdBuyZiVF0Kq-V0oeZjYXol6DOUOiuFoW2RrtENqRT3wd5yQr9y4cfrVZqBXXp6dFs3h9XtU6bUMclFy7003__mC0)
  
## 3. ProjectManagementDatabase Subsystem
  - Mô tả: Subsystem này cung cấp thông tin về các dự án và mã chi phí (charge codes) cần thiết để ghi nhận thời gian làm việc và chi phí dự án.
  - Chức năng chính:
    - Truy xuất mã chi phí (charge codes) liên quan đến các dự án.
    - Lưu trữ và truy cập thông tin về dự án.
    - Tích hợp với hệ thống quản lý thời gian làm việc (Timecard Management).
  - Thành phần liên quan:
    - IProjectManagementDatabase: Giao diện để truy cập cơ sở dữ liệu quản lý dự án.
      - Phương thức:
        - getChargeNumbers(String projectName) - Truy xuất mã chi phí theo tên dự án.
        - saveProject(Project project) - Lưu thông tin dự án.
    - Project: Lớp chứa thông tin về một dự án cụ thể.
  - Tương tác với hệ thống khác:
    - TimecardController: Sử dụng mã chi phí để cập nhật bảng chấm công.
    - PayrollController: Kết nối với dữ liệu dự án để tính toán lương cho các nhân viên làm việc theo dự án.
![Diagram](https://planttext.com/api/plantuml/png/Z90zQiD048NxFSMKSk4Bf0Y2JPaOGTG55sDfM2dihiJiA62CQv_319Scf8sA53g9Jk0hM49ouIPaclbvtvk1kRI_SH1aQPnLc4d5a9QECkHSLrwuifOOC42gPpd1xJYzLnEj55Ccw8qbIBXw7veNz6Z8aPSd5DnW8DWf6EBDaEW2sT2gSHlY4BqAbzv0FHbNw6Yndj207pJlY-PymmPahrIgORby_EFc0pptFwSjkEuJigA4kkZEAlclA-_RBx1btnwQiVw6xkXLJ3uV7tO5003__mC0)

## Tương tác giữa các Subsystem
  - PayrollController là trung tâm điều phối, kết nối PrintService, BankSystem, và ProjectManagementDatabase để:
    - Tính toán lương dựa trên dữ liệu từ ProjectManagementDatabase.
    - Thực hiện thanh toán qua BankSystem.
    - Gửi tài liệu thanh toán qua PrintService.

## Biểu đồ ngữ cảnh của Hệ thống PayRoll System:
![Diagram](https://planttext.com/api/plantuml/png/R59DIiD05DxFAHxTzm9PI6ah8YW8zGAlqo4pTlAcJ2R58AvTU0P14H64BWHNPk4Y9ya9l88pQMF6rcoID-_xUo_pNNsDSeVM5PbcLd27b6e1WmiihT4QPcNkH3O0pA4xkc7WdnXh5RcPi6l51SoAUHvnejO-ROoqtChlaVh6ePEvyjKv4gOY4-Icw72E-Q5jYvkEsIrZo9snC3ZELjgKGhI0hkYQkzacXbnu2zkY-hB3XMXRWMidBA4E1unrSZ0S7aMi12O5fS2RpvSLE5b_-C8fyfzDzQ0WLKYWwySCrggfxZZhcQtGxnG9d7c94hBw6RXKi9BrPX_SBos1awRQA2Zhjo9ulnRU44c2C_KJiMZjWHSFai2bJ_REGOOy508QM3JLFPU7sVeV-u-X7zAlb4l1b-pFzMWjTzjAu3I2ZGGjmYNy0G00__y30000)
