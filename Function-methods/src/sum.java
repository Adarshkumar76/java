import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
    sum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");
        int b = sc.nextInt();
        int ans = sum2(a, b);
        System.out.println(ans);
    }

    static int sum2(int a, int b){
        int c = a+b;
        return c;
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);

    }

}
