package com.csis3275.model_incredibles;

import java.util.ArrayList;
import java.util.List;

public class WomenProducts_vka_86 {
	private List<products_vka_86> products;

	public WomenProducts_vka_86() {
		this.products = new ArrayList<products_vka_86>();
		this.products.add(new products_vka_86("w1", "Skiiny jeans", "skinnyJeans.jpg", 250));
		this.products.add(new products_vka_86("w2", "Women Denim", "womenDenim.jpg", 231));
		this.products.add(new products_vka_86("w3", "Women Shorts", "womenShort.jpg", 72));
	}

	public List<products_vka_86> findAll() {
		return this.products;
	}

	public products_vka_86 find(String id) {
		for (products_vka_86 product : this.products) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}

}