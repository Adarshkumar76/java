import java.util.Scanner;

public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int count = 0;
        while (n>0){
            int rem = n%10;
            if(rem == a){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
