package leetCode;

public class ZigZagConversion {
	/**
	 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given
	 * number of rows like this: (you may want to display this pattern in a
	 * fixed font for better legibility) <br>
	 * P___A__ H__ N<br>
	 * A P L S I I G<br>
	 * Y___I___R___ <br>
	 * And then read line by line: "PAHNAPLSIIGYIR" Write the code that will
	 * take a string and make this conversion given a number of rows: string
	 * convert(string text, int nRows); convert("PAYPALISHIRING", 3) should
	 * return "PAHNAPLSIIGYIR".
	 */
	public static String convert(String s, int numRows) {
		if (numRows <= 1)
			return s;
		StringBuilder sb = new StringBuilder();
		int num = (s.length() / (2 * numRows - 2) + 1) * (numRows - 1);
		char[][] temp = new char[numRows][num];

		int i = 1, j = 1/* 第j行 */, k = 0/* 第k列 */;
		/*
		 * for (j = 0; j < numRows; j++) { for (k = 0; k < num; k++) {
		 * temp[j][k] = ' '; } } j = 1; k = 0;
		 */
		temp[0][0] = s.charAt(0);
		while (i < s.length()) {
			while (i < s.length() && j < numRows) {
				temp[j++][k] = s.charAt(i++);
			}
			j -= 2;
			k++;
			while (i < s.length() && j >= 0 && k < num) {
				temp[j--][k++] = s.charAt(i++);
			}
			j = 1;
			k--;
		}
		for (j = 0; j < numRows; j++) {
			for (k = 0; k < num; k++) {
				// System.out.print(temp[j][k]);
				if (temp[j][k] != 0)
					sb.append(temp[j][k]);
			}
			// System.out.println();
		}
		return sb.toString();
	}

	public static String convert2(String s, int numRows) {
		int chunk = Math.max(numRows * 2 - 2, numRows);
		StringBuilder result = new StringBuilder();

		for (int row = 0; row < numRows; row++) {
			for (int i = 0; i < s.length(); i += chunk) {
				if (i + row < s.length())
					result.append(s.charAt(i + row));
				if (row > 0 /* 不是第一行 */&& row < numRows - 1/* 不是最后一行 */
						&& (i + chunk - row < s.length())/* 不超过length范围 */)
					result.append(s.charAt(i + chunk - row));
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String s = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
		int numRows = 4;
		System.out.println(convert2(s, numRows));
	}
}
