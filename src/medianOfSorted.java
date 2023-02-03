import static java.lang.Math.*;

public class medianOfSorted {

    public static int medianOfSorted(int[] a, int[] b) {
        int median;
        int aLen = a.length;
        int bLen = b.length;
        int numberOfElements = aLen + bLen;
        int half = numberOfElements/2;

        if (bLen < aLen) {
            medianOfSorted(b,a);
        }

        int left = 0, right = aLen-1;
        int aMid, bMid;
        int aLeft, aRight, bLeft, bRight;

        while (true) {
            aMid = (left + right)/2;
            bMid = half - aMid -2;

            if (aMid >= 0) aLeft = a[aMid];
            else aLeft = Integer.MIN_VALUE;

            if (bMid >= 0) bLeft = b[bMid];
            else bLeft = Integer.MIN_VALUE;

            if (aMid+1 < aLen) aRight= a[aMid+1];
            else aRight= Integer.MAX_VALUE;

            if (bMid+1 < bLen) bRight = b[bMid+1];
            else bRight = Integer.MAX_VALUE;

            if (aLeft <= bRight && bLeft <= aRight) {

                if (numberOfElements % 2 == 1) {
                    return min(aRight, bRight);
                }
                else return (max(aLeft,bLeft) + min(aRight, bRight) /2 );
            }
            else if (aLeft > bRight) left = aMid-1;
            else right = aMid+1;
        }
    }
}
