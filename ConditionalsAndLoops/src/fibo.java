import java.util.Scanner;

public class fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        if (n==0 || n==1) {
            System.out.println(a);
        } else {
                System.out.print(a+" "+ b + " ");
            for (int i = 0; i <= n; i++){
                c=a+b;
                System.out.print(c + " ");
                a=b;
                b=c;
            }
        }

    }
}
