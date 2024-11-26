import java.util.HashMap;
import java.util.Map;

// Lớp TimecardController để quản lý các bảng chấm công
public class TimecardController {
    private Map<Integer, Timecard> timecards;

    public TimecardController() {
        this.timecards = new HashMap<>();
    }

    // Lấy bảng chấm công hiện tại hoặc tạo mới nếu chưa có
    public Timecard getTimecard(int employeeId) {
        return timecards.computeIfAbsent(employeeId, Timecard::new);
    }

    // Thực hiện ca sử dụng Maintain Timecard
    public void maintainTimecard(int employeeId, Map<String, Integer> hoursToUpdate) {
        // Lấy hoặc tạo bảng chấm công
        Timecard timecard = getTimecard(employeeId);

        // Hiển thị bảng chấm công hiện tại
        System.out.println("\nBang cham cong hien tai:");
        timecard.display();

        // Cập nhật giờ làm việc
        System.out.println("\nDang cap nhat gio lam viec...");
        for (Map.Entry<String, Integer> entry : hoursToUpdate.entrySet()) {
            timecard.updateHours(entry.getKey(), entry.getValue());
        }

        // Hiển thị thông tin sau khi cập nhật
        System.out.println("\nBang cham cong sau khi cap nhat:");
        timecard.display();

        // Lưu bảng chấm công
        timecard.save();
    }
}
