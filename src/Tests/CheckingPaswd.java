package Tests;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CheckingPaswd {


    static List<String> rightNames = new ArrayList<>();
    static List<String> rightPasswd = new ArrayList<>();

    static int retName(String name) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("logins\\usernames.txt"));
            String line;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                lineCount++;
                if (line.equals(name)) {
//                    System.out.println("Name: " + name + " line: " + line);
                    rightNames.add(name);
                    return lineCount;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    static boolean retPasswd(String pasd, int lineCount) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("logins\\passwords.txt"));
            String line;
            int thisCount = 0;
            while ((line = br.readLine()) != null) {
                thisCount++;
                if (lineCount == thisCount) {
                    if (line.equals(pasd)) {
                        rightPasswd.add(pasd);
                        return true;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }


    static int readFile(String path, int attempts) {
        BufferedReader br;
        String defPath = path;
        int toReturn = 0;
        for (int i = 1; i <= attempts; i++) {
            path += i + ".txt";
//            System.out.println(path);

            try {
                br = new BufferedReader(new FileReader(path));
                String line;
                String[] params;
                while ((line = br.readLine()) != null) {
                    params = line.split(";");
//                    System.out.println("username:" + params[0] + " password:" + params[1]);
//                    System.out.println(retName(params[0]));
                    if (retPasswd(params[1], retName(params[0]))) {

                        toReturn++;
                    }

                }
                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            path = defPath;
        }
//        System.out.println(toReturn);
        return toReturn;
    }

    static void makeAttemps(List<String> names, List<String> passwd){
        FileWriter fr;
        String path = "logins\\rightAttemps.txt";
        try{
            fr = new FileWriter(path);
//            System.out.println(names.get(0));
            for (int i = 0; i < passwd.size(); i++) {
                String toAppend = names.get(i) + ";" + passwd.get(i);
                fr.write(toAppend);
                fr.write("\n");
            }
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int attemps = 4;
        String path = "logins\\loginAttempts";
        readFile(path, attemps);
        makeAttemps(rightNames,rightPasswd);
    }
}
