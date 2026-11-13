import java.io.*;
public class Mapper {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            for (String word : line.split("\\s+")) {
                System.out.println(word + "\t1");
            }
        }
        br.close();
    }
}