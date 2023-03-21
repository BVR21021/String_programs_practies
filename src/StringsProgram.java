
public class StringsProgram {
	public static void main(String[] args) {

		String s1 = "sathya";
		String s2 = "thyasa";
		String s11 = "";
		String s22 = "";
		s11 = s1.substring(s1.length() - 2, s1.length()) + s1.substring(0, s1.length() - 2);
		s22 = s1.substring(2, s2.length()) + s1.substring(0, 2);

		if (s2.equals(s11) || s2.equals(s22)) {
			System.out.println("Obtained");
		} else {
			System.out.println("not Obtained");
		}

	}

}
