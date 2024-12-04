# CÁC CA SỬ DỤNG CHO HỆ THỐNG "PAYROLL SYSTEM" 
## 1. Maintain Timecard (Duy trì bảng chấm công)
  - Mô tả chi tiết:
    - Actor chính: Employee (Nhân viên)
    - Mục tiêu:
      - Nhân viên nhập hoặc cập nhật giờ làm việc vào bảng chấm công.
      - Sử dụng mã charge code để phân loại công việc.
      - Lưu dữ liệu bảng chấm công để phục vụ tính lương.
    - Thành phần liên quan:
      - Employee: Người thao tác với hệ thống.
      - Timecard: Chứa thông tin giờ làm việc và mã charge code.
      - ProjectManagementDatabase: Cung cấp danh sách mã charge code hợp lệ.
      - Timecard Database: Lưu trữ bảng chấm công.
  - Các bước thực hiện:
    - Nhân viên mở giao diện bảng chấm công.
    - Hệ thống kiểm tra xem đã có bảng chấm công hay chưa:
    - Nếu chưa có, tạo bảng mới.
    - Nếu đã có, hiển thị thông tin hiện tại.
    - Nhân viên nhập giờ làm việc và chọn mã charge code.
    - Hệ thống xác thực mã charge code từ ProjectManagementDatabase.
    - Sau khi xác thực, hệ thống lưu bảng chấm công vào Timecard Database.
    - Hệ thống hiển thị thông báo xác nhận thành công.
