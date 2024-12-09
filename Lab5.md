# Phân tích các hệ thống con của Payroll System
1. Run Payroll (Chạy bảng lương)
1.1. Chức năng chính
Hệ thống Run Payroll tập trung vào việc tính toán, quản lý, và lưu trữ dữ liệu lương cho nhân viên.

Nhập thông tin lương:

Cho phép nhập dữ liệu chi tiết như thời gian làm việc, các khoản thưởng/phụ cấp và khấu trừ.
Dữ liệu này sẽ được xử lý tự động bằng các công thức và quy tắc do hệ thống cấu hình sẵn. Điều này giảm thiểu sai sót so với cách tính thủ công.
Tính toán bảng lương:

Hệ thống sử dụng dữ liệu đầu vào để tính toán tổng thu nhập (Gross Salary), khấu trừ (thuế thu nhập, bảo hiểm xã hội, bảo hiểm y tế), và lương thực nhận (Net Salary).
Việc tích hợp các quy định pháp luật (như thuế suất) đảm bảo tính tuân thủ và chính xác.
Tạo và xuất báo cáo:

Báo cáo chi tiết lương từng cá nhân và tổng chi phí lương của tổ chức giúp bộ phận tài chính phân tích và đưa ra quyết định chiến lược.
Tùy chọn xuất báo cáo dưới nhiều định dạng (PDF, Excel, CSV) tăng tính tiện dụng.
1.2. Use Case Analysis
Chạy bảng lương:

Người dùng chính là Payroll Administrator, chịu trách nhiệm điều hành và giám sát quá trình tính toán bảng lương.
Kết quả đầu ra là bảng lương chi tiết được lưu trữ an toàn.
Tạo báo cáo:

Quá trình này thường được thực hiện để báo cáo lên cấp trên hoặc phục vụ các mục đích kiểm toán.
1.3. Biểu đồ Use Case
Biểu đồ thể hiện rõ hai chức năng chính: chạy bảng lương và tạo báo cáo.
Quan hệ giữa các tác nhân (Payroll Administrator) và hệ thống được xác định chặt chẽ.
2. Maintain Timecard (Duy trì thẻ thời gian)
2.1. Chức năng chính
Timecard là công cụ ghi nhận thời gian làm việc, nghỉ phép, và các hoạt động liên quan đến lịch trình của nhân viên.

Nhập thẻ thời gian:

Cho phép nhân viên ghi lại giờ làm việc chi tiết, thời gian nghỉ phép và lý do.
Tính năng này cần giao diện dễ sử dụng và hỗ trợ nhiều thiết bị (như PC hoặc smartphone).
Chỉnh sửa và gửi thẻ thời gian:

Nhân viên có thể cập nhật thẻ thời gian trước khi gửi tới quản lý.
Tính năng gửi thông báo giúp quản lý xử lý nhanh các yêu cầu.
Phê duyệt thẻ thời gian:

Quản lý có thể kiểm tra, chỉnh sửa (nếu cần), và phê duyệt hoặc từ chối yêu cầu.
Lịch sử phê duyệt được lưu trữ để đảm bảo minh bạch và dễ dàng truy xuất khi cần.
2.2. Use Case Analysis
Nộp thẻ thời gian:

Nhân viên (Employee) nhập và gửi dữ liệu thẻ thời gian.
Kết quả là thẻ thời gian được chuyển tới quản lý.
Phê duyệt thẻ thời gian:

Quản lý (Manager) kiểm tra và phê duyệt, đảm bảo thời gian làm việc được ghi nhận chính xác.
2.3. Biểu đồ Use Case
Biểu đồ minh họa cách các tác nhân tương tác với hệ thống trong việc duy trì thẻ thời gian, từ nhân viên nộp thẻ đến quản lý phê duyệt.
3. Login (Đăng nhập)
3.1. Chức năng chính
Hệ thống đăng nhập là cửa ngõ để đảm bảo rằng chỉ những người được cấp quyền mới có thể truy cập.

Đăng nhập:

Người dùng nhập thông tin tài khoản và hệ thống kiểm tra thông tin này thông qua quy trình xác thực.
Đảm bảo dữ liệu đăng nhập được mã hóa để bảo vệ thông tin cá nhân.
Khôi phục mật khẩu:

Cung cấp tùy chọn khôi phục mật khẩu qua email hoặc trả lời câu hỏi bảo mật.
Tăng cường tính an toàn bằng cách xác minh danh tính người yêu cầu.
Quản lý quyền truy cập:

Phân quyền người dùng theo vai trò (Employee, Manager, Administrator).
Đảm bảo mỗi vai trò chỉ truy cập được các chức năng phù hợp.
3.2. Use Case Analysis
Đăng nhập vào hệ thống:

Người dùng nhập đúng thông tin để truy cập các chức năng liên quan.
Nếu thất bại, hệ thống hiển thị thông báo lỗi.
Khôi phục mật khẩu:

Quy trình này đảm bảo người dùng lấy lại quyền truy cập một cách an toàn và nhanh chóng.
3.3. Biểu đồ Use Case
Biểu đồ thể hiện hai hành động chính: đăng nhập và khôi phục mật khẩu, với các bước và kết quả rõ ràng.
Yêu cầu hệ thống
1. Yêu cầu chức năng
Các chức năng như Run Payroll, Maintain Timecard, và Login phải được thực hiện mượt mà, chính xác và phù hợp với nhu cầu của từng loại người dùng.
2. Yêu cầu phi chức năng
Hiệu suất: Tốc độ xử lý nhanh, đặc biệt khi số lượng nhân viên lớn.
Bảo mật: Mã hóa dữ liệu, tuân thủ các quy định về bảo vệ dữ liệu như GDPR.
Khả năng mở rộng: Hệ thống phải dễ dàng mở rộng để xử lý lượng người dùng và dữ liệu tăng lên.
Khả năng sử dụng: Giao diện thân thiện, trực quan, giúp giảm thời gian đào tạo người dùng.
Kiến trúc hệ thống
Mô hình nhiều lớp:

Giao diện người dùng (UI): Tương tác trực tiếp với người dùng, cung cấp các biểu mẫu nhập liệu và hiển thị thông tin.
Lớp dịch vụ (Service Layer): Xử lý logic nghiệp vụ, đảm bảo các chức năng hoạt động như mong đợi.
Lớp dữ liệu (Data Layer): Lưu trữ và truy xuất dữ liệu một cách an toàn, hiệu quả.
UML:

Biểu đồ minh họa mối quan hệ giữa các thành phần trong hệ thống, giúp hình dung cách dữ liệu và quy trình luân chuyển giữa các lớp.
