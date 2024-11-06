import java.util.Scanner;

class Fibonacci
{
	static int fib(int n)
	{
		if(n<=1)
			return n;
    		else
			return fib(n-1)+fib(n-2);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of terms :");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(fib(i));
		}
	}
}