package session;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Integer");
		int a=sc.nextInt();
		System.out.println("Enter the Second Integer");
		int b=sc.nextInt();
		a=(a>0)?a:-a;
		b=(b>0)?b:-b;
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
				
			}
			else
			{
				b=b-a;
			}
		}
		System.out.println("The GCD of these two integers is: "+a);
	}

}
