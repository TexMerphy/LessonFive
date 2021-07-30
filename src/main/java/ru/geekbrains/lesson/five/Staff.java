package ru.geekbrains.lesson.five;

public class Staff {
    private String firstName;
    private String middleName;
    private String lastName;
    private String position;
    private String email;
    private String phoneNum;
    private int salary;
    private int age;

    public Staff(String firstName, String middleName, String lastName, String position, String email, String phoneNum, int salary, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void getInfo (){
        System.out.printf("Сотрудник Фамилия: %s, Имя: %s, Отчество: %s, Должность: %s," +
                " e-mail: %s, номер телефона: %s, зарплата: %s, возраст: %s%n",lastName, firstName, middleName,position,email,phoneNum,salary,age);
    }
}
