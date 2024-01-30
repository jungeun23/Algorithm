import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = 0;
        int m = 0;
        int result = 0;
        String line = sc.nextLine();
        n = Integer.parseInt(line.substring(0,line.indexOf(" ")));
        m = Integer.parseInt(line.substring(line.indexOf(" ")+1));
        if(m >= 45 && m <=59){
            m = m-45;
        } else if (m <45 && m >= 0) {
            m = m + 60 - 45;
            n = n == 0 ? 23: n - 1;
        }
        System.out.print(n +" "+ m);
    }
}