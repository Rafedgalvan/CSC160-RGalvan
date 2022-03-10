import java.util.Arrays;

public class FindCommon {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4 };
		int[] nums2 = { 1, 2, 3, 5 };
		arrayReturn(nums1, nums2);

	}

	public static void arrayReturn (int nums1[], int nums2[]) {
		for (int i = 0; i < nums1.length; i++ ) {
			for(int x = 0; x <nums2.length; i++) {
				if(nums1[i] == (nums2[x])) {
					System.out.println(Arrays.toString(nums1));
				}
			}
		}
	}
}
