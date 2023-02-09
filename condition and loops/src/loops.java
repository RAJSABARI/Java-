import java.util.*;

public class loops {
    public static void main(String[] args) {
        // syntax for for
//        for(intialisation;condition;increnment/decrement){
//            //body
//        }


        //Q= print number 1 to 5
        for (int number = 1; number <= 5; number++) {
            System.out.println(number);
        }

        // print number 1 to n
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        for (int number2 = 1; number2 <= num; number2++) {
//            System.out.println(number2);
//        }


        //while synatx
        // while(condition)
        //{ }
        int number3=100;
        while(number3<=200){
            System.out.println(number3);
            number3++;
        }


        // do while
        /*
        do{
        }
        while(condition);
        {
        ]

         */
        int number5=1;
        do {
            System.out.println("hello world");
            number5++;
        }
        while(number5<=5);


        




    }
}
