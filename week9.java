import java.io.*;
import java.util.*;
public class week9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("ratings.csv"));
        HashSet<String> movieIds = new HashSet<>();
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String movieId = data[1];
            movieIds.add(movieId);
        }
        br.close();
        System.out.println("Movie IDs which have been rated:");
        for (String id : movieIds) {
            System.out.println(id);
        }
    }
}