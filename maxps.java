/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class maxps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		b[i]=a[i];
		Arrays.sort(b);
		int sum=0,j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==b[n-1])
			{
			sum =a[i];
			j=i-1;
			break;
			}
		}
		sum += a[j];
		System.out.print(sum);
		
	}
}
