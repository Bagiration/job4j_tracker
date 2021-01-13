package ru.job4j.tree;

public class Surgeon extends Doctor {

    private String kind;
    private String assistant;
    private String hospital;

    public Surgeon(String name, String surname, String education, String birthday, String practice, String drug, String kind, String assistant, String hospital) {
        super(name, surname, education, birthday, practice, drug);
        this.kind = kind;
        this.assistant = assistant;
        this.hospital = hospital;
    }

    public String getKind() {
        return kind;
    }

    public String getAssistant() {
        return assistant;
    }

    public String getHospital() {
        return hospital;
    }

    public void operation() {

    }
}
