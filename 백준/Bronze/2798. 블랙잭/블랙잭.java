import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = 0;
        int m = 0;
        int result = 0;
        String line = sc.nextLine();
        n = Integer.parseInt(line.substring(0,line.indexOf(" ")));
        m = Integer.parseInt(line.substring(line.indexOf(" ")+1));
        String line2 = sc.nextLine();

        String[] stArr = line2.split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>(stArr.length);
        //System.out.println(stArr.length);
        for(int i=0; i < stArr.length; i++){
            arr.add(0);
            arr.set(i,Integer.parseInt(stArr[i]));
            //System.out.print(arr.get(i) + " ");
        }
        //System.out.println();
        int z = n-1;
        int fir = 0;
        int cnt = 1;
            int tmp = 0;
            int tmp2 = 0;
        for(int i=0; i<=n-3; i++){
            fir = arr.get(i);
            //System.out.println( z + " " + fir);
           for(int j= z; j>1; j--){
               tmp = arr.get(i+1) + arr.get(i+j) + fir;
               //System.out.println( "tmp = "+tmp + " : "+ +arr.get(i+1) + " + "+ arr.get(i+j) + " + " + fir );
               cnt++;
               if(result < tmp && tmp <= m  ) result = tmp;

               if(i > 0) {
                   for(int k =1; k<=i; k++){
                       tmp2 = arr.get(i+1) + arr.get(i+j) + arr.get(i-k);
                       //System.out.println( "tmp2 = "+tmp2 + " : "+ +arr.get(i+1) + " + "+ arr.get(i+j) + " + " + arr.get(i-k) );
                       cnt++;
                    if(result < tmp2 && tmp2 <= m  ) result = tmp2;
                   }
               }
           }
           z--;
        }
        System.out.print(result);
    }
}