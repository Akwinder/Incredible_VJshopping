package com.csis3275.model_incredibles;

import java.util.ArrayList;
import java.util.List;

public class MenProductModel {
	private List<Product_gra_84> products;
	public MenProductModel() {
	this.products = new ArrayList<Product_gra_84>();
	this.products.add(new Product_gra_84("M01", "Traditional Dress", "dressWomen.jpg", 120));
	this.products.add(new Product_gra_84("M02", "Women Denim", "womenDenim.jpg", 90));
	this.products.add(new Product_gra_84("M03", "Women Shorts 3", "womenShort.jpg", 28));
	this.products.add(new Product_gra_84("M04","Women Skinny Jeans","skinnyJeans.jpg",98));
	}
}
