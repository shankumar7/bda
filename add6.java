import java.io.*;
import java.util.*;
public class add6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        String line;
        br.readLine();
        System.out.println("ID\tName\tMarks");
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[3]);
            if (marks > 80) {
                System.out.println(data[0] + "\t" + data[1] + "\t" + marks);
            }
        }
        br.close();
    }
}
