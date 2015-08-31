package leetCode;

public class Single_Number {
	public int singleNumber(int[] nums) {
		if (nums.length < 1)
			return nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums[0] ^= nums[i];
		}
		return nums[0];
	}

	public static void main(String[] args) {
		Single_Number s = new Single_Number();
		System.out.println(s.singleNumber(new int[] {  }));
	}
}
