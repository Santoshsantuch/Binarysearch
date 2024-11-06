import java.util.Scanner;

class LCM
{
	
	static int lcm(int n1,int n2,int m)
	{
		m=m+n2;
		if((m%n1==0)&&(m%n2==0))
			return m;
		else
			return lcm(n1,n2,m);
	}

	public static void main(String args[])
	{
		int n1,n2,m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 :");
		n1=sc.nextInt();
		System.out.println("Enter num1 :");
		n2=sc.nextInt();
		int res=lcm(n1,n2,m);
		System.out.printf("L.C.M of %d and %d is %d ",n1,n2,res);
		int hcf=(n1*n2)/res;
		System.out.println(hcf);

	}
}