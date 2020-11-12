package com.csis3275.Controller_incredibles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csis3275.model_incredibles.ProductModel_gra_84;

@Controller
@RequestMapping(value = "product")
public class ProductController_gra_84 {
	
	
		@RequestMapping(method = RequestMethod.GET)
		public String index(ModelMap modelMap) {
			ProductModel_gra_84 productModel = new ProductModel_gra_84();
			modelMap.put("products", productModel.findAll());
			return "product/product";
		}

	

}
