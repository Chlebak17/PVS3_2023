package oop.inheritance;

import fileworks.DataImport;

import java.util.ArrayList;

public class LotsOfBlood {
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

    public static void main(String[] args) {
        ArrayList<PersonWithBlood> personsWithBlood = new ArrayList<>();
        loadData(personsWithBlood);


    }
}
