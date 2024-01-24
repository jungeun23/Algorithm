import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        n = n -1 ;
        int v = 1;
        while(n > 0){
            n = n - (v*6);
            v = v+1;
        }
        System.out.print(v);
    }

}