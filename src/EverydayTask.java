import java.time.LocalDate;
import java.time.LocalDateTime;

public class EverydayTask extends Task {
    public EverydayTask(String title, String description, LocalDateTime taskDateTime, TypeOfTask typeOfTask) {
        super(title, description, taskDateTime, typeOfTask);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        if (getTaskDateTime().isAfter(date.atStartOfDay())) {
            return true;
        } else {
            return false;
        }
    }
}
