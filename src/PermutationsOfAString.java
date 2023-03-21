
public class PermutationsOfAString {

	public static void main(String[] args) {

		String s = "ven";
		int len = s.length();
		generatePermutations(s, 0, len);
	}

	public static void generatePermutations(String str, int start, int end) {
		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {
				str = stringSwapping(str, start, i);
				generatePermutations(str, start + 1, end);
				str = stringSwapping(str, start, i);
			}
		}

	}

	public static String stringSwapping(String str, int i, int j) {
		// System.out.println(str+","+i+","+j);
		char[] c = str.toCharArray();
		char ch = c[i];
		c[i] = c[j];
		c[j] = ch;
		return String.valueOf(c);
	}

}
