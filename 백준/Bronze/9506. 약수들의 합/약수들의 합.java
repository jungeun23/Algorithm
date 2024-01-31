import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String result = "";
//        String line = sc.nextLine();
        int status = 0;
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        while(status == 0){
            int r = sc.nextInt();
            if(r == -1) {
                status = 1;
                break;
            }
            intArr.add(r);
        }

        for(int i= 0; i < intArr.size(); i++){
            if(i != 0) System.out.print("\n");
            int n = intArr.get(i);
            int sum = 0;
            String str = "";
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j=1 ; j < n; j++ ){
                if(n%j == 0){
                    arr.add(j);
                    sum = sum + j;
                    if(j== 1){
                        str = " = " + j;
                    } else {
                        str = str +" + "+ j ;
                    }
                }
            }
            if(sum == n){
                result = n + str;
            } else {
                result = n + " is NOT perfect.";
            }
            System.out.print(result);
        }
    }
}