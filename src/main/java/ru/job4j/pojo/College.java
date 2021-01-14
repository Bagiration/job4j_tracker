package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Марченко Максим Сергеевиы");
        student.setGroup("1А");
        student.setDateOfEntrance(new Date());

        System.out.println("Студент " + student.getFio() + " поступил " + student.getDateOfEntrance() + " в группу " + student.getGroup());
    }
}
