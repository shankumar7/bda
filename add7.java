import java.io.*;
import java.util.*;
public class add7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        Map<String, Integer> result = new TreeMap<>();
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[3]);
            String status = "Passed";
            if (marks < 40) {
                status = "Failed";
            }
            result.put(status, result.getOrDefault(status, 0) + 1);
        }
        br.close();
        System.out.println("Result\tCount");
        for (String status : result.keySet()) {
            System.out.println(status + "\t" + result.get(status));
        }
    }
}
