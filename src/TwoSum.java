import java.util.HashMap;

public class TwoSum {
    public static int[] TwoSum(int[] inArr, int target) {
        int inArrSize = inArr.length;
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < inArrSize; ++i) {
            int complement = target - inArr[i];
            if (myHashMap.containsKey(complement)) {
                return new int[]{myHashMap.get(complement),i};
            }
            else {
                myHashMap.put(inArr[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
