
public class Counting_charecters_accrences {

	public static void main(String[] args) {
		String s = "abcabc";
		int arr[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			arr[(int) s.charAt(i)]++;
		}
		for (int j = 0; j < 256; j++) {
			if (arr[j] != 0) {
				System.out.print((char) j + ":");
				System.out.print(arr[j] + " |");

			}
		}
	}

}
