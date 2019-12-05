import java.util.*;
class Patient
{
	String nameP;
	double wP, hP, bmi, s;
	Patient(String name, double weight, double height)
	{
		nameP = name;
		wP = weight;
		hP = height;
	}
	public double BMI()
	{
		s = hP * hP;
		bmi = wP/s;
		bmi = bmi * 703;
		return bmi;
	}
	public void display()
	{
		System.out.println("Patient Name : "+nameP);
		System.out.println("Patient Height : "+hP);
		System.out.println("Patient Weight : "+wP);
		System.out.println("Patient BMI : "+BMI());
	}
}

class E38
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Patient's Name : ");
		String name = s.nextLine();
		System.out.println("Enter Patient's height and weight respectively");
		double h = s.nextDouble();
		double w = s.nextDouble();
		Patient p = new Patient(name, h, w);
		p.display();
	}
}
				