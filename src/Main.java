public class Main {
    public static void main(String[] args) {
        int[] nums = {4,25,13,27,1};
        SortingAlgo bubble = new SortingAlgo();
        bubble.quickSort(nums,0,nums.length-1);
        for (int num:
             nums) {
           System.out.println(num);
        }
    }
}
