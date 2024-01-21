import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        if(n>=1 && n <=100) {
            for(int i=0; i<n; i++){
                String line = "";
                for(int j=n-1; j>= 0; j--){
                    if(j<=i){
                        System.out.printf("*");
                    }else {
                        System.out.printf(" ");
                    }
                }
                System.out.printf("\n");
            }
        }
    }
}