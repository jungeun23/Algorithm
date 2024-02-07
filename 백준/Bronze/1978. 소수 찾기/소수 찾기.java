import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
//            String result = "";

            int n = Integer.parseInt( bf.readLine());
            String line =  bf.readLine();
            String[] arr = line.split(" ");

            int m = 0;
            for(int i=0; i<n; i++){
                int x = Integer.parseInt(arr[i]);
                int r = 0;
                if(x == 1){
                    continue;
                } else {
                    for(int j=2; j<x; j++){
                        if(x%j == 0) {
                            r++;
                        }
                    }
                    if(r == 0) m++;
                }
            }
            System.out.print(m);

    }
}