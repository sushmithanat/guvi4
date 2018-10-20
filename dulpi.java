/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class dulpi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		char[] ch=str.toCharArray();
		for(char c:ch)
		{
			if(str1.indexOf(c)==-1)
			{
				str1 += c;
			}
		}
		System.out.print(str1);
	}
}
