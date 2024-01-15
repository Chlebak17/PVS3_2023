package oop.inheritance;

import fileworks.DataImport;

import java.util.ArrayList;

public class PersonWithBlood {
    public String name;
    public int weight,age,height;
    public BloodType blood;

    public boolean compatibleToGive(PersonWithBlood toGive){
        //this.blood toGive.blood
        return true;

    }

    static void mockDonations(ArrayList<PersonWithBlood> persons){
        PersonWithBlood first;
        PersonWithBlood second;
        for (int i = 0; i < 1000; i++) {
            first = persons.get((int)(Math.random()* persons.size()));
            second = persons.get((int)(Math.random()* persons.size()));
            if (first.compatibleToGive(second)){
                System.out.println("Osoba: " + first + "uspesne darovala: " + second);
            }else{
                System.out.println("Nekompatibilni typy");
                System.out.println(first);
                System.out.println(second);
            }
        }
    }

    public static void loadData(ArrayList<PersonWithBlood> persons ){
        DataImport di = new DataImport("darciKrve.txt");
        String line;
        String[] params;

        while (di.hasNext()){
            line = di.readLine();
            params = line.split(",");
            persons.add(new PersonWithBlood(params[0],
                    Integer.parseInt(params[1]),
                    Integer.parseInt(params[2]),
                    Integer.parseInt(params[3]),
                    BloodType.eval(params[4])));
        }
        di.finishImport();
    }

    @Override
    public String toString() {
        return name + " " +
                age + " " +
                blood + " ";
    }

    public PersonWithBlood(String name, int height, int weight, int age, BloodType blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.blood = blood;
    }

    /*boolean canIGive(PersonWithBlood giver, PersonWithBlood getter){

    }
    */


    public static void main(String[] args) {
        ArrayList<PersonWithBlood> personsWithBlood = new ArrayList<>();
        loadData(personsWithBlood);
        mockDonations(personsWithBlood);

    }

} enum BloodType{
    O_PLUS("O+"),
    O_MINUS("O-"),
    A_PLUS("A+"),
    A_MINUS("A-"),
    AB_PLUS("AB+"),
    AB_MINUS("AB-"),
    B_PLUS("B+"),
    B_MINUS("B-"),
    ;

    BloodType(String s) {

    }

    static BloodType eval(String s){
        switch (s){
            case "O+": return O_PLUS;
            case "O-": return O_MINUS;
            case "A+": return A_PLUS;
            case "A-": return A_MINUS;
            case "AB+": return AB_PLUS;
            case "AB-": return AB_MINUS;
            case "B+": return B_PLUS;
            case "B-": return B_MINUS;
            default: return null;
        }
    }
}
