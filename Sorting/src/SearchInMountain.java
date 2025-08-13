public class SearchInMountain {
    public static void main(String[] args) {
        int[] mountainArr = {0,1,2,4,2,1};int target = 3;
        System.out.println(Montain(target, mountainArr));
    }

    public static int Montain(int target, int[] mountainArr) {
        int ans=0;
        int peak = peak(mountainArr);
        boolean firstTry = binarySearch(mountainArr, target, 0, peak);
        boolean secTry = binarySearch(mountainArr, target, peak, mountainArr.length-1);
        if(firstTry) ans+=1;
        if(secTry) ans+=1;
        if(!firstTry && !secTry) return -1;
        return ans;
    }
    public static int peak(int[]arr){
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
    public static boolean binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start+((end-start)/2);
            if(target==arr[mid]){
                return true;
            } else if (target>arr[mid]){
                start=mid+1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
}
