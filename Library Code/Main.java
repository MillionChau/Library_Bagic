package Ex3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		int numberOfBook,numberOfDVD;
		System.out.print("Enter number of DVD: ");
		numberOfDVD = sc.nextInt();
		for(int i = 0; i < numberOfDVD; i++) {
			String name,code,director,duration;
			int qualityOfStock;
			System.out.print("Enter code of DVD: ");
			code = sc.next();
			sc.nextLine();
			System.out.print("Enter name of DVD: ");
			name = sc.nextLine();
			System.out.print("Enter quality of stock: ");
			qualityOfStock = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter director of DVD: ");
			director = sc.nextLine();
			System.out.print("Enter duration of DVD: ");
			duration = sc.next();
			DVD dvd = new DVD(code,name,qualityOfStock,director,duration);
			library.addItem(dvd);
			System.out.println();
		}
		System.out.print("Enter number of Book: ");
		numberOfBook = sc.nextInt();
		for(int i = 0; i < numberOfBook; i++) {
			String name,code,author;
			int qualityOfStock,publishYear;
			System.out.print("Enter code of book: ");
			code = sc.next();
			sc.nextLine();
			System.out.print("Enter name of book: ");
			name = sc.nextLine();
			System.out.print("Enter quality of stock: ");
			qualityOfStock = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Author of book: ");
			author = sc.nextLine();
			System.out.print("Enter publish year: ");
			publishYear = sc.nextInt();
			Book book = new Book(code,name,qualityOfStock,author,publishYear);
			library.addItem(book);
			System.out.println();
		}
		library.displayItems();
		String code;
		System.out.print("Enter code of item want to remote: ");
		code = sc.next();
		library.removeItem(code);
		library.displayItems();
	}
}
