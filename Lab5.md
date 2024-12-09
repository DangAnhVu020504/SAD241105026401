# CÁC HỆ THỐNG CON CỦA HỆ THỐNG PAYROLL SYSTEM
## 1. Timecard Management System
- Chức năng chính:
  - Quản lý thông tin bảng chấm công của nhân viên.
  - Xác thực mã charge code.
  - Lưu trữ thông tin giờ làm việc.
- Thành phần chính:
  - Timecard Form: Giao diện cho nhân viên nhập giờ làm việc và mã charge code.
  - Timecard Controller: Logic kiểm tra và xử lý dữ liệu, xác thực mã charge code từ Project Management Database.
  - Timecard Database: Lưu trữ bảng chấm công.
  - Integration with Project Management Database: Lấy danh sách mã charge code hợp lệ.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://planttext.com/api/plantuml/png/P90nQiD044NxESMmjNq15yOWgRECmIxIJbQ3f5Yx4gjn8OoFOaX87KWWLLIa4FWUEa6kO4asM2Rjvxt_X_chVnUba9EzoO2qv0vLO8eihvWLKea1G45wHp6ZsgQ6DRa8Gx9TODWARgfIs0peDjpW0Ou04GazKpas_5jq1Jr_nAnT_i9QngKFz3hq0GASJkV3mWpLAcb_FWgCqxO-OTQycWcQvXrrGguxK-SHA-ZHGV7yNbcUF_SeIVDjOvJKZjmxsWtrw5FpfZkqhR_q_rfOi8twNrq0003__mC0)

## 2. Payroll Processing System
- Chức năng chính:
  - Tính lương dựa trên bảng chấm công và thông tin nhân viên.
  - Tạo phiếu lương và gửi thanh toán đến ngân hàng.
- Thành phần chính:
  - Payroll Engine: Thuật toán tính lương dựa trên các yếu tố như giờ làm việc, lương cơ bản, phụ cấp, và khấu trừ.
  - Employee Data Integration: Kết nối với Employee Database để lấy thông tin nhân viên.
  - Paycheck Generator: Tạo và lưu phiếu lương vào Paycheck Database.
  - Bank Integration Module: Gửi thông tin thanh toán đến ngân hàng thông qua hệ thống BankSystem.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://planttext.com/api/plantuml/png/PD51IiGm50RWVKxnw7uku49cQeiBNHHcBl1CGnFQ9gL9XIAkFOLe1JV2m2nSjOjP17gFdC0hc5PbEhXByhwy_uLy3SUrDbYRfYm8KgDg23PfAQJGfaQ_3G0rRFvA8SeSjgqsh9mB8I4LqXmp1a62RQsA0f9QKQQraDbI9iaM7iWZ8IaQl4FjB-n4oIZMAKI_HpFSNKKB4vTLeLh6pasy93wNSaRpSv94X6nWjRgSaoyWkE5kU15WNDyfC7OlEHJZOUna5f29JDHdJ_JMzUyjPC8Dpr3OrnBk_VA9dboyO8RRJ_zK8oH8Rj-an_P3dcpoOyT30nKNhZys_tF3YLoxOI-MxGn7FwHHjlFjo9h9TFgaRm000F__0m00)

## 3. Employee Management System
- Chức năng chính:
  - Quản lý thông tin nhân viên.
  - Thêm mới, chỉnh sửa, hoặc xóa thông tin nhân viên.
- Thành phần chính:
  - Employee Form: Giao diện để quản trị viên thực hiện các thao tác thêm, sửa, hoặc xóa.
  - Employee Controller: Logic xử lý các thao tác và đảm bảo dữ liệu hợp lệ.
  - Employee Database: Lưu trữ thông tin nhân viên.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://planttext.com/api/plantuml/png/LCyX3i9040LGFwUOh2Tu16b3aQWYi0FTj1lOeUaE90tXCiWcLQ2eGEn9E05NO5iGe2R_vtqnh-uHEQ5A3dO7j95zXIhEh67ZfA8G5PB36A2apPPoZMfkozs-rXeNnA6mcWNJsecs0vqlKZp16I0ZeJMvtqNohJum0OXnD9eEamcgPU4REqwVNKlZbRyISk4lZ4VZ6rRGem4dlPqzxsqPG3Y2KlWRvoY6_oSGQSxwlzu0003__mC0)

