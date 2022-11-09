import java.time.LocalDate;
import java.time.LocalDateTime;

public class EveryYearTask extends Task {

    public EveryYearTask(String title, String description, LocalDateTime taskDateTime) {
        super(title, description, taskDateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        // Сравниваем если разница только в годе, а все остальное должно быть одинаковым (через номер дня в году (от 1 до 365))
        if (getTaskDateTime().getYear() <= date.getYear() && getTaskDateTime().getDayOfYear() == date.getDayOfYear()) {
            return true;
        } else {
            return false;
        }
    }
}
