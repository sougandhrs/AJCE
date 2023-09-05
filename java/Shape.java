import java.util.*;
class AreaOfShape{
	void area(int a)
	{
		System.out.println("Area of Squre"+a*a);
	}
	void area(int a,int b)
	{
		System.out.println("Area of Rectangle"+a*b);
	}
	void area(int length,int bridth,int height)
	{
		System.out.println("Area of Cuboid"+(2*(length*bridth)+2*(length*height)+2*(height*bridth)));
	}
	}
public class Shape{
	public static void main(String[] args)
	{
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		AreaOfShape obj = new AreaOfShape();
		System.out.println("Enter the side of the Square:");
		x = sc.nextInt();
		obj.area(x);
		System.out.println("Enter the length and breath of rectangle:");
		x = sc.nextInt();
		y = sc.nextInt();
		obj.area(x,y);
		System.out.println("Enter the length and breath and height of cuboid:");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		obj.area(x,y,z);
	}
}