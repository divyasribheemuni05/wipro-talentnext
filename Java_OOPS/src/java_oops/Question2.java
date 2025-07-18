package java_oops;
import java.util.*;
class calculator{
	
	public static int powerInt(int  num1,  int num2) {
		return(int) Math.pow(num1,  num2);
		
	}
	public static double powerInt(double num1, double  num2) { 
	return Math.pow(num1,  num2);
		
	}
	
}
public class Question2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num3= sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num4=sc.nextInt();
		int res1=calculator.powerInt(num3, num4);
		System.out.println(res1);
		System.out.println("Enter first double number: ");
		double num5=sc.nextDouble();
		System.out.println("Enter the second double number: ");
		double num6=sc.nextDouble();
		double res2 =calculator.powerInt(num5, num6);
		System.out.println(res2);
		
		

	}

}
