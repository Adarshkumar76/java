public class min {
    public static void main(String[] args) {
        int[] arr = {1, 39, 20, 24, 86};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }
    static int maxRange(int[]arr, int start, int end){
        if(arr.length ==0) {
            return -1;
        }
        if(start<0 && end>arr.length){
            return -1;
        }
        int a = arr[0];
        for (int i = start; i < end; i++) {
            if(a<arr[i]){
                a=arr[i];
            }
        }
        return a;
    }
    static int max(int[] arr){
        if(arr.length ==0) {
            return -1;
        }
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(a<arr[i]){
                a=arr[i];
            }
        }
        return a;
    }
}
