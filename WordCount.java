import java.io.*;
public class WordCount {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting Mapper...");
        Process mapper = Runtime.getRuntime().exec("java Mapper");
        BufferedReader mapperOutput = new BufferedReader(new InputStreamReader(mapper.getInputStream()));
        BufferedWriter mapperFile = new BufferedWriter(new FileWriter("mapper_output.txt"));
        String line;
        while ((line = mapperOutput.readLine()) != null) {
            mapperFile.write(line);
            mapperFile.newLine();
        }
        mapperFile.close();
        mapper.waitFor();
        System.out.println("Mapper completed.");
        System.out.println("Starting Reducer...");
        Process reducer = Runtime.getRuntime().exec("java Reducer");
        BufferedReader reducerOutput = new BufferedReader(new InputStreamReader(reducer.getInputStream()));
        BufferedWriter outputFile = new BufferedWriter(new FileWriter("output.txt"));
        while ((line = reducerOutput.readLine()) != null) {
            outputFile.write(line);
            outputFile.newLine();
        }
        outputFile.close();
        reducer.waitFor();
        System.out.println("Reducer completed.");
    }
}