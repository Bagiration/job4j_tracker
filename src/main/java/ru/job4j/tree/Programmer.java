package ru.job4j.tree;

public class Programmer extends Engineer {
    private String kind;
    private String language;

    public Programmer(String name, String surname, String education, String birthday, String qualification, int experience, String kind, String language) {
        super(name, surname, education, birthday, qualification, experience);
        this.kind = kind;
        this.language = language;
    }

    public String getKind() {
        return kind;
    }

    public String getLanguage() {
        return language;
    }

    public void writeCode() {

    }

    public void learnLanguage() {

    }
}
