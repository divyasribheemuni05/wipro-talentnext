package java_fundamentals;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		char b=s.next().charAt(0);
		if(a<b) {
			System.out.println(a+" "+b);
			
		}
		else {
			System.out.println(b+" "+a);
		}
	}

}
