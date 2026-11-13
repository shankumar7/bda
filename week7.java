import java.io.*;
import java.util.*;

public class week7{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("ratings.csv"));
        String line;
        Map<Integer,Integer> result=new TreeMap<>();
        br.readLine();
        while((line=br.readLine())!=null){
            String[] data=line.split(",");
            int movieId=Integer.parseInt(data[1]);
            result.put(movieId,result.getOrDefault(movieId,0)+1);
        }
        br.close();
        System.out.println("MovieId\tRatings");
        for(int movieId: result.keySet()){
            System.out.println(movieId+"\t"+result.get(movieId));
        }

    }
}