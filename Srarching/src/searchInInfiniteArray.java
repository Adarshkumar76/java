public class searchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4,5,6, 7, 8, 9, 10, 20, 33, 44, 56, 78, 90};
        int target = 33;
        int ans = Search(arr,target);
        System.out.println(ans);
    }
    public static int Search(int[]arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start=newStart;
        }
        int idx = binarySearch(arr, target, start, end);
        return idx;
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start+((end-start)/2);
            if(target==arr[mid]){
                return mid;
            } else if (target>arr[mid]){
                start=mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
