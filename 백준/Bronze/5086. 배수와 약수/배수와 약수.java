import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        String result = "";
        int cnt = 0;
        while( a != 0 && b != 0){
            if(cnt > 0) System.out.print("\n");
            String line = sc.nextLine();
            a = Integer.parseInt(line.substring(0,line.indexOf(" ")));
            b = Integer.parseInt(line.substring(line.indexOf(" ")+1));
            if(a == 0 && b == 0) break;
            cnt++;
            result = (b%a == 0) ? "factor" : ( (a%b == 0) ?"multiple" : "neither" );
            System.out.print(result);
        }


    }

}