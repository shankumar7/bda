import java.io.*;
import java.util.*;
public class week11 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("ratings.csv"));
        HashMap<String, ArrayList<Double>> userRatings = new HashMap<>();
        br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String userId = data[1];
            double rating = Double.parseDouble(data[1]);
            if (!userRatings.containsKey(userId)) {
                userRatings.put(userId, new ArrayList<>());
            }
            userRatings.get(userId).add(rating);
        }
        br.close();
        System.out.println("User ID\tMax\tMin\tAverage");
        for (String userId : userRatings.keySet()) {
            ArrayList<Double> ratings = userRatings.get(userId);
            double max = Collections.max(ratings);
            double min = Collections.min(ratings);
            double sum = 0;
            for (double r : ratings) {
                sum += r;
            }
            double average = sum / ratings.size();
            System.out.println(userId + "\t" + max + "\t" + min + "\t" + average);
        }
    }
}