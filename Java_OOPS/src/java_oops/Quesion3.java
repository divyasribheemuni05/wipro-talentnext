package java_oops;
import java.util.*;
class Author{
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() { 
		return email;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return "Author Name: " +name+ "Author Email: "+email+ " Gender" +gender;
	}
}

class Book{
	String name;
	Author author;
	double price;
	int quantity;
	public Book(String name, Author author,double price, int quantity) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String toString() {
		return "BookName: " +name+ "\n" +"Price: "+price+ "\n"+ "Quantity: " +quantity+ author.toString();
	}

}	
	
	

public class Quesion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Author Name: ");
		String name=s.nextLine();
		System.out.println("Email: ");
		String email=s.nextLine();
		System.out.println("Gender: ");
		char gender=s.next().charAt(0);
		Author author=new Author(name, email,gender);
		s.nextLine();
		System.out.println("Enter Author: "+author);
		System.out.println("Book Name: ");
		String bname=s.nextLine();
		System.out.println("Price: ");
		double price=s.nextDouble();
		System.out.println("Quantity ");
		int quantity=s.nextInt();
		Book book=new Book(name,author, price, quantity);
		System.out.println("Enter Book: "+book);
	}

}
