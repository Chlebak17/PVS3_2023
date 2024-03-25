package fileworks.serialiazation;

import java.io.*;

public class Basics {

    public static void main(String[] args) {
//        serializace (vyblití do souboru) >
        String path = "Outputs\\rectangle.ser";
        try {
            FileOutputStream fos = new FileOutputStream(path);

            ObjectOutputStream out = new ObjectOutputStream(fos);
            Rectangle rec = new Rectangle(4,9);
            out.writeObject(rec);

            out.close();
            fos.close();

            System.out.println("Serialiazetion completed");

//            deserializace(ziskani ze souboru ktery je serializovany)
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fis);

            Rectangle read = (Rectangle) in.readObject();
            System.out.println(read);
            System.out.println("deserializováno");
            System.out.println(read.equals(rec));
            System.out.println(rec);
            fis.close();
            in.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Execption: " + e.getMessage());
        }
    }
}

class Rectangle implements Serializable {
    int width,height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "width= " + width +
                ", height= " + height;
    }
}
