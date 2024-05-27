package oop.collections.mapping.timetables;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

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

    public static HashMap<String, ArrayList<TableSubject>> workPlaceEvents(ArrayList<TableSubject> subjects){
        HashMap<String, ArrayList<TableSubject>> hashMap = new HashMap<>();
        for(TableSubject subject: subjects){
            if (hashMap.containsKey(subject)) {
                    hashMap.get(subject.workplace).add(subject);
            }else {
                hashMap.put(subject.workplace, new ArrayList<TableSubject>());
            }

        }
        return hashMap;
    }
    public static void main(String[] args) {
        ArrayList<TableSubject> subjects = subjects("resources//rozvrhove-akce.txt");
        System.out.println(subjects);
        HashSet<TableSubject> uniqeActions = new HashSet<>(subjects);
//        HashSet<TableSubject> uniqueActionsAll = new HashSet<>();
//        for (TableSubject td:
//             subjects) {
//            uniqueActionsAll.add(td);
//        }
        System.out.println(uniqeActions.size());
        //Stejné číslo(806)
//        System.out.println(uniqueActionsAll.size());
        long uniqeActionsLamdba = subjects.stream()
                .distinct()
                .count();
        //Stejné číslo(806)
//        System.out.println(uniqeActionsLamdba);
        HashSet<String> workPlaces = new HashSet<>();
        for (TableSubject subject: subjects){
            workPlaces.add(subject.workplace);
        }
        //Počet kateder (params[0])
        System.out.println(workPlaces.size());

        HashMap<String, ArrayList<TableSubject>> eventMap = workPlaceEvents(subjects);

        for (String workplace:
             eventMap.keySet()) {
            System.out.println(workplace + ":" + eventMap.get(workplace).size());
        }
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
        return "TableSubject: " + '\n'+
                "workplace: " + workplace + '\n' +
                "subjectName: " + subjectName + '\n' +
                "type: " + type + '\n' +
                "semeseter: " + semeseter;
    }
}
class WorkPlaceEvent implements Comparable<WorkPlaceEvent>{
    String name;
    int eventCount;

    public WorkPlaceEvent(String name, int eventCount) {
        this.name = name;
        this.eventCount = eventCount;
    }

    @Override
    public int compareTo(WorkPlaceEvent o) {
        if (this.eventCount == o.eventCount) {
            return this.name.compareTo(o.name);
        }
        return Integer.compare(this.eventCount, o.eventCount);
    }
}
