// Josiah B. Quiñones
// BSIT - 2B
// October 21, 2026

public class Main{
	public static void main(String[] args) {
		Book book1 = new Book("Noli Me Tangere", "Jose Rizal", "ISBN-001", 350);
		Book book2 = new Book("El Filibusterismo", "Jose Rizal", "ISBN-002", 320);

		EBook book3 = new EBook("Florante at Laura", "Francisco Balagtas", "ISBN-003", 150, "PDF");

		System.out.println("\n===== BOOK INFORMATION =====");
		book1.displayInfo();
		book2.displayInfo();

		System.out.println("\n===== E-BOOK =====");
		book3.displayInfo();

		System.out.println("\n===== UPDATE INFORMATION =====");
		book2.setPrice(299.5);

		book2.displayInfo();
	}
}


// 1. Why is it better to change the price through setPrice() instead of making price public?
// - It is better to use setPrice() because it can validate the price and prevent negative values. If price were public, 
// anyone could change it directly, even to a negative value.

// 2. Which members does EBook inherit from Book, and which does it add on its own?
// - EBook inherits the title, author, isbn, and price attributes, along with the methods from Book. It adds its own fileFormat 
// attribute and a method to display the file format.

// 3. If the library later adds an AudioBook class, how would inheritance make that easier?
// - Inheritance allows AudioBook to extend Book and reuse its existing attributes and methods. It only needs to add its own 
// features, such as audio duration and narrator, instead of writing the same code again.