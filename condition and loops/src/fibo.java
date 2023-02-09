import java.util.*;

public class fibo {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        long n = in.nextInt();
       long  start=0;
        long  intial=1;
       long  count=2;
        while(count<=n){
            long temp=intial;
            intial=intial+start;
            start=temp;
            count++;
            //System.out.println(intial); -this will print entire number you gave
        }
        System.out.println(intial); // it will print crt position of fibonix number
    }
}
