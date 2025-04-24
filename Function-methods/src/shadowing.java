public class shadowing {
        static int x = 30; // this will shadowed al line 5
    public static void main(String[] args) {
        System.out.println(x); //30
//        int x = 59;
        int x;  // the class variable at line 2 is shadowed by this
//        System.out.println(x);  // scope will begin when value is initialized
        x = 48;
        System.out.println(x); //48
        func();
    }
   static void func (){
       System.out.println(x); //30
    }
}
