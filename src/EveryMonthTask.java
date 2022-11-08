import java.time.LocalDate;
import java.time.LocalDateTime;

public class EveryMonthTask extends Task {
    public EveryMonthTask(String title, String description, LocalDateTime taskDateTime, TypeOfTask typeOfTask) {
        super(title, description, taskDateTime, typeOfTask);
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
