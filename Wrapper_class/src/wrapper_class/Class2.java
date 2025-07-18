package wrapper_class;
import java.util.*;
public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		System.out.println("Given Number: "+number);
		System.out.println("Binary Equivalent: "+Integer.toBinaryString(number));
		System.out.println("Octal Equivalent: "+Integer.toOctalString(number));
		System.out.println("Hexadecimal Equivalent: "+Integer.toHexString(number));
	}

}
