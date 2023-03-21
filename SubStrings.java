import java.util.Arrays;

public class SubStrings {

	public static void main(String[] args) {

		String s="venky";
		//System.out.println(s.length()*(s.length()+1)/2);
	int	n=s.length();
		String [] str= new String[n*(n+1)/2];
		int temp=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				
				str[temp]=s.substring(i, j+1);
				temp++;
			}
		}
		System.out.println(Arrays.toString(str));
	}

}
