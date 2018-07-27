import java.util.Scanner;
class array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		if(k>=n)
			System.out.println();
		else
		{
		for(int i=0;i<k;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
		}
	}
}
