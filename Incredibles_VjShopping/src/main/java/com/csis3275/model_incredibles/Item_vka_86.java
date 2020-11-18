package com.csis3275.model_incredibles;

public class Item_vka_86 {
	private Product_gra_84 product;
	private int quantity;
	private float price;
	

	public Product_gra_84 getProduct() {
		return product;
	}

	public void setProduct(Product_gra_84 product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item_vka_86() {
	}

	public Item_vka_86(Product_gra_84 product, int quantity) {
		this.product = product;
		this.quantity = quantity;

	}

	public float getPrice() {
		
		return price;
	}

	public float setPrice(float price) {
		this.price = price;
		return price;
	}

	public float cartPrice() {
		this.price = (float) (product.getPrice() * this.getQuantity());
		return price;

	}

	

}
