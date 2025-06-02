import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Navne der skal anonymiseres
        List<String> names = Arrays.asList("Anders", "Katrine", "Joakim", "Stine");

        try {
            // Læs hele filen som én tekststreng
            String originalText = new String(Files.readAllBytes(Paths.get("tekst.txt")));

            // Kald StringHandler
            StringHandler handler = new StringHandler();
            String anonymizedText = handler.replaceText(originalText, names);

            // Udskriv resultat
            System.out.println("Anonymiseret tekst:\n");
            System.out.println(anonymizedText);

        } catch (IOException e) {
            System.out.println("Fejl ved læsning af fil: " + e.getMessage());
        }
    }
}
