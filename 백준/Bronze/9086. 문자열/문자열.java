import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String result = "";
        int n = Integer.parseInt(sc.nextLine());
        String line = "";
        for(int i= 0; i < n; i++){
             line = sc.nextLine();
             System.out.println(line.substring(0,1) +line.substring(line.length()-1));
        }

    }
}