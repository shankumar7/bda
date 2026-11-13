import java.io.*;
import java.util.*;
public class add3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        Map<String, Integer> result = new TreeMap<>();
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String dept = data[2];
            int marks = Integer.parseInt(data[3]);
            if (!result.containsKey(dept) || marks < result.get(dept)) {
                result.put(dept, marks);
            }
        }
        br.close();
        System.out.println("Department\tLowest Mark");
        for (String dept : result.keySet()) {
            System.out.println(dept + "\t\t" + result.get(dept));
        }
    }
}
