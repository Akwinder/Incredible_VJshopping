package com.csis3275.model_incredibles;

public class ProductLine_vka_86 {

	private products_vka_86 product;
	private int quantity;

	public products_vka_86 getProduct() {
		return product;
	}

	public void setProduct(products_vka_86 product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ProductLine_vka_86() {
	}

	public ProductLine_vka_86(products_vka_86 product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

}
