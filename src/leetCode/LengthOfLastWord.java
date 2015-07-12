package leetCode;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		int last, first;
		for (last = s.length() - 1; last >= 0 && s.charAt(last) == ' '; last--)
			;
		for (first = last; first >= 0 && s.charAt(first) != ' '; first--)
			;
		return last - first;
	}

}
