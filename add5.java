import java.io.*;
import java.util.*;
public class add5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        Map<String, Integer> result = new TreeMap<>();
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String dept = data[2];
            result.put(dept, result.getOrDefault(dept, 0) + 1);
        }
        br.close();
        System.out.println("Department\tNumber of Students");
        for (String dept : result.keySet()) {
            System.out.println(dept + "\t\t" + result.get(dept));
        }
    }
}
