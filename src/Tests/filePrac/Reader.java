package Tests.filePrac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Reader{

    static List<File> fileList = new ArrayList<>();

    static String sort(List<File> files){
        File before;

        for (int i = 0; i < files.size(); i++) {
            File f = files.get(i);
            if (i == 0) {
               before = f;
            }else {
//                if () {
//
//                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        BufferedReader br;
        try{
            File fl = new File("task");
//            System.out.println(fl.exists());

            if (fl.isDirectory()) {
                String[] arr = fl.list();
                for (String s : arr){
                    s = "task\\" + s;
                    File file = new File(s);
                    Long size = Files.size(file.toPath());
                    size = size;
//                    System.out.println(size);
                    if (file.getName().endsWith(".txt") && size < 5000) {
                        fileList.add(file);
                        System.out.println("added " + file.getName());
                    }

                }
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
