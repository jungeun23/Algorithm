import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String line = "";
    public static void main(String[] args) {

        String[][] outArray = new String[9][9];
        int a = 0;
        int b = 0;
        double v = 0;
        int result = 0;

        line = sc.nextLine();
        String[] inArray = line.split(" ");
        a = Integer.parseInt(inArray[0]);
        b = Integer.parseInt(inArray[1]);
        v = Integer.parseInt(inArray[2]);

        result = (int)Math.ceil((v-a)/(a-b))+1;

        System.out.print(result);
    }

}