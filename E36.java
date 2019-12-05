import java.util.*;
class Box
{
	double width, height, depth, volume;
	Box(double width, double height, double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public double calVolume()
	{
		volume = width * height * depth;
		return volume;
	}
}

class E36
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dimensions of box");
		double w = s.nextDouble();
		double h = s.nextDouble();
		double d = s.nextDouble();
		Box b = new Box(w, h, d);
		double v;
		v = b.calVolume();
		System.out.println("The Volume of Box is : "+v);
	}
}	