package leetCode;

public class Two_Sum {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++)
			for (int j = i + 1; j < nums.length; j++)
				if (nums[i] + nums[j] == target)
					return new int[] { i + 1, j + 1 };
		return new int[] { 0, 0 };
	}

	public static void main(String[] args) {
		int[] a = new Two_Sum().twoSum(new int[] { 2, 7, 11, 15 }, 22);
		System.out.println(a[0] + " " + a[1]);
	}
}
