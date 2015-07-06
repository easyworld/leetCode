package leetCode;

public class Power_of_Two {
	public static boolean isPowerOfTwo(int n) {
		while (n > 1 && (n & 1) == 0) {
			n >>= 1;
		}
		if (n == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 1025; i++)
			if (isPowerOfTwo(i))
				System.out.print(i + "\t");
	}
}
