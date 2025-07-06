package java_fundamentasArrays;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int[] n=new int[a];
		for(int i=0;i<a;i++) {
			n[i]=s.nextInt();
		}
		int max=n[0];
		int min=n[0];
		for(int i=1;i<a;i++) {
			if(n[i]<min) {
				min=n[i];
			}
			if(n[i]>max) {
				max=n[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("MIn: "+min);
	}

}
