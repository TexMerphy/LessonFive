package ru.geekbrains.lesson.five;

public class Main {
    public static void main(String[] args) {
        Staff[] staff = {
                new Staff("Иван", "Иванович", "Иванов", "Крановщик", "johnjohnson@mail.ru", "89998765432", 30000, 42),
                new Staff("Анна", "Антоновна", "Краснова", "Мотальщица", "redanna@mail.ru", "89998765634", 28000, 53),
                new Staff("Олег", "Игоревич", "Дроздов", "Водитель", "drozdoleg@yandex.ru", "89999708697", 25600, 28),
                new Staff("Василий", "Поликарпович", "Петров", "Животновод", "petrovas@gmail.ru", "89051647832", 39000, 60),
                new Staff("Клавдия", "Ильинична", "Смирнова", "Искусствовед", "kismirnova@rambler.ru", "89089654273", 12900, 22)
        };
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getAge() > 40) {
                staff[i].getInfo();
            }
        }
    }
}
