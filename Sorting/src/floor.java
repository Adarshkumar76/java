public class floor {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 4;
        System.out.println(Myfloor(nums, target));
    }

    private static int Myfloor(int[] nums, int target) {
        if(target<nums[0]){
            return -1;
        }
        int low = 0;
        int high = nums.length-1;
        int mid;
        while(low<=high){
            mid = low+((high-low)/2);
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
}

