import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        try{
            String result = "";
            String line = bf.readLine();
            int n = Integer.parseInt(line.substring(0,line.indexOf(" ")));
            int m = Integer.parseInt(line.substring(line.indexOf(" ")+1));

            String line2 = bf.readLine();
            String[] arr =  line2.split(" ");
            int ch = 0;
            for(int i= 0; i < n; i++){
                if(Integer.parseInt(arr[i]) < m){
                    if(ch != 0) System.out.print(" ");
                    System.out.print(arr[i]);
                    ch= 1;
                }
            }
        } catch (Exception e) {
            bf.close();
            System.out.println(e.toString());
        }
    }
}