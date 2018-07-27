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
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number you want to check:");
		num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
