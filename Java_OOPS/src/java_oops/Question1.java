package java_oops;
import java.util.*;
class Box{
	double width;
	double height;
	double depth;
}
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Box bo=new Box();
		System.out.println("Width: ");
		bo.width=s.nextDouble();
		System.out.println("Height: ");
		bo.height=s.nextDouble();
		System.out.println("Depth: ");
		bo.depth=s.nextDouble();
		double volume=bo.width*bo.height*bo.depth;
		System.out.println("Volume of the Box: "+volume);

	}

}
