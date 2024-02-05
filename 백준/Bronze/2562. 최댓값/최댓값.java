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
            for(int i=0; i<9; i++){
                int x = Integer.parseInt(bf.readLine());
                if( x > maxNum){
                    maxNum = x;
                    seq = i+1;
                }
            }
            System.out.println(maxNum);
            System.out.print(seq);
    }
}