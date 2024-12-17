import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for(int i=1;i<=num -1;i++){
            arr[i] = scan.nextInt();
        }
        int sum =0;
        for(int i = 1;i<=num;i++){
            sum = sum+i;
        }
        int sum1 = 0;
        for(int i =1;i<=num -1;i++){
            sum1 = sum1 + arr[i];
        }

        System.out.println(sum - sum1);
    }
}
