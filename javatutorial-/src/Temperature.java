import java.util.*;
 // "simple code for temperature C to F"
public class Temperature {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the Temp in C");
       float tempc= in.nextFloat();
       float tempF = (tempc* 9/5) *32;
       System.out.println(tempF);
       
   }
}
