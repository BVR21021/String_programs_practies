
public class RemoveSubString {

	public static void main(String[] args) {

		String s = "This is core java";
		String s1 = "";
		String sub = "core";
		String match = "";
		int n = sub.length();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == sub.charAt(0)) {
				match = s.substring(i, i + n);

				i = i + n;
			} else {
				s1 = s1 + ch;
			}
		}
		System.out.println("orginal String:" + s);
		System.out.println("After Remove Substring in String:" + s1);
		System.out.println("removing String:" + sub);
		System.out.println("matched String:" + match);
	}

}
