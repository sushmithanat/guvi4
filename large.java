import java.util.Scanner;
class large
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long year=sc.nextLong();
		if(year%4==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
