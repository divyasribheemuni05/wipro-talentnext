package java_fundamentasArrays;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int sum=0;
		int i=0;
		while(i<n) {
			if(arr[i]==6) {
				while(i<n && arr[i]!=7) {
					i++;
				}
				i++;
			}else {
				sum+=arr[i];
				i++;
			}
		}
		System.out.println(sum);
	}

}
