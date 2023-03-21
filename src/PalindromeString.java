
public class PalindromeString {

	public static void main(String[] args) {

		String s = "MadaM";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		System.out.println(s + "," + s1);
		int j = 0;
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s1.charAt(j)) {
				flag = false;
				System.out.println("not palindrome");
			}
			j++;
		}
		if (flag) {
			System.out.println("palindrome");
		}
	}

}
