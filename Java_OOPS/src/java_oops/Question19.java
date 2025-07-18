package java_oops;
import java.util.*;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        for (String name : names) {
            joiner.add(name);
        }
        System.out.println(joiner.toString());
	}

}
