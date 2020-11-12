package com.csis3275.Controller_incredibles;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csis3275.model_incredibles.ProductModel_gra_84;
import com.csis3275.model_incredibles.Item_vka_86;

@Controller
@RequestMapping(value = "cart")
public class CartController_vka_86 {
	

		@RequestMapping(value = "CartIndex_vka_86", method = RequestMethod.GET)
		public String index() {
			return "cart/CartIndex_vka_86";
		}

		@RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
		public String buy(@PathVariable("id") String id, HttpSession session) {
			ProductModel_gra_84 productModel = new ProductModel_gra_84();
			if (session.getAttribute("cart") == null) {
				List<Item_vka_86> cart = new ArrayList<Item_vka_86>();
				cart.add(new Item_vka_86(productModel.find(id), 1));
				session.setAttribute("cart", cart);
			} else {
				@SuppressWarnings("unchecked")
				List<Item_vka_86> cart = (List<Item_vka_86>) session.getAttribute("cart");
				int index = this.exists(id, cart);
				if (index == -1) {
					cart.add(new Item_vka_86(productModel.find(id), 1));
				} else {
					int quantity = cart.get(index).getQuantity() + 1;
					cart.get(index).setQuantity(quantity);
				}
				session.setAttribute("cart", cart);
			}
			return "redirect:/cart/CartIndex_vka_86";
		}

		@RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
		public String remove(@PathVariable("id") String id, HttpSession session) {
			ProductModel_gra_84 productModel = new ProductModel_gra_84();
			List<Item_vka_86> cart = (List<Item_vka_86>) session.getAttribute("cart");
			int index = this.exists(id, cart);
			cart.remove(index);
			session.setAttribute("cart", cart);
			return "redirect:/cart/CartIndex_vka_86";
		}

		private int exists(String id, List<Item_vka_86> cart) {
			for (int i = 0; i < cart.size(); i++) {
				if (cart.get(i).getProduct().getId().equalsIgnoreCase(id)) {
					return i;
				}
			}
			return -1;
		}

	
}
