import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String line = "";
    private static int n = 0;
    private static int m = 0;
    public static void main(String[] args) {
        line = sc.nextLine();
        String[] strArray = line.split(" ");
        n = Integer.parseInt(strArray[0]); //행
        m = Integer.parseInt(strArray[1]); //렬


        if(n<=100 && m<=100 && n> 0 && m > 0) {
            int[][] a = getArray();
            int[][] b = getArray();

            if (a != null && b != null) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(a[i][j] + b[i][j]);
                        if (j != m - 1) {
                            System.out.print(" ");
                        }
                    }
                    if(i != n-1)
                    System.out.print("\n");
                }
            }
        }

    }

    public static int[][]  getArray() {
        int[][] a = new int[n][m];
        String[] strArr;
        int v = 0;
            for(int i = 0; i < n; i++){
                line = sc.nextLine();
                strArr = line.split(" ");
                for(int j = 0; j < m; j++){
                    v = Integer.parseInt(strArr[j]);
                    if(Math.abs(v) <= 100){
                        a[i][j] = v;
                    } else return null;
                }
            }

        return a;
    }
}