import java.util.*;
class Calculator
{
	static int p=1;
	static double p1=1.0;
	public static int powerInt(int num1, int num2)
	{
		for(int i=1;i<=num2;i++)
		{
			p = p * num1;
		}
		return p;
	}
	public static double powerDouble(double num1, int num2)
	{
		for(int i=1;i<=num2;i++)
		{
			p1 = p1 * num1;
		}
		return p1;
	}
}

class E37
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter whether power should be calculated for double datatype or int datatype");
		String s1 = s.nextLine();
		Calculator c = new Calculator();
		if(s1.equals("double") || s1.equals("Double") || s1.equals("DOUBLE"))
		{
			System.out.println("Enter a double number and int number respectively");
			double n1 = s.nextDouble();
			int n2 = s.nextInt();
			double power;
			power = c.powerDouble(n1, n2);
			System.out.println("The power value is :"+power);
		}
		else 
		{
			System.out.println("Enter a int number and int number respectively");
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			int power;
			power = c.powerInt(n1, n2);
			System.out.println("The power value is :"+power);
		}
	}
}