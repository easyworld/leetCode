package leetCode;

public class Add_Digits {
	/**
	 * 处理方法1，用递归的方式把一个integer各位相加
	 * 
	 * @param n
	 * @return
	 */
	public static int fun(int n) {
		if (n < 10)
			return n;
		else
			return fun(n / 10) + n % 10;
	}

	/**
	 * 与fun1配合生成各位相加直到结果为一位数
	 * 
	 * @param n
	 * @return
	 */
	public static int fun2(int n) {
		int i = fun(n);
		while (i >= 10)
			i = fun(i);
		return i;
	}

	/**
	 * 使用trick，O(1)时间复杂度
	 * 
	 * @param n
	 * @return
	 */
	public static int fun3(int n) {
		if (n == 0)
			return 0;
		int i = n % 9;
		return i == 0 ? 9 : i;
	}

	/**
	 * 把fun1与fun2合并在一起的函数
	 * 
	 * @param n
	 * @return
	 */
	public static int fun4(int n) {
		if (n < 10)
			return n;
		else {
			do {
				n = fun4(n / 10) + n % 10;
			} while (n >= 10);
			return n;
		}

	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
			System.out.println(i + "\t" + fun4(i) + "\t" + fun3(i));
	}
}
