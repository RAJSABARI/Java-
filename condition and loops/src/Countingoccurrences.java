import java.util.*;

public class Countingoccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number= in.nextInt(); //4552
        int search=in.nextInt(); //5
        int count=0;
        while(number!=0){
            int digit=number%10;
            number=number/10;
            if(digit==search){
                count++;
            }
        }
        System.out.println(count);
    }
}
