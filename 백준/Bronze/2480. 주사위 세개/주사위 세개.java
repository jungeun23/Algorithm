import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = 0;
        int m = 0;
        int l = 0;
        int result = 0;
        String line = sc.nextLine();
        n = Integer.parseInt(line.substring(0,line.indexOf(" ")));
        m = Integer.parseInt(line.substring(line.indexOf(" ")+1,line.lastIndexOf(" ")));
        l = Integer.parseInt(line.substring(line.lastIndexOf(" ")+1));

        if(n==m && m == l){
            result = 10000 + n*1000;
        } else if (n==m || n== l || m==l){
            result = 1000 + (n==m? n: l) * 100;
        } else {
            result = (n >=m?(n>=l? n:l):(m>= l? m: l)) * 100;
        }
        System.out.print(result);
    }
}