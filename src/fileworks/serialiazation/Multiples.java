package fileworks.serialiazation;

import java.io.*;
import java.util.ArrayList;

public class Multiples {

    public static void main(String[] args) {

        try {
            String path = "Outputs\\polygon.ser";
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            ArrayList<Polygon> polygons = new ArrayList<>();

//            for (int i = 5; i < 21; i++) {
//                out.writeObject(new Polygon(i+1,4.2*i));
//            }
            for (int i = 5; i < 21; i++) {
                polygons.add(new Polygon(i+1,4.2*i));
            }

            out.writeObject(polygons);

            fileOut.close();
            out.close();

            FileInputStream frs = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(frs);

            Polygon polygon;
//            while ((polygon = (Polygon) in.readObject()) != null){
//                System.out.println(polygon);
//            }

//            Jednou tu podmínku dodělám :D

//            Object obj = in.readObject();
//            if (Polygon.class.isInstance(obj)) {
//                System.out.println("Everything is fine");
//            }

            ArrayList<Polygon> readPolygon = (ArrayList<Polygon>) in.readObject();
            System.out.println(readPolygon);

            frs.close();
            in.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            System.out.println(":(" + e.getMessage());
        }
    }
}
class Polygon implements Serializable{
    int sides;
    double length;

    @Override
    public String toString() {
        return "Polygon has "
                + sides +
                " sides and length "
                + length;
    }

    public Polygon(int sides, double length) {
        this.sides = sides;
        this.length = length;
    }
}