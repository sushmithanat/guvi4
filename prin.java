/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=n-1;i>=0;i--)
		{
			if(i==0)
			System.out.print(a[i]);
			else
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
	}
}
