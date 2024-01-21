import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String line = "";
        int v = 0;
        n = sc.nextInt();
        sc.nextLine();
        line = sc.nextLine();
        v = sc.nextInt();

        String[] strArray;
        strArray = line.split(" ");
        int result = 0;
        if(n>=1 && n <=100 && v>= -100 && v <= 100) {
            for(int i=0; i<n; i++){

                if((v+"").equals(strArray[i])){
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}