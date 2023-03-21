import java.util.Arrays;
import java.util.Scanner;

public class DivideAStringIn_N_EqualParts {

	public static void main(String[] args) {

		String s = "venkyy";
		int l = s.length();
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter how many parts do you want divide a string:");
		int n = sc.nextInt();
		int chars = l / n;
		String[] str = new String[n];
		int temp = 0;
		if (l % n == 0) {
			for (int i = 0; i < s.length(); i = i + chars) {
				str[temp] = s.substring(i, i + chars);
				temp++;
			}
			System.out.println(Arrays.toString(str));
		} else {
			System.out.println("Sorry this string not divided into" + " " + n + " " + "parts.....");
		}

	}

}
