import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Author: Hugo Leça Ribeiro
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/home/hleca/IdeaProjects/ApresentacaoCSVFatec/CsvAnimes/src/anime.csv";
        List<Anime> animeList = new ArrayList<Anime>();

        try (BufferedReader buffReader = new BufferedReader(new FileReader(path))) {
            String line = buffReader.readLine();
            line = buffReader.readLine();
            while (line != null) {
                String[] arrayLine = line.split(",");
                String animeName = arrayLine[1];
                String animeScore = arrayLine[2];
                try {
                    if ((Float.parseFloat(animeScore)) >= 8.5){
                        Anime anime = new Anime(animeName, animeScore);
                        animeList.add(anime);
                    }
                } catch (NumberFormatException ignored){

                } finally {
                    line = buffReader.readLine();
                }
            }
            animeList.sort(Comparator.comparing(Anime::getScore).reversed());
            System.out.println("Animes: ");
            for (Anime p : animeList){
                System.out.println(p);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