## 4. Charge Code Management System
- Chức năng chính:
  - Quản lý danh sách mã charge code.
  - Thêm, chỉnh sửa hoặc xóa mã charge code.
- Thành phần chính:
  - Charge Code Form: Giao diện để quản trị viên quản lý mã charge code.
  - Charge Code Controller: Logic xử lý, đảm bảo tính hợp lệ và tránh trùng lặp.
  - Project Management Database: Lưu trữ danh sách mã charge code.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://planttext.com/api/plantuml/png/L8yn3i8m34LtdyBANh4pe5PXhOHK1bQJHAH0KfIO0I4Emuh4n0O3Gq_I4t05qi80qvVjz_Jbr-EPHwR0UxS5Kjm458LsjQyZ1qgZG8fO0En8RMXbK4XB8QLijC6IVDevunchGsJZ1bhAii8Zd00qCIqf9ciMchLH_6jClyV1cPLJW0ApRFBHnoZcjhsuKTKzhZHQj3T2zMbMgLd0GFLuCdjQTlVh3hrDmQZ9MupjMTb_2NBZTV_f6m00__y30000)

## 5. Report Generation System
- Chức năng chính:
  - Tạo báo cáo dựa trên thông tin bảng chấm công, lương, hoặc nhân viên.
  - Hiển thị hoặc lưu trữ báo cáo.
- Thành phần chính:
  - Report Generator: Tạo báo cáo theo yêu cầu từ dữ liệu.
  - Data Integration Modules: Kết nối với Timecard Database, Paycheck Database, và Employee Database để lấy dữ liệu cần thiết.
  - Report Viewer: Hiển thị báo cáo trên giao diện hoặc lưu trữ dưới dạng file.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://planttext.com/api/plantuml/png/RD2nQiCm40RW_PxYq9uNw51YQfEbWqcoTBp8mXQn96FB1LCwzoaAJQ4KihH39tle8CXxw0dw2fLD8Gvq-U6EZ_lXVeRlPMEfjgqgWRWrDR8eKrBBnjOKHeRKO0HG4TzJBf2jHMLgYokXHG3IQDnqZHLgWklL1X_W4I0ZIpjgWjzA9JZL6SP_gmbkR-APIQdZXU3xIvFEIQAgqdH2N98a1eXmiRYUcg-GtRbZYzptxorQtnyCxbm87eB1I4OQkaTww_kt3ctXldIELchCfH-UiNGlwcpJ6Styy85bG4yjbgVFqq7dPvZyVrCNxbNZlNH7pG2MGcVZety1003__mC0)

## 6. Purchase Order Management System
- Chức năng chính:
  - Quản lý đơn mua hàng của nhân viên.
  - Theo dõi trạng thái đơn mua hàng.
- Thành phần chính:
  - Purchase Order Form: Giao diện để nhân viên tạo hoặc chỉnh sửa đơn mua hàng.
  - Purchase Order Controller: Xử lý logic, đảm bảo dữ liệu hợp lệ và cập nhật trạng thái đơn.
  - Purchase Order Database: Lưu trữ thông tin đơn mua hàng.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://planttext.com/api/plantuml/png/NCyz2i9048RXVaunR2_s5X8mwPG8yG9ZCcJ5x4Rsfn3n09RUG0yWM5YPmaBn7Zc1Lz3yLBRplKynd-eHM4V6ULK0fQuqA2ArASejiq2o605iA5rJpYZctgIIB6DiCZOu8_qxAzOEawrrh5emZsS9xc0Fa96ZPPF_mx0V-Zu4Y70m67TqX69Hty_bS2Bhwg0bshgw4BwExxD6vGdbywHp0MtSgR11q_VLevFFcyxHhNGF-XW2rbdpuXS00F__0m00)

