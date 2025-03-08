
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class NioFileExample {
   public static void main(String[] args) {
        try {
           // Read all lines from a file
           List<String> lines = Files.readAllLines(Paths.get("example.txt"));
           for (String line : lines) {
            System.out.println(line);
           }

           // Write to a file
           String content = "New content using java.nio";
           Files.write(Paths.get("example.txt"), content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
   } 
}