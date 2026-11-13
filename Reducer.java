import java.io.*;
import java.util.*;
public class Reducer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("mapper_output.txt"));
        Map<String, Integer> wordCount = new TreeMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\t");
            wordCount.put(parts[0], wordCount.getOrDefault(parts[0], 0) + Integer.parseInt(parts[1]));
        }
        br.close();
        for (Map.Entry<String, Integer> e : wordCount.entrySet()) {
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
    }
}