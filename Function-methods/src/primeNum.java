import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isArmstrong(n));

        for (int i = 100; i< 1000; i++){
            if (isArmstrong(i)){
                System.out.print(i +" ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n% 10;
            sum += rem*rem*rem;
            n/=10;
        }
        return original == sum;
    }

    static boolean isPrime(int n){
      if (n <= 1){
          return false;
      }
      int c =2;
      while (c*c <= n){
          if (n%c == 0){
              return false;
          }
          c++;
      }
      return c*c >n;
    }
}
