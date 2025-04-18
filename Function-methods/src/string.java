public class string {
    public static void main(String[] args) {
        String name = "MyName";
        String returnData = printString(name);
        System.out.println(returnData);

    }

    static String printString(String name){
        String data = "Hello " + name;
        return data;
    }


}
