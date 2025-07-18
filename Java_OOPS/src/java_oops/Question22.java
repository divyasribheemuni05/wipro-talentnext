package java_oops;
import java.util.*;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = null;
        String result = Optional.ofNullable(address).orElse("India");

        System.out.println("Address: " + result);
	}

}
