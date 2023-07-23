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
     * @param nums array which needs to be sorted
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

    /**
     * MergeTwo function is used to merge two sorted arrays into one.
     * @param nums1 sorted array 1
     * @param nums2 sorted array 2
     * @param nums merged array
     */
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

    /** QuickSort uses divide and conquer method to do sorting.
     * The average case time complexity is O(nlogn).
     * The worst case time complexity is O(n^2).
     * @param nums the array to be sorted
     * @param low the lower index of the nums array.
     * @param high the higher index of the nums array.
     */
    public void quickSort(int[] nums,int low,int high) {
        if(high<=low) {
            return;
        }
        int pivot = nums[high];
        int pivotIndex = low ;
        for(int i=low;i<high;i++) {
            if(nums[i]<pivot){
                swap(pivotIndex,i,nums);
                pivotIndex++;
            }
        }
        swap(pivotIndex,high,nums);

        quickSort(nums,low,pivotIndex-1);
        quickSort(nums,pivotIndex+1,high);
    }

    /**
     * Method to swap elements of a given integer array
     * @param i index of the first element
     * @param j index of the second element
     * @param nums integer array
     */
    public void swap(int i, int j,int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
