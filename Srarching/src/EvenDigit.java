public class EvenDigit {
    public static void main(String[] args) {
    int[] arr = {12,345,2,6,7896};
        System.out.println(FindNums(arr));
    }
    static int FindNums(int[] arr){
        int count = 0;
        for(int num: arr){
            if(evenDigit(num)){
                count++;
            }
        }
        return count;
    }

    static boolean evenDigit(int num) {
        int a=0;
        while (num>0){
            a++;
            num=num/10;
        }
        if(a%2==0){
            return true;
        }
        return false;
    }
}
