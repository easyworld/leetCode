package leetCode;

public class String_to_Integer_atoi {
	public int myAtoi(String str) {
		if (str.isEmpty())
			return 0;
		boolean flag = false;
		boolean positive = true;
		int i, j;
		for (i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9')
				break;
			else if (flag)
				return 0;
			else if (c == '+') {
				positive = true;
				flag = true;
			} else if (c == '-') {
				positive = false;
				flag = true;
			} else if (c == ' ')
				continue;
			else
				return 0;
		}
		if (i > str.length() - 1)
			return 0;
		for (j = i; (str.charAt(j) <= '9' && str.charAt(j) >= '0'); j++) {
			if (j == str.length() - 1)
				break;
		}

		long result = 0;
		long base = 1;
		for (int k = j; k >= i; k--) {
			char c = str.charAt(k);
			if (c > '9' || c < '0')
				continue;
			result += base * (c - '0');
			if (positive == true && result > 2147483647)
				return 2147483647;
			else if (positive == false && result > 2147483648L)
				return -2147483648;
			base *= 10;
		}
		return positive ? ((int) result) : (int) -result;
	}

	public static void main(String[] args) {
		String_to_Integer_atoi s = new String_to_Integer_atoi();
		System.out.println(s.myAtoi(" -+2648") == 0);
		System.out.println(s.myAtoi("-2147483648") == -2147483648);
		System.out.println(s.myAtoi("2147483648") == 2147483647);
		System.out.println(s.myAtoi("   -   321") == 0);
		System.out.println(s.myAtoi("") == 0);
		System.out.println(s.myAtoi(" -23ss43") == -23);
		System.out.println(s.myAtoi("abc") == 0);
		System.out.println(s.myAtoi("  +b12102370352") == 0);//
		System.out.println(s.myAtoi(" b11228552307") == 0);
		System.out.println(s.myAtoi("    10522545459") == 2147483647);
		
	}
}
