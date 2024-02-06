import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
//            String result = "";
            int rot = 28;
            int[] arr = new int[30];

            for(int i=0; i<rot; i++){
                int x = Integer.parseInt( bf.readLine());
                arr[x-1] = x;
            }

            int m = 0; //작은값
            int n = 0; //그 다음 값
            int cnt = 0;
            for(int j : arr){
                if (j == 0 && m == 0){
                    m = cnt+1;
                } else if(j==0 && m!= 0){
                    n = cnt+1;
                }
                cnt++;
            }

            System.out.println(m<n? m: n);
            System.out.print(m>n? m: n);

    }
}