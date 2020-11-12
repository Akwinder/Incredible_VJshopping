package com.csis3275.model_incredibles;
import java.util.ArrayList;
import java.util.List;

public class ProductModel_gra_84 {




		private List<Product_gra_84> products;

		public ProductModel_gra_84() {
			this.products = new ArrayList<Product_gra_84>();
			this.products.add(new Product_gra_84("p01", "Traditional Dress", "dressWomen.jpg", 120));
			this.products.add(new Product_gra_84("p02", "Women Denim", "womenDenim.jpg", 90));
			this.products.add(new Product_gra_84("p03", "Women Shorts 3", "womenShort.jpg", 28));
			this.products.add(new Product_gra_84("w03","Women Skinny Jeans","skinnyJeans.jpg",98));
		}

		public List<Product_gra_84> findAll() {
			return this.products;
		}

		public Product_gra_84 find(String id) {
			for (Product_gra_84 product : this.products) {
				if (product.getId().equalsIgnoreCase(id)) {
					return product;
				}
			}
			return null;
		}

	

}
