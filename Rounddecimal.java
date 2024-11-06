import java.text.DecimalFormat;

class Rounddecimal
{
public static void main(String args[])
{
	double num=12345.67859;
	System.out.println("num is : "+num);
	DecimalFormat df=new DecimalFormat("0.00");
	System.out.println("num is :"+df.format(num));
	System.out.println("num is :"+String.format("%.2f",num));
}
}
	