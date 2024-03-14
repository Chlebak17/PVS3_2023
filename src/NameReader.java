import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class NameReader {

    static String mostLongestName = "";
    static List<String> uniqueNames = new ArrayList<>();

    static void unigueNames(List<String> fileNames){

        for (int i = 0; i < fileNames.size(); i++) {
            if (uniqueNames.contains(fileNames.get(i))) {

            }else {
                uniqueNames.add(fileNames.get(i));
            }
        }
    }

    static void loadFiles(String path){

        BufferedReader br;
        try{
            for (int i = 1; i <= 30; i++) {
                String longestName = "";
                List<String> nameList = new ArrayList<>();
                br = new BufferedReader(new FileReader(path + "names" + i + ".txt"));
                String name;
                while ((name = br.readLine()) != null){
                    nameList.add(name);
                    if (longestName.length() < name.length()) {
                        longestName = name;
                    }
                }
                unigueNames(nameList);
                System.out.println("names" + i + " longest: " + longestName);
                if (mostLongestName.length() < longestName.length()) {
                    mostLongestName = longestName;
                }
            }
            System.out.println("Longest name overall: " + mostLongestName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    String path = "Allnames\\";
    loadFiles(path);
    System.out.println(uniqueNames.size());

    }
}
