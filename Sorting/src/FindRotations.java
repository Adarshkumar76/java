public class FindRotations {
    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,4,5};
        System.out.println(rotation(arr));
    }

    public static int rotation(int[] arr) {
        return pivot(arr)+1;

    }
    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    start++;
                }
                if(arr[end]<arr[end-1]){
                    end--;
                }
            }
            else if(arr[mid]>=arr[start] && arr[mid]>arr[end]){
                end = mid-1;
            } else {
                start = mid+1;
            }

        }
        return -1;
    }
}
