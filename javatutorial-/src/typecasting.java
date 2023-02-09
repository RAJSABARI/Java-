import java.util.*;

public class typecasting {
    public static void main(String[] args){

        Scanner in= new Scanner(System.in);
// *       int input= in.nextInt();
//        System.out.println(input); // little integer will change //
                                    // cannot convert float into integer//
                                    //convert integer into float//

        // type casting
        int num= (int)(554451.55454);
        System.out.println(num);

        //automatic type promotion in expression
        int a=12345;
        byte b=(byte)(a); //12345 %256 =57
        System.out.println(b);



    }
}
