import java.io.*;
import java.util.*;
public class add6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        Set<String> result = new TreeSet<>();
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[3]);
            if (marks > 80) {
                result.add(data[0] + "\t" + data[1]);
            }
        }
        br.close();
        System.out.println("ID\tName");
        for (String student : result) {
            System.out.println(student);
        }
    }
}