### Sơ đồ chi tiết:
![Diagram](https://planttext.com/api/plantuml/png/X99DJiCm48NtFiKe-rw01QgWL69HKL74VkeCQS2nmtXC5I5Ene8ZSGN6wL-WhLX4iSVV6xytoVVdrpWAigJ66RGI66wQreME233cjJ5CLj1NZg2OOUr57tYe6xB89IpICdPHg2dWtG0iG_8bSWV5dfW6raDjbXUAsE25WniGrvkA8-wvmrPfybBBiDq41PSOgKTpTN8rmEOSdjKkpD1ZHOsMVmlcCyK_ZD5WC1fTzfxW0egxbWQXUikcFylGmL16x-arKHImYJdtbwsgC0CkopRcicHAObUWixLCA0IUrWFPbZjraoJsUn9AqjcxU7JHBiIaZgt3xeJWRznRtoQ1TU0NM8N4yMnO_RnDBP3QKdsNvxFckMR-4LsTKR0hv4fVeQHZmuV9BF2D_k--iwtbfrgNCLbBKVkEoPVvp_q1003__mC0)

## 2. Process Payroll (Xử lý lương)
  - Mô tả chi tiết:
    - Actor chính: Administrator (Quản trị viên)
    - Mục tiêu:
      - Tính toán lương dựa trên giờ làm việc, thưởng, phụ cấp.
      - Tạo phiếu lương.
      - Gửi thông tin thanh toán đến ngân hàng.
    - Thành phần liên quan:
      - Timecard Database: Lấy giờ làm việc.
      - Employee Database: Thông tin nhân viên.
      - Paycheck Database: Lưu phiếu lương.
      - BankSystem: Xử lý giao dịch thanh toán.
  - Các bước thực hiện:
    - Quản trị viên khởi động quá trình tính lương.
    - Hệ thống lấy dữ liệu bảng chấm công từ Timecard Database và thông tin nhân viên từ Employee Database.
    - Hệ thống tính toán tổng thu nhập, phụ cấp và khấu trừ.
    - Tạo phiếu lương và lưu vào Paycheck Database.
    - Gửi thông tin thanh toán đến BankSystem.
    - Hiển thị kết quả quá trình cho quản trị viên.
### Sơ đồ chi tiết:
![Diagram](https://planttext.com/api/plantuml/png/R99DJWCn38NtEOMLVI_00fMsmBPIkO2RCMtK_5InHsY4E1aBZiGLY3DKxMYwjFFPUU_9lzy_InOiqiTWq4akyDH5dpnBGQsGnuOnXPnWEWG2kyMXv11WMx8ZPfyEiEltFB1GjF1f05nEKf4hkXuRWOhLdTUomfJ4om3spKToM3hOeE0UcHggtStg1dkEvv07eYbMknEgVkoEv4vJgdORDLfTOJhjccfzqyfy6TFymcBnUACI7i3kD2UOUxVcXjEnKR6El92u8yZ5LrUbpEWc_0hJnTrTUAfeZS7r0OM0CM3nnBE1PbZPLqfK53t_1pDdDO1cb5AdMAnPGhs3n3KkdrETQCWT8Jcz-nA1UwUXp3QFaUhgO_xGrIr2xcF4CbYph1_g0Vu1003__mC0)

## 3. Generate Reports (Tạo báo cáo)
  - Mô tả chi tiết:
    - Actor chính: Administrator (Quản trị viên)
    - Mục tiêu:
      - Tạo báo cáo về bảng chấm công, lương hoặc nhân viên.
      - Hiển thị báo cáo hoặc lưu trữ.
    - Thành phần liên quan:
      - Timecard Database: Dữ liệu giờ làm việc.
      - Paycheck Database: Dữ liệu lương.
      - Employee Database: Dữ liệu nhân viên.
  - Các bước thực hiện:
    - Quản trị viên chọn loại báo cáo cần tạo.
    - Hệ thống truy xuất dữ liệu từ các cơ sở dữ liệu liên quan.
    - Hệ thống tạo báo cáo và hiển thị cho quản trị viên hoặc lưu trữ nếu cần.
### Sơ đồ chi tiết:
![Diagram](https://planttext.com/api/plantuml/png/R90nRiCm34LtdeBGdWjqADBKIFVa1BH5j0PaogMemIXwiWuvKgvGIMwT5iYch__uGF3wTTad8xKy1Q31ekAJdqOPaodLH6dz050UZEGrCBeJpr4DpxbFIpAU77u0OX-pUD9bwuzHIrKCzL608Off35l_lER0sgXRB2oBZLPK7HdrbBWHtG4-0Te-kDizDYy-e3jpACkXhbfRPdRGkWhTj1KzyNlcjB6-w1tyGUf4TwZaaMru-y-LufxHiifzq--2BonSxib8uj6FQGwq_AWTx5byFVyt0000__y30000)

## 4. Manage Employee (Quản lý nhân viên)
  - Mô tả chi tiết:
    - Actor chính: Administrator (Quản trị viên)
    - Mục tiêu:
      - Thêm, sửa hoặc xóa thông tin nhân viên trong hệ thống.
    - Thành phần liên quan:
      - Employee Database: Lưu trữ thông tin nhân viên.
- Các bước thực hiện:
    - Quản trị viên chọn chức năng thêm, sửa, hoặc xóa nhân viên.
    - Nếu thêm mới, nhập thông tin nhân viên và gửi yêu cầu.
    - Nếu sửa, chọn nhân viên cần chỉnh sửa, cập nhật thông tin và gửi yêu cầu.
    - Nếu xóa, chọn nhân viên cần xóa và xác nhận.
    - Hệ thống thực hiện hành động tương ứng trong Employee Database.
    - Hiển thị kết quả (thành công hoặc thất bại).
### Sơ đồ chi tiết:
![Diagram](https://planttext.com/api/plantuml/png/P95DJWCn38NtEOMLVJLx5gY5AJisL1p0Ct5BfFnKZYCqGfoC1KVY2YGPLHEfkzZ-yjwBy_Vpkq-2BDaxXRD4XeFnDjWaZBN2j3QKOfe5myKHwAE_khWGmIi6l92d873AKrgIaDVmfG2cc8D1NZhu9N8P5i5wACWSWt1q7V6yTXnnuxQoqCN3IYytek24YHfQkkEJ-bQgXONTxh6vm0FeWp73qLWPHd8a13S1hHfHqSseNYWlyLQWRCF6e5Kth6npgjZxrM0dj-LHAt8l_4QIEK3Ayqmf3MUqBZFTETo2dpxYPrtIsRB7DSkUWga_zGy00F__0m00)

## 5. Maintain Charge Codes (Duy trì mã charge code)
  - Mô tả chi tiết:
    - Actor chính: Administrator (Quản trị viên)
    - Mục tiêu:
      - Thêm, chỉnh sửa hoặc xóa mã charge code trong cơ sở dữ liệu.
    - Thành phần liên quan:
      - Project Management Database: Lưu trữ mã charge code.
  - Các bước thực hiện:
    - Quản trị viên chọn chức năng thêm, sửa, hoặc xóa mã charge code.
    - Nhập thông tin mã charge code và gửi yêu cầu.
    - Hệ thống cập nhật cơ sở dữ liệu mã charge code.
    - Hiển thị thông báo kết quả.
### Sơ đồ chi tiết:
![Diagram](https://planttext.com/api/plantuml/png/P94zRiCm38LtdOBm7dZlK2Irsor0qA07e2t6Lg6VWA9G14LFrg57wXKgAIWS8vieVdplYVhz_jb6GPRahC9H0iDEE-DD5CPIORnUACKq2lh94ZJTZ3mHT44JxD7ZH8wym34DyHA5N0EV2c08oMlaovf_2PpxMROSCZK6Bnpi6kgkbvQueakP1xAJaInwuF2U8zq6w55mm4XrwB3ldzINKZK-R3QFrH4UeDbftJvh8srFbYIxBSwDgb2X5zCoaz_cZC0uvnLGRDHDjy35h61lPurhnIMKgj2zz2j9OWynZIF5s9xGsCHqP_6V_ZY7ZxAras67Oe9lr9QyBX_u1m00__y30000)

## 6. Manage Purchase Orders (Quản lý đơn mua hàng)
  - Mô tả chi tiết:
    - Actor chính: Employee (Nhân viên)
    - Mục tiêu:
      - Tạo, chỉnh sửa hoặc theo dõi đơn mua hàng.
    - Thành phần liên quan:
      - PurchaseOrder Database: Lưu trữ đơn mua hàng.
  - Các bước thực hiện:
    - Nhân viên chọn chức năng tạo mới hoặc cập nhật đơn mua hàng.
    - Nhập thông tin đơn mua hàng hoặc cập nhật trạng thái đơn.
    - Gửi thông tin đến hệ thống.
    - Hệ thống lưu hoặc cập nhật thông tin đơn mua hàng trong PurchaseOrder Database.
    - Hiển thị thông báo kết quả.
### Sơ đồ chi tiết:
![Diagram](https://planttext.com/api/plantuml/png/T95FIaCn48VtESNmzgLx5r9iTISjBHvWNjwq3UHFcKoKXtWo5nx9ApY9I9NWAfFm_UPZ9f_l7wiio5A2DsWbCTo7Yqyp4M2kjJ5CLZ2UFC6mAspFc0csF1738qOyKQ0eS2XZdhDG6E3L08ofn0bvxY8FYHNHrhLGqAOed7p7hR_VFN6ZhrVDgCz9ttg3WgDUMs2ttToPDsDq0bWiRfiERc1OCw7GykaowG5_EmocKHM_-cf8XmjEEleNL3DLsMXy9j15_kDeME_OanIEa8krbFFoYCuNfaxoCyVXd5xgyewE0ufBSJ0hYbFznYy0003__mC0)


# Tài liệu giải thích lý do thiết kế ca sử dụng cho hệ thống Payroll System
**- Giới thiệu:**
- Hệ thống Payroll System được thiết kế để tự động hóa các quy trình quản lý bảng chấm công, xử lý lương, duy trì mã charge code, quản lý nhân viên, và hỗ trợ tạo báo cáo. Các ca sử dụng được xây dựng dựa trên:
  - Yêu cầu chức năng từ tài liệu phân tích và thiết kế.
  - Mô hình hóa các hoạt động thực tế của nhân viên và quản trị viên.
  - Đảm bảo khả năng mở rộng và tích hợp hệ thống trong tương lai.
      
## 1. Maintain Timecard (Duy trì bảng chấm công)
- Lý do thiết kế:
  - Nhân viên cần nhập thông tin giờ làm việc hằng ngày để phục vụ tính toán lương. Điều này đòi hỏi sự tích hợp chặt chẽ giữa dữ liệu bảng chấm công (Timecard) và danh sách mã charge code (Project Management Database).
  - Mô-đun duy trì bảng chấm công được chia thành các thành phần rõ ràng:
    - Timecard Form: Giao diện nhập liệu thân thiện cho nhân viên.
    - Timecard Controller: Xử lý logic như xác thực mã charge code, đảm bảo dữ liệu hợp lệ.
    - Timecard Database: Lưu trữ thông tin để sử dụng trong quy trình tính lương.
      
## 2. Process Payroll (Xử lý lương)
- Lý do thiết kế:
  - Đây là chức năng cốt lõi của hệ thống, đảm bảo tính chính xác trong việc tính lương, tạo phiếu lương, và gửi thanh toán đến ngân hàng.
  - Hệ thống được thiết kế để xử lý nhiều loại hình nhân viên:
    - Hourly Employee: Tính toán dựa trên giờ làm việc.
    - Salaried Employee: Tính toán dựa trên lương tháng cố định.
    - Commissioned Employee: Tính toán thêm dựa trên hoa hồng.
  - Việc phân tách các thành phần như Payroll Controller, Timecard Database, và BankSystem giúp hệ thống dễ mở rộng và bảo trì.
    
## 3. Generate Reports (Tạo báo cáo)
- Lý do thiết kế:
  - Quản trị viên cần khả năng tạo báo cáo linh hoạt dựa trên dữ liệu bảng chấm công, lương và thông tin nhân viên để đưa ra các quyết định chiến lược.
  - Hệ thống báo cáo được thiết kế để:
    - Truy xuất dữ liệu từ các cơ sở dữ liệu khác nhau (Timecard Database, Paycheck Database, Employee Database).
    - Tạo báo cáo theo yêu cầu và hiển thị cho người dùng hoặc lưu trữ để tham khảo sau này.
   
## 4. Manage Employee (Quản lý nhân viên)
- Lý do thiết kế:
  - Quản lý thông tin nhân viên là một yêu cầu cơ bản trong hệ thống nhân sự. Điều này bao gồm việc thêm mới, chỉnh sửa hoặc xóa thông tin.
  - Việc chia hệ thống thành các thành phần Employee Form, Employee Controller, và Employee Database giúp đảm bảo:
    - Dữ liệu nhân viên được quản lý tập trung.
    - Dễ dàng thêm các trường thông tin mới nếu yêu cầu thay đổi trong tương lai.
      
## 5. Maintain Charge Codes (Duy trì mã charge code)
- Lý do thiết kế:
  - Charge code là một yếu tố quan trọng để phân loại công việc và xác định dự án mà nhân viên làm việc. Việc duy trì charge code giúp đảm bảo tính nhất quán trong quản lý bảng chấm công.
  - Phân chia các thành phần trong mô-đun:
    - Charge Code Form: Giao diện thân thiện để quản trị viên thêm, sửa hoặc xóa mã charge code.
    - Charge Code Controller: Xử lý logic như kiểm tra trùng lặp, xác thực thông tin trước khi lưu.
    - Project Management Database: Lưu trữ mã charge code và hỗ trợ tra cứu nhanh.
      
## 6. Manage Purchase Orders (Quản lý đơn mua hàng)
- Lý do thiết kế:
  - Nhân viên cần công cụ để theo dõi và quản lý các đơn mua hàng liên quan đến dự án hoặc công việc.
  - Hệ thống này được thiết kế để:
    - Lưu trữ đơn mua hàng trong Purchase Order Database.
    - Cập nhật trạng thái hoặc thông tin đơn mua hàng theo thời gian.
    - Việc tích hợp với các thành phần khác giúp hệ thống mở rộng hỗ trợ quản lý tài chính toàn diện.
