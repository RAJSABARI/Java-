public class reverseanumber {
    // in this how to reverse a number
    public static void main(String[] args) {
      int number=234567;
      int ans=0;
      while(number>0){
          int rem= number%10;
          number/=10;
          ans=ans*10+rem;
      }
        System.out.println(ans);
    }
}
