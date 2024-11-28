# LAB3: IDENTIFY DESIGN ELEMENTS
## Xác định các phần tử thiết kế của hệ thống “Payroll System”
### 1. Subsystem context diagrams
- Biểu đồ ngữ cảnh của các hệ thống con:
### BankSystem:
+ ![Digram](https://www.planttext.com/api/plantuml/png/h5HBReCm4Drp2ejLkaWEWAegZTe5kqYSO68cgHKmQ3n6ZTgSh8iUgLUemIGnYIDrKIyGl7apy-PZVhw-buQ1sDPLqeBSmmv5MjYDEHZ6MgofUJ-auYCHxiWAZ14hqFl2MptiJqkDH6FMSAXHyqnfmsGbgqPdOWJp2_OmWF8DvJw8iKD-bhAncbTGWPOu0_-Pbvaec9JUESTUGAwt3TNGXmhy3UgoO73IUWdczEPTpWONecjKEVWTasDogJlNZBG5YQUArGaG-T_AXln_whvJvbJkgsR5LzEvJJcHomJQm81VUXhO2IMg3ccK4s50xGrbOpSLnaE_k4vded-EggS2X_AdNHp1gAQx6KkN83V6OdalsLKF9pblLYkmIKk4vsb4KaC7gWA7nIZ3b89zcS-VOdF9H3fk3veqmlTjSYn2jgHlETVLUIefxFg0uSO-VYuMuSLrJ5MtrN0T77Nfxat_0_W5003__mC0)
### Giải thích từng thành phần trong biểu đồ:
- **Interface (Giao diện):**
  - IBankSystem (Giao diện):
    + Phương thức:
      + processPayment(anInstruction: PaymentInstruction): Paycheck
        + Mô tả: Xử lý một yêu cầu thanh toán và trả về một phiếu lương.
      + getAccountBalance(): BankInformation
        + Mô tả: Lấy thông tin số dư tài khoản.
- **Subsystem Proxy (Đại diện hệ thống con):**
  -  BankSystem (Lớp)
    + Phương thức:
      + processPayment(instruction: PaymentInstruction): Paycheck
        + Mô tả: Thực hiện xử lý thanh toán dựa trên hướng dẫn thanh toán và trả về phiếu lương.
      + getAccountBalance(accountId: String): BankInformation
        + Mô tả: Lấy thông tin số dư tài khoản dựa trên ID tài khoản.
      + sendStatement(statement: BankStatement): void
        + Mô tả: Gửi bản sao kê ngân hàng.
    + Quan hệ:
      + Thực hiện giao diện IBankSystem.
      + Xử lý đối tượng PaymentInstruction.
      + Trả về đối tượng Paycheck.
      + Lấy thông tin từ đối tượng BankInformation.
- **Entity (Thực thể):**
  - PaymentInstruction
  - Paycheck
  - BankInformation
        
### PrintService:
+ ![Diagram](https://www.planttext.com/api/plantuml/png/Z9DDRi8m48NtEOML5KWD1uYgYWLTP8UK4mpEG2qSEx8d4QZbP5rm9AvGvyUDGr2fLoFFyyoNDvFRztLj2GpLfOmgu4Su88lpUcVFbh1aMwDFvvXzHimTBi5QToKKvMWQmN58zATg4nlDwn8LBOeXI9c_UkaLQDA-1ffboXejYg06_q1-x3iGK6qNmvEiI5bEBZuiVT2zkaINQEH-LoJe3jTtdw1wkB5ioA1TnnPybjbhKy8yaIH986f0YW88Vvrmn3kj9O8QaE_DH3FtCVpa86SxLnuafEP0GgidSCzc54vawctMCks1exTN-0kM_NCbOFDW9xJQ_h4L7SEaV9AyZJDDMLmPpT5QjF5SvzrrihfJJ4bVlrQhwJexeIWhYMrn9r-ZAjeVumS00F__0m00)
### Giải thích từng thành phần trong biểu đồ:
-**Interface (Giao diện):**
  - IPrintService:
    + Phương thức:
      + printDocument(aDocument: Document, onPrinter: Printer): void: In một tài liệu lên máy in.
- **Subsystem Proxy (Đại diện hệ thống con):**
  - PrintService:
    + Phương thức:
      + printDocument(document: Document, printer: Printer): void: In một tài liệu lên máy in.
      + checkPrintStatus(printerld: String): String: Kiểm tra trạng thái in của máy in.
    + Quan hệ:
      + Thực hiện giao diện IPrintService.
      + Xử lý đối tượng Document.
      + Sử dụng đối tượng Printer.
- **Entity (Thực thể):**
  - Document:
    + Phương thức:
      + validateDocument(): boolean: Kiểm tra tính hợp lệ của tài liệu.
  - Printer:
    + Phương thức:
      + printDocument(document: Document): void: In một tài liệu lên máy in.
        
### ProjectManagementDatabase subsystems:
+ ![Diagram](https://www.planttext.com/api/plantuml/png/h5D1JiCm4Bpd5LPEhOJxW0YX7i8X1n1INx29jv71TY9xNQYWB-F0a_W2Jfg8H0u8fFfaxSxCUcVNd-yVMqTWoMkLj50zGOqitVdI7HsXPW-sUJccx3LXuLGAdEj2ZrZH7PY0rMWe1u8I70weywcH1c1Xzisg7UuYOpkoqjJhR1Jgw1EYRmKGJd8nzue52Cm4WjoXaQBNEIMdvBkNMqEIbbleYBD7HvNYt3reNCYMNeIECoOQNogS98Avv5t4u9mlcfKZWLHkjLweCNTc01fyplzkHc48xHug7FsGOu0L4u5BJBCl_FEkS7up6qF6Kej12m_eql_nphu4LjJ2zTjcyyk-1gxKhUg3WRv58xfly0K00F__0m00)
+ ### Giải thích từng thành phần trong biểu đồ:
-**Interface (Giao diện):**
  - IProjectDatabase (Giao diện):
    + Phương thức:
      + getProjectInfo(projectId: String): ProjectData: Lấy thông tin dự án dựa trên ID dự án.
-**Subsystem Proxy (Đại diện hệ thống con):**
  - ProjectManagementDatabase (Lớp):
    + Phương thức:
      + getProjectInfo(projectId: String): ProjectData: Thực hiện lấy thông tin dự án dựa trên ID dự án.
      + updateProjectData(projectld: String, data: ProjectData): void: Cập nhật thông tin dự án.
    + Quan hệ:
      + Thực hiện giao diện IProjectDatabase: Lớp này hiện thực hóa giao diện IProjectDatabase.
      + Xử lý đối tượng ProjectData: Lớp này hoạt động trên đối tượng ProjectData.
-**Entity (Thực thể):**
  - ProjectData (Lớp):
    + Phương thức:
      + getProjectDetails(): String: Lấy thông tin chi tiết về dự án.
      + updateProjectDetails(newData: ProjectData): void: Cập nhật thông tin chi tiết về dự án.

### 2. Analysis class to design element map
#### Ánh xạ các lớp phân tích đến các phần tử thiết kế:

|       **Analysis Class**       |       **Design Element**        |
|--------------------------------|---------------------------------|
| **LoginForm**                  | **LoginForm**                   |
| **MaintainTimecardForm**       | **MainEmployeeForm**            |
|                                | **TimecardForm**                |
|                                |  **MainApplicationForm**        |
| **TimecardController**         | **TimecardController**          |
| **SystemClockInterface**       | **SystemClockInterface**        |
| **PayrollController**          | **PayrollController**           |
| **Paycheck**                   | **Paycheck**                    |
| **PaymentInstruction**         | **PaymentInstruction**          |
| **Employee**                   | **Employee**                    |
| **IEmployeeRepository**        | **IEmployeeRepository**         |
| **IPaymentRepository**         | **IPaymentRepository**          |
| **BankSystem**                 | **BankSystem**                  |
| **IBankSystem**                | **IBankSystem**                 |
| **ProjectManagementDatabase**  | **ProjectManagementDatabase**   |
| **IProjectDatabase**           | **IProjectDatabase**            |
| **ProjectData**                | **ProjectData**                 |


### 3. Design element to owning package map
#### Ánh xạ các phần tử thiết kế vào các gói

|    **Design Element**      |           **"Owning" Package**             |
|----------------------------|--------------------------------------------|
| **UserInterface**          | Middleware::Presentation::GUI Framework    |
| **PayrollController**      | Applications::Payroll::BusinessLogic       |
| **TimecardController**     | Applications::Payroll::BusinessLogic       |
| **EmployeeRepository**     | DataAccess::Employee::Repository           |
| **PaymentRepository**      | DataAccess::Payment::Repository            |
| **Database**               | DataAccess::Database::Connection           |
| **Paycheck**               | BusinessServices::Payroll::Artifacts       |
| **PaymentInstruction**     | BusinessServices::Payroll::Artifacts       |
| **IEmployeeRepository**    | Interfaces::Employee::RepositoryInterface  |
| **IPaymentRepository**     | Interfaces::Payment::RepositoryInterface   |
| **IBankSystem**            | Interfaces::Bank::SystemInterface          |
| **IProjectDatabase**       | Interfaces::Project::DatabaseInterface     |
| **BankSystem**             | Subsystems::Bank::PaymentProcessing        |
| **ProjectManagementDatabase** | Subsystems::Project::DatabaseManagement |
| **ProjectData**            | BusinessServices::Project::DataArtifacts   |

### 4. Architectural layers and their dependencies
#### Architectural layers and their dependencies
-**Biểu đồ mô tả các layers trong hệ thống và quan hệ giữa chúng**
![Diagram](https://planttext.com/api/plantuml/png/V9FDJeD04CVlFCM4U-FTWschhJ5farhqP3nCjzDsPJzmTqWanYVpu2Fv2kv2Fy3GdWZ3_dyp_0P-lt-6dj5ngLNYSsaATAYXG97ZbZAk584ZmMYsYf9aNuVqsPE31yFaDYW8PbYHI-4p0NYPsQqqK-lqQxoRepIZeb1I84jxgZz9JGBTkYbyjT3Zqaj3taC4YGvwWPMpIjrQm_5AheFwLvxeGjcA29PKM2_PkghRw0uPOIH4tQlL9TPNwAb3QKEQIJGPFeUUV0Gp1XLavSfNdabtMupHv5bTRsZElWN9SpGX7RcT4HPEHj5rXvPT60nk-fJ0DQIXhPQS9htwcs2FjPXSqdj9dk7mE33wJjQ87ZSHyLYIgqAkPxHBiIcnsC5nQr51WFGThYb7HSViLHOU7uFdkhVKrwR8h66_pV11UtQbYAOk40xxYF5xCkIGAIB4ZaH-oTVvDP_UVtycZBAnQP8CmtZnr_m3003__mC0)
