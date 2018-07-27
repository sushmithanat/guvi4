import java.util.Scanner;
class large
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long l1=sc.nextLong();
		long l2=sc.nextLong();
		long l3=sc.nextLong();
		if(l1>l2)
		{
			if(l1>l3)
			{
				System.out.println(l1);
			}
		}
		else if(l2>l3)
		{
			System.out.println(l2);
		}
		else
		{
			System.out.println(l3);
		}
	}
}
