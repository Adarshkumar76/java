public class Overloading {
    public static void main(String[] args) {
        func(3);
        func("hay");
    }

    static void func(int a){
        System.out.println(a);
    }
    static void func(String a){
        System.out.println(a);
    }
}
