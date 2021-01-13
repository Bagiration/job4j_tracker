package ru.job4j.tree;

public class Builder extends Engineer {

    private String program;
    private String norm;

    public Builder(String name, String surname, String education, String birthday, String qualification, int experience, String program, String norm) {
        super(name, surname, education, birthday, qualification, experience);
        this.program = program;
        this.norm = norm;
    }

    public String getProgram() {
        return program;
    }

    public String getNorm() {
        return norm;
    }

    public void drow() {

    }

    public void read() {

    }
}
