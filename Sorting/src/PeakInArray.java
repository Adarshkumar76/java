public class PeakInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 5, 3, 2};
        System.out.println(PeakMountain(arr));
    }

    public static int PeakMountain(int[]arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            } else if(arr[mid]>arr[mid+1]){
                end =mid;
            }
        }
        return end;
    }
}
