import java.util.Scanner;

public class Strings {
// main method  
	public static void main(String argvs[]) {
		String str[] = { "Praveen Kumar", "Yuvraj Singh", "Harbhajan Singh", "Gurjit Singh", "Virat Kohli",
				"Rohit Sharma", "Sandeep Singh", "Milkha Singh" };
		String surName = "Singh";
		int surNameSize = surName.length();
//System.out.println(surNameSize);  
		int size = str.length;
		System.out.println(size);
		for (int j = 0; j < size; j++) {
			int length = str[j].length();
			// System.out.println(length);
			// extracting the surname
			String subStr = str[j].substring(length - surNameSize);
			System.out.println(subStr);
			// checks whether the surname is equal to "Singh" or not
			if (subStr.equals(surName)) {
				System.out.println(str[j]);
			}
		}

	}
}

/*
 * import java.util.*;
 * 
 * public class Strings { // main method public static void main(String argvs[])
 * { String str = " Welcome To JavaTpoint "; System.out.println(str); int
 * sizeWithWhiteSpaces = str.length(); System.out.println(sizeWithWhiteSpaces);
 * 
 * System.out.println("In the string: " + "'" + str + "'");
 * 
 * str = str.replace(" ", ""); System.out.println(str); int
 * sizeWithoutWhiteSpaces = str.length();
 * System.out.println(sizeWithoutWhiteSpaces); // calculating the white spaces
 * int noOfWhieSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;
 * 
 * System.out.print("Total number of whitespaces present are: " +
 * noOfWhieSpaces); } }
 * 
 * 
 * public class Strings { // main method public static void main(String argvs[])
 * { Scanner sc=new Scanner(System.in); System.out.println("Enter the number:");
 * String s=sc.next(); System.out.println("enter the number:"); int
 * a=sc.nextInt();int count;int n; while(true) { n=Integer.valueOf(s);count=0;
 * while(n!=0) { int n1=n%10; if(n1==a) { n=n-1; count++; } n=n/10; }
 * if(count==0) { break; } System.out.println(n); } System.out.println(n); } }
 */