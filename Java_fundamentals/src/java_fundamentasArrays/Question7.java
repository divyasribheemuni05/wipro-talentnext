package java_fundamentasArrays;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.println(arr[i]+" ");
			}
		}
		
	}

}
