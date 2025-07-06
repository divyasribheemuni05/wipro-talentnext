package java_fundamentasArrays;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int[] n=new int[a];
		int sum=0;
		for(int i=0;i<a;i++) {
			n[i]=s.nextInt();
			sum+=n[i];
		}
		double av=(double) sum/a;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+av);

	}

}
