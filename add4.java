import java.io.*;
import java.util.*;
public class add4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        Map<String, Integer> sum = new TreeMap<>();
        Map<String, Integer> count = new TreeMap<>();
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String dept = data[2];
            int marks = Integer.parseInt(data[3]);
            sum.put(dept, sum.getOrDefault(dept, 0) + marks);
            count.put(dept, count.getOrDefault(dept, 0) + 1);
        }
        br.close();
        System.out.println("Department\tAverage Marks");
        for (String dept : sum.keySet()) {
            double average = (double) sum.get(dept) / count.get(dept);
            System.out.println(dept + "\t\t" + average);
        }
    }
}
