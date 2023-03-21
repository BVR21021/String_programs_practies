import java.util.Scanner;

import java.util.Scanner;

public  class Amstrong_Number{

	public static void main(String[] args) {
	int r,sum=0,temp,c=0,s,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	temp=n;
	while(n>0) {
		n=n/10;
		c++;
	}
	System.out.println(c);
	n=temp;
	while(n>0) {
		r=n%10;
		s=1;
		for(i=1;i<=c;i++) {
			s=s*r;
			
		}
		System.out.println(s);
		
		sum=sum+s;
		System.out.println(sum);
		n=n/10;
		}
	if(temp==sum) {
		System.out.println("Amstrong");
	}
	else 
		System.out.println("not Amstrong");
	
	}
}
/*
 class C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number:");
		int n = sc.nextInt();
		if (n >= 0) {
			if (n % 2 == 0) {
				int x = n / 2;// if number is even divide by 2 else odd multiply with 3 and 1
				System.out.println("even number:"+x);
			} else {
				int y = n * 3 + 1;
				System.out.println("odd number:"+y);
			}
		}
	}
}
*/