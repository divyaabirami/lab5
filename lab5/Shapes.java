package lab5;

import java.util.Scanner;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   circle obj1=new circle();
   obj1.area();
   obj1.circumference();
   square obj2=new square();
   obj2.area();
   obj2.diamem();
   sphere obj3=new sphere();
   obj3.volume();
   obj3.sarea();
	}

}
class shape
{
	double rad1,rad2,len,p=4/3;
	Scanner obj=new Scanner (System.in);
	shape(double r1,double l,double r2)
	{
		rad1=r1;
		len=l;
        rad2=r2;
		
	}
	shape()
	{
		
	}
	
}
class circle extends shape
{
	void area()
	{
        double area;
		System.out.println("radius ");
		rad1=obj.nextDouble();
		 area=Math.PI*rad1*rad1;
		 System.out.println("area"+area);
	}
	void circumference()
	{
		double cir;
		cir=Math.PI*rad1*2;
		 System.out.println("circumference"+cir);
	}
}
class square extends shape
{
	void area()
	{
		 double area1;
		System.out.println("side ");
		len=obj.nextDouble();
		area1=len*len;
		System.out.println("area"+area1);
	}
	void diamem()
	{
		double diagonal;
		diagonal=Math.sqrt(2)*len;
		System.out.println("diagonal"+diagonal);
	}
}
class sphere extends shape
{
	void volume()
	{
		    double vol;
			System.out.println("radius ");
			rad2=obj.nextDouble();
			 vol=Math.PI*rad2*rad2*rad2;
			 System.out.println("volume"+vol);
	}
	void sarea()
	{
		double surface;
		surface=Math.PI*rad2*rad2*2;
		 System.out.println("surfacearea"+surface);
	}
}