package oop.collections.mapping.timetables;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Run {
    static ArrayList<TableSubject> subjects(String filePath){
        ArrayList<TableSubject> subjects = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            String[] params;
            for (String s: lines) {
                params = s.split(";");
                subjects.add(new TableSubject(params[0],params[1],params[2],params[3]));
            }
        } catch (IOException e) {
            System.out.println("Soubor nenalezen, nastala chyba při čtení");
        }
        return subjects;
    }
    public static void main(String[] args) {
        ArrayList<TableSubject> subjects = subjects("resources//rozvrhove-akce.txt");
        System.out.println(subjects);

    }
}
class TableSubject{
    String workplace;
    String subjectName;
    String type;
    String semeseter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableSubject that = (TableSubject) o;
        return Objects.equals(workplace, that.workplace) && Objects.equals(subjectName, that.subjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workplace, subjectName);
    }

    public TableSubject(String workplace, String subjectName, String type, String semeseter) {
        this.workplace = workplace;
        this.subjectName = subjectName;
        this.type = type;
        this.semeseter = semeseter;
    }

    @Override
    public String toString() {
        return "TableSubject: " +
                "workplace='" + workplace + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", type='" + type + '\'' +
                ", semeseter='" + semeseter + '\'';
    }
}
