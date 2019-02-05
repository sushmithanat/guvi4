/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class squarept
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		int a=Math.abs(x2-x1);
		int b=Math.abs(y2-y1);
		a *= a;
		b *= b;
		long ab= (long)Math.sqrt((a+b));
		
		int c=Math.abs(x3-x2);
		int d=Math.abs(y3-y2);
		c *= c;
		d *= d;
		long bc= (long)Math.sqrt((c+d));
		
		int e=Math.abs(x3-x4);
		int f=Math.abs(y3-y4);
		e *= e;
		f *= f;
		long cd= (long)Math.sqrt((e+f));
		
		int g=Math.abs(x4-x1);
		int h=Math.abs(y4-y1);
		g *= g;
		h *= h;
		long da= (long)Math.sqrt((g+h));
		
		int i=Math.abs(x3-x1);
		int j=Math.abs(y3-y1);
		i *= i;
		j *= j;
		long ac= (long)Math.sqrt((i+j));
		
		int k=Math.abs(x4-x2);
		int l=Math.abs(y4-y2);
		k *= k;
		l *= l;
		long bd= (long)Math.sqrt((k+l));
		
		if(ab==bc && bc==cd && cd==da && da==ab && ac==bd)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
