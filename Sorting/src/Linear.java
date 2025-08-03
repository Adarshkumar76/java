public class Linear {
    public static void main(String[] args) {
        int[] arr = {2, 5, 29, 23, 24, 354, 25, 23445, -2, 22};
        int key = 22;
        System.out.println(LinearSearch(arr, key));
    }
//    searching in array and return index
    static int LinearSearch(int[] arr, int key){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
