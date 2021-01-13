package ru.job4j.tree;

public class Engineer extends Profession {

    private String qualification;
    private int experience;

    public Engineer(String name, String surname, String education, String birthday, String qualification, int experience) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
        this.experience = experience;
    }

    public String getQualification() {
        return qualification;
    }

    public int getExperience() {
        return experience;
    }

    public void object() {

    }

    public void calculation() {

    }
}
