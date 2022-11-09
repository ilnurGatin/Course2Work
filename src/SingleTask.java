import java.time.LocalDate;
import java.time.LocalDateTime;

public class SingleTask extends Task {
    public SingleTask(String title, String description, LocalDateTime taskDateTime) {
        super(title, description, taskDateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return false;
    }
}
