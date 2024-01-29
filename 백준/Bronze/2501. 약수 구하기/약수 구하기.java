import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = 1;
        int k = 1;
        int result = 0;
        String line = sc.nextLine();
        n = Integer.parseInt(line.substring(0,line.indexOf(" ")));
        k = Integer.parseInt(line.substring(line.indexOf(" ")+1));
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n%i ==0 ) cnt++;
            if(k==cnt) {result = i; break; }
            else if(i==n && k > cnt ) result = 0;
            else result = 0;
        }
        System.out.print(result);
    }
}