import java.time.LocalDate;
import java.time.LocalDateTime;

public class SingleTask extends Task {
    public SingleTask(String title, String description, LocalDateTime taskDateTime, TypeOfTask typeOfTask) {
        super(title, description, taskDateTime, typeOfTask);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return false;
    }
}
