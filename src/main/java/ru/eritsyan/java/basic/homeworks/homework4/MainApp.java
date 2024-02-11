package ru.eritsyan.java.basic.homeworks.homework4;

import java.time.Year;

public class MainApp {
    public static void main(String[] args) {
        User userArray[] = new User[10];
        userArray[0] = new User("Петров", "Петр", "Петрович", 1979, "test1@ya.ru");
        userArray[1] = new User("Иванов", "Иван", "Петрович", 1989, "test2@ya.ru");
        userArray[2] = new User("Сидоров", "Сидрр", "Петрович", 1999, "test3@ya.ru");
        userArray[3] = new User("Первый", "Петр", "Иванович", 1969, "test4@ya.ru");
        userArray[4] = new User("Второй", "Алексей", "Дмитриевич", 1978, "test5@ya.ru");
        userArray[5] = new User("Третий", "Валерий", "Анатольевич", 1959, "test6@ya.ru");
        userArray[6] = new User("Четвертый", "Иван", "Иванович", 1997, "test7@ya.ru");
        userArray[7] = new User("Пятый", "Николай", "Николаевич", 1949, "test8@ya.ru");
        userArray[8] = new User("Иванов", "Петр", "Петрович", 1969, "test9@ya.ru");
        userArray[9] = new User("Петров", "Иван", "Петрович", 1999, "test99@ya.ru");
        for (int i = 0; i < userArray.length; i++) {
            if (Year.now().getValue() - userArray[i].getBirthYear() > 40) {
                userArray[i].info();
            }
        }
        Box box1 = new Box(5, "red", true, null);
        box1.info();
        box1.get();
        box1.put("yyy");
        box1.get();
    }
}
