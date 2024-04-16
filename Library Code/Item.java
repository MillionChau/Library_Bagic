package Ex3;

public class Item {
	private String itemCode;
	private String itemName;
	private int qualityInStock;
	
	Item(String itemCode, String itemName, int qualityInStock){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.qualityInStock = qualityInStock;
	}
	public String getItemCode() {
		return this.itemCode;
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public int getQualityInStock() {
		return this.qualityInStock;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void setQualityInStock(int qualityInStock) {
		this.qualityInStock = qualityInStock;
	}
	
	public void displayInfo() {
		System.out.println("Code: " + itemCode);
		System.out.println("Name: " + itemName);
		System.out.println("Quality in stock: " + qualityInStock);
	}

}
