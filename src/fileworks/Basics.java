package fileworks;

import oop.interfaces.Film;

import java.io.File;

public class Basics {
    public static void main(String[] args) {
//        File file = new File("books.txt");
        File file = new File("nejakyFiles\\text.txt");
        System.out.println("Existuje? " + file.exists());
        System.out.println("Cesta (abs)? " + file.getAbsolutePath());
        System.out.println("Cesta je " + file.getPath());
//        System.out.println("Linux cesta " + file.getCanonicalPath());
        System.out.println("je to slozka? " + file.isDirectory());
        System.out.println("Je to soubor? " + file.isFile());

        System.out.println("Je to velké " + file.length());
        System.out.println("je to velké v mb " + (file.length()/1024));

        File newOne = new File("nejakyFiles\\novej");
//        newOne.createNewFile(); ale ohlidej exception
//        newOne.mkdir();
        newOne.compareTo()
    }
}
