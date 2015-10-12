package leetCode;

public class Add_Digits {
	/**
	 * ������1���õݹ�ķ�ʽ��һ��integer��λ���
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
	 * ��fun1������ɸ�λ���ֱ�����Ϊһλ��
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
	 * ʹ��trick��O(1)ʱ�临�Ӷ�
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
	 * ��fun1��fun2�ϲ���һ��ĺ���
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