## 7. Authentication and User Management System
- Chức năng chính:
  - Quản lý đăng nhập, phân quyền và xác thực người dùng.
- Thành phần chính:
  - Login Module: Giao diện và xử lý đăng nhập.
  - Access Control Module: Xác định quyền truy cập dựa trên vai trò (nhân viên, quản trị viên).
  - User Database: Lưu trữ thông tin người dùng, vai trò, và mật khẩu.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://planttext.com/api/plantuml/png/B8ynJiD044NxESNNzhu0GYYHtAOAAz4EwvLjWIV6EqQA44MK2t012g160ec6kA1mn3ts15m1EtOv_xt_fVdhVXP1kT6skYLskcbWRF2D0GTOefhT3USUPjbguKLBnrfk12mPHWyhbe5N0y9w6zHNf-RIhjPue4UYZ9MlEVXf5kbyJlifaKMIN4p-6SpnwRYN75B4mtjjw1IFtAOZlUfV7BI8tQU3vByViNikaVNVai_gUPBCwcKJ3s-uZzrkAFHVmwQMWhheNmLtxNR8nH0jl6JZu_y0003__mC0)

# Quan hệ giữa các hệ thống con:
- Timecard Management System gửi dữ liệu bảng chấm công đến Payroll Processing System để tính lương.
- Employee Management System cung cấp thông tin nhân viên cho cả Payroll Processing System và Report Generation System.
- Charge Code Management System tích hợp với Timecard Management System để xác thực mã charge code.
- Report Generation System truy xuất dữ liệu từ Timecard Database, Paycheck Database, và Employee Database.
- Purchase Order Management System có thể tích hợp với Payroll Processing System để theo dõi các khoản chi phí liên quan đến đơn mua hàng.

## Biểu đồ ngữ cảnh của hệ thống PayRoll System:
![Diagram](https://planttext.com/api/plantuml/png/Z9IxYjj058RxUOg3-iLzYh2sB5maYWUlYsrdHuD7iJGoer70XDGXPHuWP1r8is2o8QdiOWi5luUU8A-GCxAiQ7o15KYWEP_-yvyB-hjzkiuDqwP84yAuoJHuGRf8igKG7h0SWiDfFqfZ5UT6CtojG_r3QC3K76wMkH5f7HWGic1ypcO2FCgMEakIDloU05vQSCFKB44WPB4oUCCqJWLdEgebmkanHtN6HPv38rXJb1vJ8w44EXGm4OjCcxp6HfFJfCgwSoeDWulMVCaquduMYRrYwFiN96cXkMIvWB6EX6veEYOV28cOONSsv1rAXM5pL6DJVzXX3jvS9kWYs0ek1P-x27KGdRr5Zx1tbmfbZk3GeHtpH-HuI4W0LrSlSJZm0hmtijgi5prVLjjFIa9URTSCPd6r_G99UPzw135BOraMVxrxB7eZ6OEotwbp99gnv6svuc1GzYS7lkyynyvxXFJt6BNKAmI-nc2gpIe3KwxHGh9xtAtKp2D8T3DNc-zBYAhj3qWmwSV2oTsmmGLKoVARWdTn-Q1QbjRijCwya76rUIfESWyiCiAUe4LP_bOpCBX8HZBqQR9ofTfoHfF_QdSbFZW-F8B7pwwXOUa5jFNMSC-gjN4N1hKxMJwalHixujvj-OkvQ1XqP7sx5ViXcsxfPyLz_wowCtKBTRR3qNVNezbEEcuRUhITVpvZ7o0j6CZotZR4ihNskDtHKuXS2nNP_-C_0000__y30000)
