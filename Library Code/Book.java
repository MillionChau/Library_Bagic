package Ex3;

public class Book extends Item {
	private String author;
	private int publishYear;
	
	Book(String itemName, String itemCode, int qualityOfStock, String author,int publishYear){
		super(itemName,itemCode,qualityOfStock);
		this.author = author;
		this.publishYear = publishYear;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Author: " + author);
		System.out.println("Publish year: " + publishYear);
	}
}
