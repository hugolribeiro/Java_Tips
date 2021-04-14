import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Author: Hugo Leça Ribeiro
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/home/hleca/IdeaProjects/ApresentacaoCSVFatec/src/controle_vendas.csv";
        try (BufferedReader buffReader = new BufferedReader(new FileReader(path))){
            String line = buffReader.readLine();
            while (line != null){
                String[] arrayLine = line.split(",");
                for (String word: arrayLine){
                    System.out.print(word);
                }
                System.out.println();
                line = buffReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
