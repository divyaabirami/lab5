package lab5;

import java.util.Scanner;

public class bondconvertiblebond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  bond a1[]=new bond [6];
  convertiblebond a2[]=new convertiblebond[6];
  Scanner obj=new Scanner(System.in);
  int i;
  for(i=0;i<6;i++)
  {
	  System.out.println("number entering by user must be 1 or 2");
	  int n=obj.nextInt();
	  switch(n)
	  {
	  case 1:
	  {
		   a1[i]=new bond();
	       a1[i].display();
	       break;
	  }
     case 2:
     {
	   a2[i]=new convertiblebond();
      a2[i].display();
      break;
     }
     default:
     {
    	 System.out.println("number entered is not 1 (or) 2");
     }
  }
  }
	}
}
	
class bond
{
	public void display()
	{
		System.out.println("bond..");
	}
}
class convertiblebond
{
	public void display()
	{
		System.out.println("convertible bond..");
	}
}