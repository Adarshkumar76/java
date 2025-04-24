import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(5,3,5,3,5,3,5);
        multiple(3, 6, "35", "dgdd", "dgdg" );
    }
    static void multiple(int a, int b, String ...s){
        System.out.println(a + " " + b);
        System.out.println(Arrays.toString(s));

    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
