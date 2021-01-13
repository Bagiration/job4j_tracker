package ru.job4j.tree;

public class Doctor extends Profession {

    private String practice;
    private String drug;

     public Doctor(String name, String surname, String education, String birthday, String practice, String drug) {
        super(name, surname, education, birthday);
        this.practice = practice;
        this.drug = drug;
    }

    public String getPractice() {
        return practice;
    }

    public String getDrug() {
        return drug;
    }

    public void heal() {

    }

    public void diagnosis() {

    }
}
