package com.basic.inventory;

public class Item {
	private String name;
	private int price, quantity;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}

	public Item(String name, int quantity, int price) {
	
		this.price = price;
		this.quantity = quantity;
		this.name = name;
	}
	

}
