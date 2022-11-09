

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
                                        System.out.print("Введите название задачи: ");
                                        String taskName = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите описание задачи: ");
                                        String taskDescription = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
                                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
                                        LocalDateTime taskDate = null;
                                        try {
                                            taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
                                        } catch (DateTimeParseException e) {
                                            System.out.println("Ошибка! Не верный формат даты");
                                        }

                                        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
                                        String chosenTypeOfTask = scanner.next();
                                        if (chosenTypeOfTask.equals("Личный")) {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.PERSONAL;
                                        } else {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.WORK;
                                        }
                                        Task task = new SingleTask(taskName, taskDescription, taskDate);

                                        schedule.addtask(task.getId(), task);

                                        break;
                                    case 2:

                                        System.out.print("Введите название задачи: ");
                                        String taskName1 = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите описание задачи: ");
                                        String taskDescription1 = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
                                        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
                                        LocalDateTime taskDate1 = null;
                                        try {
                                            taskDate1 = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter1);
                                        } catch (DateTimeParseException e) {
                                            System.out.println("Ошибка! Не верный формат даты");
                                        }

                                        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
                                        String chosenTypeOfTask1 = scanner.next();
                                        if (chosenTypeOfTask1.equals("Личный")) {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.PERSONAL;
                                        } else {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.WORK;
                                        }

                                        Task task1 = new EverydayTask(taskName1, taskDescription1, taskDate1);

                                        schedule.addtask(task1.getId(), task1);
                                    case 3:
                                        System.out.print("Введите название задачи: ");
                                        String taskName2 = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите описание задачи: ");
                                        String taskDescription2 = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
                                        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
                                        LocalDateTime taskDate2 = null;
                                        try {
                                            taskDate2 = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter2);
                                        } catch (DateTimeParseException e) {
                                            System.out.println("Ошибка! Не верный формат даты");
                                        }

                                        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
                                        String chosenTypeOfTask2 = scanner.next();
                                        if (chosenTypeOfTask2.equals("Личный")) {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.PERSONAL;
                                        } else {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.WORK;
                                        }

                                        Task task2 = new EveryWeekTask(taskName2, taskDescription2, taskDate2);

                                        schedule.addtask(task2.getId(), task2);
                                    case 4:
                                        System.out.print("Введите название задачи: ");
                                        String taskName3 = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите описание задачи: ");
                                        String taskDescription3 = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
                                        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
                                        LocalDateTime taskDate3 = null;
                                        try {
                                            taskDate3 = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter3);
                                        } catch (DateTimeParseException e) {
                                            System.out.println("Ошибка! Не верный формат даты");
                                        }

                                        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
                                        String chosenTypeOfTask3 = scanner.next();
                                        if (chosenTypeOfTask3.equals("Личный")) {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.PERSONAL;
                                        } else {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.WORK;
                                        }

                                        Task task3 = new EveryMonthTask(taskName3, taskDescription3, taskDate3);

                                        schedule.addtask(task3.getId(), task3);
                                    case 5:
                                        System.out.print("Введите название задачи: ");
                                        String taskName4 = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите описание задачи: ");
                                        String taskDescription4 = scanner.useDelimiter("\n").next();
                                        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
                                        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
                                        LocalDateTime taskDate4 = null;
                                        try {
                                            taskDate4 = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter4);
                                        } catch (DateTimeParseException e) {
                                            System.out.println("Ошибка! Не верный формат даты");
                                        }

                                        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
                                        String chosenTypeOfTask4 = scanner.next();
                                        if (chosenTypeOfTask4.equals("Личный")) {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.PERSONAL;
                                        } else {
                                            Task.TypeOfTask typeOfTask = Task.TypeOfTask.WORK;
                                        }

                                        Task task4 = new EveryYearTask(taskName4, taskDescription4, taskDate4);

                                        schedule.addtask(task4.getId(), task4);
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

//    private static void inputSingleTask(Scanner scanner) {
//        System.out.print("Введите название задачи: ");
//        String taskName = scanner.useDelimiter("\n").next();
//        System.out.print("Введите описание задачи: ");
//        String taskDescription = scanner.useDelimiter("\n").next();
//        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
//        try {
//            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
//        } catch (DateTimeParseException e) {
//            System.out.println("Ошибка! Не верный формат даты");
//        }
//
//        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
//        String chosenTypeOfTask = scanner.next();
//        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask); //Передаю строку согласно конструктора
//
//        Task task = new SingleTask(taskName, taskDescription, taskDate, typeOfTask); // taskDate создан в 69 строке ???
//
//        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
//    }
//    private static void inputEverydayTask(Scanner scanner) {
//        System.out.print("Введите название задачи: ");
//        String taskName = scanner.useDelimiter("\n").next();
//        System.out.print("Введите описание задачи: ");
//        String taskDescription = scanner.useDelimiter("\n").next();
//        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
//        try {
//            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
//        } catch (DateTimeParseException e) {
//            System.out.println("Ошибка! Не верный формат даты");
//        }
//
//        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
//        String chosenTypeOfTask = scanner.next();
//        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask);
//
//        Task task = new EverydayTask(taskName, taskDescription, taskDate, typeOfTask);
//
//        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
//    }

//    private static void inputEveryWeekTask(Scanner scanner) {
//        System.out.print("Введите название задачи: ");
//        String taskName = scanner.useDelimiter("\n").next();
//        System.out.print("Введите описание задачи: ");
//        String taskDescription = scanner.useDelimiter("\n").next();
//        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
//        try {
//            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
//        } catch (DateTimeParseException e) {
//            System.out.println("Ошибка! Не верный формат даты");
//        }
//
//        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
//        String chosenTypeOfTask = scanner.next();
//        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask);
//
//        Task task = new EveryWeekTask(taskName, taskDescription, taskDate, typeOfTask);
//
//        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
//    }

//    private static void inputEveryMonthTask(Scanner scanner) {
//        System.out.print("Введите название задачи: ");
//        String taskName = scanner.useDelimiter("\n").next();
//        System.out.print("Введите описание задачи: ");
//        String taskDescription = scanner.useDelimiter("\n").next();
//        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
//        try {
//            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
//        } catch (DateTimeParseException e) {
//            System.out.println("Ошибка! Не верный формат даты");
//        }
//
//        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
//        String chosenTypeOfTask = scanner.next();
//        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask);
//
//        Task task = new EveryMonthTask(taskName, taskDescription, taskDate, typeOfTask);
//
//        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
//    }

//    private static void inputEveryYearTask(Scanner scanner) {
//        System.out.print("Введите название задачи: ");
//        String taskName = scanner.useDelimiter("\n").next();
//        System.out.print("Введите описание задачи: ");
//        String taskDescription = scanner.useDelimiter("\n").next();
//        System.out.print("Введите дату задачи в формате дд.мм.гггг: ");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("дд.мм.гггг чч-мм");
//        try {
//            LocalDateTime taskDate = LocalDateTime.parse(scanner.useDelimiter("\n").next(), formatter);
//        } catch (DateTimeParseException e) {
//            System.out.println("Ошибка! Не верный формат даты");
//        }
//
//        System.out.print("Введите тип задачи 'Личный' или 'Рабочий' ");
//        String chosenTypeOfTask = scanner.next();
//        Task.TypeOfTask typeOfTask = new Task.TypeOfTask(chosenTypeOfTask);
//
//        Task task = new EveryYearTask(taskName, taskDescription, taskDate, typeOfTask);
//
//        schedule.addTask(task.getId(), task); //В 14й строчке уже создал schedule Почему он его не видит?
//    }

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