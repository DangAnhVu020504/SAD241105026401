import java.util.HashMap;
import java.util.Map;

// Lớp Timecard đại diện cho bảng chấm công
public class Timecard {
    private int employeeId;
    private Map<String, Integer> chargeHours; // Charge code -> Hours worked

    public Timecard(int employeeId) {
        this.employeeId = employeeId;
        this.chargeHours = new HashMap<>();
    }

    // Cập nhật giờ làm việc cho mã charge code
    public void updateHours(String chargeCode, int hours) {
        chargeHours.put(chargeCode, chargeHours.getOrDefault(chargeCode, 0) + hours);
    }

    // Hiển thị thông tin bảng chấm công
    public void display() {
        System.out.println("Bang cham cong cho ma nhan vien: " + employeeId);
        for (Map.Entry<String, Integer> entry : chargeHours.entrySet()) {
            System.out.println("Charge Code: " + entry.getKey() + ", Hours: " + entry.getValue());
        }
    }

    // Lưu bảng chấm công
    public void save() {
        System.out.println("Bang cham cong da duoc luu cho ma nhan vien: " + employeeId);
    }
}
