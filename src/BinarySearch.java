public class BinarySearch {
    /**
     * A method to do binary search on a sorted array.
     * @param nums sorted array
     * @param element number which needs to be searched
     * @param low lower index from which searching needs to be started
     * @param high higher index within which elements needs to be searched
     * @return true or false
     */
    public static boolean binarySearch (int[] nums,
                                        int element,
                                        int low,
                                        int high) {

        // Check if low and high are within the bounds of the array
        if (low < 0 || high >= nums.length || low > high) {
            throw new IllegalArgumentException("Invalid low and high index values");
        }

        try{
            while (low <= high) {
                int mid = low + (high-low)/2;
                if(nums[mid] == element) {
                    return true;
                }
                else if(nums[mid] > element) {
                    high = mid-1;
                }
                else if(nums[mid] < element) {
                    low = mid+1;
                }
            }
            return false;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
