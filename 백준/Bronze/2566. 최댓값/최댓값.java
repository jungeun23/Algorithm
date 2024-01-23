import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String line = "";
    public static void main(String[] args) {

        String[][] outArray = new String[9][9];
        int grtNm = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i< 9 ; i++){
            line = sc.nextLine();
            String[] inArray = line.split(" ");

            for(int j=0; j<9; j++){
                outArray[i][j] = inArray[j];
                if(Integer.parseInt(inArray[j]) >= grtNm) {
                    grtNm = Integer.parseInt(inArray[j]);
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.print(grtNm+"\n");
        System.out.print(x + " " + y);
    }

}