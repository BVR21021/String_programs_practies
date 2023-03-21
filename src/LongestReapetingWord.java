import java.util.Arrays;

public class LongestReapetingWord {
	public static String lcp(String s, String s1) {
		int n = 0;
		if (s.length() < s1.length()) {
			n = s.length();
		} else {
			n = s1.length();
		}
		// System.out.println("n:"+n);

		// System.out.println("s:"+s);
		// System.out.println("s1:"+s1);
		for (int i = 0; i < n; i++) {
			// System.out.println(s.charAt(i)+","+s1.charAt(i));
			if (s.charAt(i) != s1.charAt(i)) {
				// System.out.println("not equal"+s.charAt(i)+","+s1.charAt(i));
				// System.out.println("if:"+s.substring(0, i));
				return s.substring(0, i);

			}
		}

		// System.out.println(s.substring(0, n));
		return s.substring(0, n);
	}

	public static void main(String[] args) {

		String str = "abcdab";
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String a = lcp(str.substring(i, str.length()), str.substring(j, str.length()));
				// System.out.println("a:"+a);
				if (a.length() > str1.length()) {
					str1 = a;
				}
				// System.out.println("str1:"+str1);
			}
		}

		System.out.println("str1:" + str1);
	}

}
