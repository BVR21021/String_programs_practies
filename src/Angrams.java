import java.util.Arrays;

public class Angrams {

	public static void main(String[] args) {

		String s = "vnnky";
		String s1 = "venky";
		boolean flag = true;
		if (s.length() == s1.length()) {
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch - 32);
				}
			}
			char[] ch = new char[s.length()];
			char[] ch1 = new char[s1.length()];
			for (int i = 0; i < s.length(); i++) {
				ch[i] = s.charAt(i);
				ch1[i] = s1.charAt(i);
			}
			// char[] ch = s.toCharArray();
			// char[] ch1 = s1.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				for (int j = 0; j < ch.length - 1; j++) {
					if (ch[j] > ch[j + 1]) {
						char temp = ch[j];
						ch[j] = ch[j + 1];
						ch[j + 1] = temp;
					}
				}

			}
			System.out.println(Arrays.toString(ch));
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch1.length - 1; j++) {
					if (ch1[j] > ch1[j + 1]) {
						char temp = ch1[j];
						ch1[j] = ch1[j + 1];
						ch1[j + 1] = temp;
					}
				}

			}
			int j = 0;
			System.out.println(Arrays.toString(ch1));
			for (int i = 0; i < ch.length; i++) {

				if (ch[i] != ch1[j]) {
					// System.out.println(ch[i]+","+ch1[j]);
					flag = false;

				}
				// System.out.println(ch[i]+","+ch1[j]);
				j++;
			}
			if (flag) {
				System.out.println(s + " " + "and" + " " + "'" + s1 + "'" + " " + "are anagrams.......");
			} else {
				System.out.println(s + " " + "and" + " " + s1 + " " + " not are anagrams.......");
			}

		}

		else {
			System.out.println("Strings are not anagrams........");
		}
	}

}
