
public class CountCharectersInString {

	public static void main(String[] args) {

		String s = "This is core java practise";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				count++;
			}
		}
		System.out.println("no.of charecters in string"+count);
	}

}
