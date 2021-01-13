package ru.job4j.tree;

public class Dentist extends Doctor{

    private String kind;
    private String tool;

    public Dentist(String name, String surname, String education, String birthday, String practice, String drug, String kind, String tool) {
        super(name, surname, education, birthday, practice, drug);
        this.kind = kind;
        this.tool = tool;
    }

    public String getKind() {
        return kind;
    }

    public String getTool() {
        return tool;
    }

    public void drill() {

    }
    public void pullOutTooth() {

    }
}
