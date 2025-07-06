package java_fundamentasArrays;
import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		if(n==4) {
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int twoD[][]= new int[2][2];
		int k=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				twoD[i][j]=a[k];
				k++;
				
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(twoD[i][j]+" ");
			}
		
		System.out.println();
		}
		for(int i = 1; i >= 0; i--) {
            for(int j = 1; j >= 0; j--) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
		}
		else {
			System.out.println("Please enter 4 integers");
		}

	}

}
