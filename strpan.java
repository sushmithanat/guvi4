/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strpan
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ch=sc.next();
		int n=str.length();
		String st1="";
		String st2="";
		int i=0,cnt=0;
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)=='|')
			break;
			else
			{
				st1 += str.charAt(i);
			}
		}
		if(i!=n)
		{
		i++;
		for(int j=i;j<n;j++)
		{
			st2 += str.charAt(j);	
		}
		}
		if(st1.length()==st2.length())
		{
			cnt=1;
		}
		else
		{
			if(st1.length()>st2.length())
			{
				st2 += ch;
			}
			else 
			{
				st1 += ch;
			}
			if(st1.length()==st2.length())
			cnt=0;
		}
		String st=st1+"|"+st2;
		if(cnt==0 && st1.length()==st2.length())
		System.out.print(st);
		else
		System.out.print("Impossible");
	}
}
