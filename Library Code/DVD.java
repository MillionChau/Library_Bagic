package Ex3;

public class DVD extends Item {
	private String director;
	private String duration;
	
	DVD(String itemName, String itemCode, int qualityOfStock, String director, String duration){
		super(itemName,itemCode,qualityOfStock);
		this.director = director;
		this.duration = duration;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Director: " + director);
		System.out.println("Duration: " + duration);
	}
}
