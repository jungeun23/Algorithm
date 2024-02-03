import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
            String result = "";
            String line = bf.readLine();
            int n = Integer.parseInt(line);

            line = bf.readLine();
            String[] arr =  line.split(" ");

            int min = 0;
            int max = 0;
            for(int i= 0; i < arr.length; i++){
                int x = Integer.parseInt(arr[i]);
                if(i==0) {
                    min = x;
                    max = x;
                }
                if(x < min){
                    min = x;
                } else if (x > max){
                    max = x;
                }
            }
            System.out.print(min + " " + max);
    }
}