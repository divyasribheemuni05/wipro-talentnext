package exceptional_handling;
import java.util.*;
public class handling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        final int expectedCount = 5;
        int[] numbers = new int[expectedCount];
        int sum = 0;
        try {
            System.out.println("Enter " + expectedCount + " integers:");
            for (int i = 0; i < expectedCount; i++) {
                String input = scanner.nextLine();
                numbers[i] = Integer.parseInt(input); 
                sum += numbers[i];
            }
            double average = sum / (double) expectedCount;
            System.out.println("Sum     : " + sum);
            System.out.println("Average : " + average);
        } catch (NumberFormatException nfe) {
            System.out.println("java.lang.NumberFormatException: Please enter only valid integers.");
        } catch (ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: " + ae.getMessage());
        } finally {
            scanner.close();
        }
	}

}
