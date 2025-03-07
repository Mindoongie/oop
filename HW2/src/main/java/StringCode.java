import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		if (str == null || str.length() == 0) return 0;

		int max = 1, count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
				max = Math.max(max, count);
			}
			else count = 1;
		}

		return max;
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				if (i < str.length() - 1) {
					int digit = Character.getNumericValue(ch);
					char next = str.charAt(i + 1);

					for(int j = 0; j < digit; j++) {
						ans.append(next);
					}
				}
			}
			else {
				ans.append(ch);
			}
		}

		return ans.toString();
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		if (len > a.length() || len > b.length()) return false;

		Set<String> set = new HashSet<>();
		for (int i = 0; i < a.length(); i++) {
			set.add(a.substring(i, len + 1));
		}

		for (int i = 0; i < b.length(); i++) {
			if (set.contains(b.substring(i, len + 1))) return true;
		}

		return false;
	}
}
