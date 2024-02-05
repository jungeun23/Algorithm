import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
//            String result = "";
            int maxNum = 0;
            int seq = 0;
            String line = bf.readLine();
            int n = Integer.parseInt(line.substring(0,line.indexOf(" ")));
            int m = Integer.parseInt(line.substring(line.indexOf(" ")+1));
            int[] arr = new int[n];

            for(int i=0; i<m; i++){
                String li = bf.readLine();
                int x = Integer.parseInt(li.substring(0, li.indexOf(" ")));
                int y = Integer.parseInt(li.substring(li.indexOf(" ")+1, li.lastIndexOf(" ")));
                int z = Integer.parseInt(li.substring(li.lastIndexOf(" ")+1));
                for(int j=0; j<(y-x+1); j++){
                    arr[x+j-1] = z;
                }
            }

            for(int i = 0; i<n ; i++){
                if(i == n-1 ){
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] +" ");
                }
            }

    }
}