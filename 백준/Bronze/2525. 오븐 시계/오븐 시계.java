import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int h = 0;
        int m = 0;
        int l = 0;
        int result = 0;
        String line = sc.nextLine();
        h = Integer.parseInt(line.substring(0,line.indexOf(" ")));
        m = Integer.parseInt(line.substring(line.indexOf(" ")+1));
        l = sc.nextInt();

        int hh = 0;
        int mm = 0;
        if(m+l >=60){
            hh = ((m+l)/60 + h )> 23? ((m+l)/60 + h ) - 24 : ((m+l)/60 + h ) ;
            mm = (m + l)%60==0 ? 0 : (m+l) - ((m+l)/60)*60 ;
        } else {
            hh = h;
            mm = m + l;
        }

        System.out.print(hh + " " + mm);
    }
}