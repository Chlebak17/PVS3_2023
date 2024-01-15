package oop.inheritance;

public class PersonWithBlood {
    String name;
    int weight,age,height;
    BloodType blood;

    public PersonWithBlood(String name, int height, int weight, int age, BloodType blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.blood = blood;
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
