import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // testing TwoSum.java
        int[] nums1 = new int[]{2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(TwoSum.TwoSum(nums1,target1)));

        int[] nums2 = new int[]{3,2,4};
        int target2 = 6;

        System.out.println(Arrays.toString(TwoSum.TwoSum(nums2,target2)));

        int[] nums3 = new int[]{3,3};
        int target3 = 6;

        System.out.println(Arrays.toString(TwoSum.TwoSum(nums3,target3)));

        int[] nums4 = new int[]{99,99};
        int target4 = 0;

        System.out.println(Arrays.toString(TwoSum.TwoSum(nums4,target4)));

        // testing FAndLSorted.java
        int[] nums5 = new int[]{5,7,7,8,8,10};
        int target5 = 8;

        System.out.println(Arrays.toString(FAndLSorted.FAndLSorted(nums5,target5)));

        int[] nums6 = new int[]{5,7,7,8,8,10};
        int target6 = 6;

        System.out.println(Arrays.toString(FAndLSorted.FAndLSorted(nums6,target6)));

        int[] nums7 = new int[]{};
        int target7 = -1;
        System.out.println(Arrays.toString(FAndLSorted.FAndLSorted(nums7,target7)));


    }
}
