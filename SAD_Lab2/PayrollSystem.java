import java.util.HashMap;
import java.util.Map;

// Chương trình chính
public class PayrollSystem {
    public static void main(String[] args) {
        TimecardController controller = new TimecardController();

        // Dữ liệu giả lập
        int employeeId = 101;
        Map<String, Integer> initialHours = new HashMap<>();
        initialHours.put("001", 8);
        initialHours.put("002", 4);

        Map<String, Integer> additionalHours = new HashMap<>();
        additionalHours.put("001", 2);
        additionalHours.put("003", 5);

        // Chạy mô phỏng
        System.out.println("=== BANG CHAM CONG ===");
        controller.maintainTimecard(employeeId, initialHours); // Cập nhật lần đầu
        controller.maintainTimecard(employeeId, additionalHours); // Cập nhật lần sau
    }
}
