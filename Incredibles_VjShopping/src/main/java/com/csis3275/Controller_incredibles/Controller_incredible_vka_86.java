package com.csis3275.Controller_incredibles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.csis3275.model_incredibles.Home_vka_86;
import com.csis3275.model_incredibles.womenClothes;

@Controller
//@RequestMapping("/profile")
public class Controller_incredible_vka_86 {


	@RequestMapping("/home")
	public String home(ModelMap model) {
		Home_vka_86 home = new Home_vka_86();
		model.addAttribute("home", home);
		return "home_vka_86";
	}
	
	@RequestMapping(value = "/womenClothes")
	public String womenClothes(ModelMap model) {
		womenClothes womenclothes=new womenClothes();
		//register CustRegister=new register();
		model.addAttribute("WomenClothes",womenclothes);
		return "WomenClothes";
	}
 

}
