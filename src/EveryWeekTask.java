import java.time.LocalDate;
import java.time.LocalDateTime;

public class EveryWeekTask extends Task {
    public EveryWeekTask(String title, String description, LocalDateTime taskDateTime) {
        super(title, description, taskDateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        //Сравниваем дни недели задачи и передаваемого дня на которое хотим получить список задач
        if (getTaskDateTime().getDayOfWeek().equals(date.getDayOfWeek())) {
            return true;
        } else {
            return false;
        }
    }
}

