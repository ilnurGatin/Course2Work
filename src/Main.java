import Task.TypeOfTask;

import java.nio.Buffer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Collection;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            printMenu2();
                            System.out.print("Выберите тип задачи: ");
                            if (scanner.hasNextInt()) {
                                int menu2 = scanner.nextInt();
                                switch (menu2) {
                                    case 1:
                                        inputSingleTask(scanner);
                                        //schedule.addtask(Task task)); //Если добавлять вне инпута то не видит объект класса Task
                                        break;
                                    case 2:
                                        inputEverydayTask(scanner);
                                    case 3:
                                        inputEveryWeekTask(scanner);
                                    case 4:
                                        inputEveryMonthTask(scanner);
                                    case 5:
                                        inputEveryYearTask(scanner);
                                    case 0:
                                        break label;
                                }
                            } else {
                                scanner.next();
                                System.out.println("Выберите пункт меню из списка!");
                            }
                            break;
                        case 2:
                            System.out.print("Введите id/номер задачи для удаления: ");
                            int id = Integer.parseInt(scanner.next());
                            try {
                                schedule.removeTask(id);
                            } catch (TaskNotFoundExeption e) {
                                System.out.println("Задачи с таким id не найдено");
                            }
                            break;
                        case 3:
                            System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг");
                            LocalDate dayForTask = LocalDate.parse(scanner.useDelimiter("\n").next(), formatter);
                            printTasksForDay(dayForTask, schedule.getTaskForDay(dayForTask));
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void inputSingleTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String taskName = scanner.useDelimiter("\n").next();
        System.out.print("Введите описание задачи: ");
        String taskDescription = scanner.useDelimiter("\n").next();
        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
        try {
            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка! Не верный формат даты");
        }

        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
        String chosenTypeOfTask = scanner.next();
        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask); //Передаю строку согласно конструктора

        Task task = new SingleTask(taskName, taskDescription, taskDate, typeOfTask); // taskDate создан в 69 строке ???

        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
    }
    private static void inputEverydayTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String taskName = scanner.useDelimiter("\n").next();
        System.out.print("Введите описание задачи: ");
        String taskDescription = scanner.useDelimiter("\n").next();
        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
        try {
            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка! Не верный формат даты");
        }

        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
        String chosenTypeOfTask = scanner.next();
        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask);

        Task task = new EverydayTask(taskName, taskDescription, taskDate, typeOfTask);

        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
    }

    private static void inputEveryWeekTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String taskName = scanner.useDelimiter("\n").next();
        System.out.print("Введите описание задачи: ");
        String taskDescription = scanner.useDelimiter("\n").next();
        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
        try {
            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка! Не верный формат даты");
        }

        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
        String chosenTypeOfTask = scanner.next();
        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask);

        Task task = new EveryWeekTask(taskName, taskDescription, taskDate, typeOfTask);

        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
    }

    private static void inputEveryMonthTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String taskName = scanner.useDelimiter("\n").next();
        System.out.print("Введите описание задачи: ");
        String taskDescription = scanner.useDelimiter("\n").next();
        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
        try {
            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка! Не верный формат даты");
        }

        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
        String chosenTypeOfTask = scanner.next();
        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask);

        Task task = new EveryMonthTask(taskName, taskDescription, taskDate, typeOfTask);

        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
    }

    private static void inputEveryYearTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String taskName = scanner.useDelimiter("\n").next();
        System.out.print("Введите описание задачи: ");
        String taskDescription = scanner.useDelimiter("\n").next();
        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
        try {
            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка! Не верный формат даты");
        }

        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
        String chosenTypeOfTask = scanner.next();
        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask);

        Task task = new EveryYearTask(taskName, taskDescription, taskDate, typeOfTask);

        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
    }

    private static void printMenu() {
        System.out.println("1. Добавить задачу");
        System.out.println("2. Удалить задачу");
        System.out.println("3. Получить задачу на указанный день");
        System.out.println("0. Выход");
    }

    private static void printMenu2() {
        System.out.println("1. Задача разовая");
        System.out.println("2. Задача ежедневная");
        System.out.println("3. Задача еженедельная");
        System.out.println("4. Задача ежемесячная");
        System.out.println("5. Задача ежегодная");
        System.out.println("0. Выход");
    }

    public static void printTasksForDay(LocalDate date, Collection<Task> tasks) {
        System.out.println("Задачи на число: " + date.format(DateTimeFormatter.ofPattern("dd.mm.yyyy")));
        for (Task task : tasks) {
            System.out.printf("%s %s Описание %s%n", task.getTitle(), task.getTaskDateTime().toLocalDate(), task.getDescription());
        }
    }


}