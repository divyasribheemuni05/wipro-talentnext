package java_oops;
import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length();i++) {
			str+=s.substring(s.length()-3, s.length());
		}
		System.out.println(str);
	}

}
