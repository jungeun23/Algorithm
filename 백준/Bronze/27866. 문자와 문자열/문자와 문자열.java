import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = "";
        int i = 0;
        line = sc.nextLine();
        i = sc.nextInt();
        if(i>= 1 && i <= line.length()){
            System.out.println(line.substring(i-1,i));
        }

    }
}