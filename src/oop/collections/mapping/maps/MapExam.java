import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MapExam {

    static HashMap<String, ArrayList<City>> countryCities;


    static double countryCitiesAverage(String countryCode){
        double avg = countryCities.get(countryCode).stream()
                .mapToDouble(value -> value.population)
                .average()
                .orElse(0.0);
        return avg;
    }

    static int CitiesCount(String CountryCode){
        int allTowns = 0;
        countryCities.size()

        return allTowns;
    }

    static int citiesDistricts(String CountryCode){
        long disticnt = countryCities.get(CountryCode)
                .stream().distinct()
                .count();
    }


    /**
     * Nacte vsechny prvky, nasledne namapuje
     */
    static HashMap<String, ArrayList<City>> loadMapCities(String filePath){
      HashMap<String, ArrayList<City>> map = new HashMap<>();
      //nacist mesta, vyparsovat jako objekt a ulozit do zadane mapy
        try{
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            lines.remove(0);//copa to asi udela...? :)
            String[] params;
            City city;
            for (String line : lines){
                params = line.split(",");
                //doplnit parametry
//                System.out.println(params[1]);
                city = new City(params[1],params[2],Integer.parseInt(params[3]));
                //hodt do mapy (kod-mesto)
                if (map.containsKey(params[0])) {
                    map.get(params[0]).add(city);
                }else {
                    map.put(params[0], new ArrayList<>());
                    map.get(params[0]).add(city);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
      return map;
    }

    public static void main(String[] args) {
        countryCities = loadMapCities("C:\\Users\\jakub.matas\\IdeaProjects\\PVS3_2023\\src\\oop\\collections\\mapping\\maps\\city.csv");
        System.out.println(countryCities);
        System.out.println(countryCitiesAverage("AFG"));
    }
}  class City{
    String name, district;
    int population;

    public City(String name, String district, int population) {
        this.name = name;
        this.district = district;
        this.population = population;
    }
}
