/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
 class Odd_Even
{
	public static void main (String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number you want to check:");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("the given number "+n+" is Even");
		}
		else
		{
			System.out.println("the given number "+n+" is Odd");
		}
	}
}
