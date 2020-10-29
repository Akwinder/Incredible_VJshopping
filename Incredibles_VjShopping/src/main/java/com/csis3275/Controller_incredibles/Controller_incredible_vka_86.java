package com.csis3275.Controller_incredibles;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csis3275.DAO_incredibles.incredibles_DAO_vka_86;
import com.csis3275.model_incredibles.Home_vka_86;
import com.csis3275.model_incredibles.ProductLine_vka_86;
import com.csis3275.model_incredibles.products_vka_86;
import com.csis3275.model_incredibles.womenClothes;

@Controller
public class Controller_incredible_vka_86 {

	@Autowired
	incredibles_DAO_vka_86 custDaoImpl;
	@ModelAttribute("custProblem")
	public Home_vka_86 setupAddForm() {
		return new Home_vka_86();
	}

	@RequestMapping("/home")
	public String home(ModelMap model) {
		Home_vka_86 home = new Home_vka_86();
		model.addAttribute("home", home);
		return "home_vka_86";
	}
	
	@RequestMapping(value = "/menClothes")
	public String menClothes(ModelMap model) {
		womenClothes womenclothes=new womenClothes();
		//register CustRegister=new register();
		model.addAttribute("WomenClothes",womenclothes);
		return "MenClothes_vka_86";
	}
	@RequestMapping(value = "/womenClothes")
	public String womenClothes(ModelMap model) {
		womenClothes womenclothes=new womenClothes();
		//register CustRegister=new register();
		model.addAttribute("WomenClothes",womenclothes);
		return "WomenClothes_vka_86";
	}
	
	@RequestMapping(value = "/laptop")
	public String laptop(ModelMap model) {
		ProductLine_vka_86 laptop=new ProductLine_vka_86();
		//register CustRegister=new register();
		model.addAttribute("Laptops",laptop);
		return "Laptops_vka_86";
	}
	
	@RequestMapping(value = "/toys")
	public String toys(ModelMap model) {
		products_vka_86 toys=new products_vka_86();
		//register CustRegister=new register();
		model.addAttribute("Toys",toys);
		return "Toys_vka_86";
	}
	@GetMapping("/Problem")
	public String showcustQues(HttpSession session, Model model) {
		List<Home_vka_86> custProblem = custDaoImpl.getAllProblem();
		model.addAttribute("custProblem", custProblem);
	    return "CustProblem_vka_86";
	}
	

	@PostMapping("/Problem")
	public String createCustQues(@ModelAttribute("admins") Home_vka_86 newProblem, Model model)	{
		
		custDaoImpl.createQuaries(newProblem);
		List<Home_vka_86> custProblem = custDaoImpl.getAllProblem();
		model.addAttribute( "Dear " + newProblem.getName() + " , we will take take of your query");
		model.addAttribute("custProblem", custProblem);
		
		return "CustProblem_vka_86";
	}

}
