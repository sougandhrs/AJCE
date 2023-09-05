import java.util.*;
class Publisher {
	Scanner sc = new Scanner(System.in);
	String publisher;
	Publisher() {
		System.out.print("\nEnter the Publisher name: ");
		publisher = sc.next();
	}
}
class Book extends Publisher {
	String title;
	Book() {
		System.out.print("Enter the Title: ");
		title = sc.next();
	}
}
class Literature extends Book {
	String category;
	Literature() {
		System.out.print("Enter the category: ");
		category = sc.next();
	}
}
class Fiction extends Book {
	String category;
	Fiction() {
		System.out.print("Enter the category: ");
		category = sc.next();
	}
}
public class books {
	public static void main(String[] args) {
		System.out.print("\nEnter the Details of Literature Book : ");
		Literature l = new Literature();
		System.out.print("\nEnter the Details of Fiction Book : ");
		Fiction f = new Fiction();
		System.out.println("\nPrinting Details of the book 1");
		System.out.println("Publisher: " + l.publisher);
		System.out.println("Title: " + l.title);
		System.out.println("Category: " + l.category);
		System.out.println("\nPrinting Details of the book 2");
		System.out.println("Publisher: " + f.publisher);
		System.out.println("Title: " + f.title);
		System.out.println("Category: " + f.category);
	}
}