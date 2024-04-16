package Ex3;

import java.util.ArrayList;

public class Library {
	 private ArrayList<Item> items;

	    public Library() {
	        this.items = new ArrayList<>();
	    }

	    public void addItem(Item item) {
	        items.add(item);
	    }

	    public void removeItem(String itemCode) {
	        for (int i = 0; i < items.size(); i++) {
	            if (items.get(i).getItemCode().equals(itemCode)) {
	                items.remove(i);
	                return;
	            }
	        }
	        System.out.println("Item with code " + itemCode + " not found.");
	    }

	    public void displayItems() {
	        System.out.println("Items in Library:");
	        for (Item item : items) {
	            item.displayInfo();
	            System.out.println();
	        }
	    }
}
