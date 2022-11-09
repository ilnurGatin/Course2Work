import java.time.LocalDate;
import java.time.LocalDateTime;

public class EveryMonthTask extends Task {
    public EveryMonthTask(String title, String description, LocalDateTime taskDateTime) {
        super(title, description, taskDateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        if (getTaskDateTime().getDayOfMonth() == date.getDayOfMonth()) {
            return true;
        } else {
            return false;
        }
    }
}
