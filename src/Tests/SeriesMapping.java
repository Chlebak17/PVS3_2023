package Tests;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeriesMapping {
   static ArrayList<Series> series = new ArrayList<>();
   static ArrayList<Episode> allep = new ArrayList<>();
    static void printSeries(Series s){
        //vypis cely serial, serazeno dle sezona, epizoda
    }

    static void loadSeries(){

        try {
            List<String> linesSeries = Files.readAllLines(Paths.get("C:\\Users\\jakub.matas\\IdeaProjects\\PVS3_2023\\resources\\series.csv"));
            //System.out.println(linesSeries);
            linesSeries.remove(0);
            Series s;
            for (String line:
                 linesSeries) {
                String[] arr = line.split(";");
                s = new Series(arr[0],arr[1]);
                s.setSeriesRating();
                series.add(s);
            }
            System.out.println("Loaded :)");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        //zde si hrajte :)
        loadSeries();
        for (Series m:
             series) {
            System.out.println(m);
        }

    }
}
class Series{
    @Override
    public String toString() {
        return "Series: \n" +
                "name: " + name + '\n' +
                "seriesRating: " + seriesRating + '\n';
    }

    String seriesID;
    String name;
    ArrayList<Episode> episodes;

    double seriesRating;

    public Series(String seriesID, String name) {
        this.seriesID = seriesID;
        this.name = name;
        this.episodes = new ArrayList<>(); // pripraveno na vkladani, zatim tam nic neni
        this.seriesRating = 0;//zatim
    }

    public void setSeriesRating() {
        //projed list a nastav rating
        //seriesRating = prumerny rating vsech epizod
        ArrayList<Episode> episodes= new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        try {
            List<String> lineEp = Files.readAllLines(Paths.get("C:\\Users\\jakub.matas\\IdeaProjects\\PVS3_2023\\resources\\episodes.csv"));
            //System.out.println(lineEp);
            lineEp.remove(0);
            for (String g:
                    lineEp) {
                String[] arr = g.split(";");
                if (arr[3].equals(this.seriesID)) {
                    episodes.add(new Episode(Integer.parseInt(arr[0]),
                            Integer.parseInt(arr[1]),
                            Double.parseDouble(arr[2])));
                }
            }
            for (Episode e : episodes){
                doubles.add(e.rating);
            }
            this.seriesRating = doubles.stream().
                    mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Episode{
    int season;
    int episode;
    double rating;

    public Episode(int season, int episode, double rating) {
        this.season = season;
        this.episode = episode;
        this.rating = rating;
    }
}
