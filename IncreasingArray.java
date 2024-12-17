import java.util.*;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = scan.nextInt();
        }

        int moves = 0;
        for(int i=1;i<num;i++){
            
            if(arr[i]<arr[i-1]){
                moves += arr[i - 1] - arr[i];
                arr[i] = arr[ i - 1];
            }
        }System.out.println(moves);
    }
}
