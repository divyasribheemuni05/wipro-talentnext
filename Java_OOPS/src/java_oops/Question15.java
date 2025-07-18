package java_oops;
import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i+1)=='*') {
				i=i+2;
			}
			else {
				str+=s.charAt(i);
			}
		}
		System.out.println(str);
	}

}
