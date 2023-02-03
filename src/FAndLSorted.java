public class FAndLSorted {
    
    public static int[] FAndLSorted(int[] arr, int target) {
        int currLast = -1, currFirst = -1;
        int arrSize = arr.length;
        if (arrSize == 0) return new int[] {currFirst,currLast};
        int start = 0, end = arrSize-1;
        // find first index
        while (end >= start) {
           int mid = (start+end)/2;

           if (arr[mid] > target) {
               end = mid-1;
           }
           else if (arr[mid] < target) {
               start = mid + 1;
           }
           else {
               currFirst = mid;
               end = mid -1;
           }
        }
        start = 0;
        end = arrSize;
        while (end >= start) {
            int mid = (start+end)/2;

            if (arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                currLast = mid;
                start = mid +1;
            }
        }
        // find last index
        //int mid =

        return new int[] {currFirst,currLast};
    }
}