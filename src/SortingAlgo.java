import java.util.Arrays;

public class SortingAlgo {
    /**
     * Bubble sorting time complexity is O(n^2)
     */
    public void bubbleSort(int[] nums) {
        int size = nums.length;
        for(int i=0;i<size;i++) {
            for(int j=i;j<size;j++) {
                if(nums[i]>nums[j]) {
                    swap(i,j,nums);
                }
            }
        }
    }

    /**
     * Selection sort has time of order of O(n^2)
     */
    public void selectionSort(int[] nums) {
        int size = nums.length;

        for(int i=0;i<size;i++) {
            int min = i,j;
            for(j=i;j<size;j++) {
                if(nums[j]<nums[min]) {
                    min = j;
                }
            }
            swap(i,min,nums);
        }
    }


    /**
     * Insertion sort time complexity is O(n^2)
     */
    public void insertionSort(int[] nums) {
        int size = nums.length;
        for(int i=1;i<size;i++) {
            int j=i;
            while(j>0 && nums[j-1] > nums[j]) {
                swap(j,j-1,nums);
                j--;
            }
        }
    }

    /**
     * Merge uses divide & conquer algorithm
     * The worst case time-complexity of merge sort is O(n^2)
     * @param nums
     */
    public void mergeSort(int[] nums) {
        int size = nums.length;
        if(size <= 1) {
            return;
        }
        int[] nums1 = Arrays.copyOfRange(nums,0,size/2);
        int[] nums2 = Arrays.copyOfRange(nums,size/2,size);
        mergeSort(nums1);
        mergeSort(nums2);
        mergeTwo(nums1,nums2,nums);
     }

     public void mergeTwo(int[] nums1, int[] nums2, int[] nums) {
        int s1 = nums1.length;
        int s2 = nums2.length;

        int i=0,j=0,k=0;
        while(i<s1 && j<s2) {
            if(nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            }
            else {
                nums[k++] = nums2[j++];
            }
        }
        while (i<s1) {
            nums[k++] = nums1[i++];
        }
        while (j<s2) {
            nums[k++] = nums2[j++];
        }
     }

    public void quickSort(int[] nums) {
        int size = nums.length;
        if(size<=1) {
            return;
        }
        int pivotIndex = 0;
        for(int i=0;i<size-1;i++) {
            if(nums[i]<=nums[size-1]){
                pivotIndex++;
                swap(pivotIndex,i,nums);

            }
        }
        swap(pivotIndex,size-1,nums);

        int[] nums1 = Arrays.copyOfRange(nums,0,pivotIndex);
        int[] nums2 = Arrays.copyOfRange(nums,pivotIndex,size);
        quickSort(nums1);
        quickSort(nums2);
    }
    public void swap(int i, int j,int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
