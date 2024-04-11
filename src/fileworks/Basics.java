package fileworks;

import oop.interfaces.Film;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Basics {

    static void Tree(File root){
        File[] folderContent;
        if (root.isFile()) {
            System.out.println("Soubor: " + root.getPath());
        } else if (root.isDirectory()) {
            System.out.println("Slozka: " + root.getPath());
            folderContent = root.listFiles();
            for (File file:
                 folderContent) {
                Tree(file);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("books.txt");
        File file = new File("nejakyFiles\\text.txt");
        System.out.println("Existuje? " + file.exists());
        System.out.println("Cesta (abs)? " + file.getAbsolutePath());
        System.out.println("Cesta je (rel) " + file.getPath());
//        System.out.println("Linux cesta " + file.getCanonicalPath());
        System.out.println("je to slozka? " + file.isDirectory());
        System.out.println("Je to soubor? " + file.isFile());

        System.out.println("Je to velké " + file.length());
        System.out.println("je to velké v kb " + (file.length()*1024));

        File newOne = new File("nejakyFiles\\novej");
//        newOne.createNewFile(); ale ohlidej exception
//        newOne.mkdir();
//        newOne.compareTo();

//        File directory = new File("nejakyFiles");
        File directory = new File(".");//ukaze vse v aktualni slozce


//        File[] contents =  directory.listFiles(); //ulozi vsechny file z adresare je to tak
//        System.out.println(Arrays.toString(contents));
            Tree(directory);
    }
}
