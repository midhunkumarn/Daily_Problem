import java.util.*;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int count,max=0;
        for(int i=0;i<name.length();i++){
            count =1;
            for(int j = i+1;j<name.length();j++){
                if(name.charAt(i) == name.charAt(j)){
                    count++;
                }
            }
            if(count>max)
            max = count;
        }
        System.out.println(max);
    }
}
