
public class ArrayReverse {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] nums2 = nums;
		int i;
		arrayReturn(nums);
		

	}
	
	public static int[] arrayReturn (int nums[]) {
		int j = nums.length - 1;
		for(int i = 0; i < nums.length ; i++) {
			nums2[j] = nums[i];
			j--;
		}
	}

}



	

