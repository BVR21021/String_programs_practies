
public class PunctuationCharacters {

	public static void main(String[] args) {

		String s = "This,java;practies:'venky'`-?/!";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ',' || ch == '.' || ch == '?' || ch == '-' || ch == '/' || ch == '"' || ch == '!' || ch == ';'
					|| ch == ':' || ch == '`') {
				count++;
			}
		}
		System.out.println("PunctuationCharacters:"+count);
	}

}
