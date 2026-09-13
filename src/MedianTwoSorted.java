import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianTwoSorted {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = IntStream.concat(  Arrays.stream(nums1),Arrays.stream(nums2)).toArray();

        Arrays.sort(merged);

        double answer;
        int i = merged.length / 2;

        if (merged.length % 2 == 0) {
            answer = (merged[i - 1] + merged[i]) / 2.0;
        } else {
            answer = (double) merged[i];
        }

        return answer;
    }

    static void main() {
        MedianTwoSorted medianTwoSorted = new MedianTwoSorted();
        int[] nums1 = {2,1,3,4};
        int[] nums2 = {6,5,7,8};
        System.out.println(medianTwoSorted.findMedianSortedArrays(nums1, nums2));
    }

}
