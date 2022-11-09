import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Task {
    private static int counter;
    private final int id;
    private String title;
    private String description;

    public enum TypeOfTask {
        PERSONAL("Личный"),
        WORK("Рабочий");

        private String typeOfTaskTitle;
        TypeOfTask(String typeOfTaskTitle) {
            this.typeOfTaskTitle = typeOfTaskTitle;
        }

        public String getTypeOfTaskTitle() {
            return typeOfTaskTitle;
        }


        public String getTypeOfTask() {
            return typeOfTaskTitle;
        }

    }
    public TypeOfTask typeOfTask;

    private LocalDateTime taskDateTime;

    public Task(String title, String description, LocalDateTime taskDateTime) {
        this.id = counter++;
        this.title = title;
        this.description = description;
        this.taskDateTime = taskDateTime;

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TypeOfTask getTypeOfTask() {
        return typeOfTask;
    }


    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract boolean appearsIn(LocalDate date);

    public LocalDateTime getTaskDateTime() {
        return taskDateTime;
    }
}
