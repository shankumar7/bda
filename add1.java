import java.io.*;
import java.util.*;
public class add1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        Map<String, Integer> result = new TreeMap<>();
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String student = data[0] + "\t" + data[1];
            int marks = Integer.parseInt(data[3]);
            result.put(student, result.getOrDefault(student, 0) + marks);
        }
        br.close();
        System.out.println("ID\tName\tTotal Marks");
        for (String student : result.keySet()) {
            System.out.println(student + "\t" + result.get(student));
        }
    }
}
