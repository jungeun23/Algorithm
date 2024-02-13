import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

            int[] arr = new int[10];
            int n = 10;
            int m = 0;

            for(int i=0; i<n; i++){
                int x =  Integer.parseInt( bf.readLine());
                arr[i] = x%42;
                for(int j=0; j<i ; j++){
                    if(arr[j] == arr[i]) arr[i] = -1;
                }
            }
            for(int i : arr){
                if(i != -1 ) m++;
            }
            System.out.print(m);
    }
}