import java.io.*;
import java.util.*;
public class add7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        Set<String> all = new HashSet<>();
        Set<String> failed = new HashSet<>();
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[3]);
            all.add(data[0]);
            if (marks < 40) {
                failed.add(data[0]);
            }
        }
        br.close();
        System.out.println("Passed\t" + (all.size() - failed.size()));
        System.out.println("Failed\t" + failed.size());
    }
}
