public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int salary = 25000;
        if(salary > 20000){
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);

        for(int i = 0; i<=5; i++){
            System.out.println(i);
        }
        int i =0;
        while (i<=5){
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        }while (i<10);
    }
}