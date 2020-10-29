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

import com.csis3275.DAO_incredibles.incredible_DOA_gra_84;
import com.csis3275.model_incredibles.Home_vka_86;
import com.csis3275.model_incredibles.Login;
import com.csis3275.model_incredibles.UserRegister;

@Controller
public class Controller_incredible_gra_84 {
	@Autowired
	incredible_DOA_gra_84 adminDaoImpl;
	
	@ModelAttribute("users")
	public UserRegister setupAddForm() {
		return new UserRegister();
	}
	

	@RequestMapping("/login")
	public String home(ModelMap model) {
		Login login = new Login();
		model.addAttribute("userLog", login);
		return "login";
	}

	@GetMapping("/userregistration")
	public String showadmins(HttpSession session, Model model) {
		List<UserRegister> user = adminDaoImpl.getAllAdmin();
		model.addAttribute("user", user);
	    return "RegistrationUser_gra_84";
	}
	

	@PostMapping("/userregistration")
	public String createNewAdmin(@ModelAttribute("users") UserRegister newAdmin, Model model)	{
		
		adminDaoImpl.createNewAdmin(newAdmin);
		List<UserRegister> user = adminDaoImpl.getAllAdmin();
		model.addAttribute("user", user);
		
		return "redirect:/login";
	}
	@GetMapping("/userlogin")
	  public String init(Model model) {
	    model.addAttribute("msg", "Please Enter Your Login Details");
	    return "Userlogin_gra_84";
	  }

	@RequestMapping("/login")
	public String home(ModelMap model) {
		Login login = new Login();
		model.addAttribute("userLog", login);
		return "login";
	}

	@PostMapping("/userlogin")
	  public String submit(@ModelAttribute("users") UserRegister userlogin, Model model) {
		
		 		 
           
        if (userlogin != null && userlogin.getEmail() != null && userlogin.getPassword() != null) {
        	
        	
        	boolean hello = adminDaoImpl.authenticateUser(userlogin.getEmail(),userlogin.getPassword());
        	
        if(hello == true )
         {
        	model.addAttribute("msg", userlogin.getEmail());

        	return "home_vka_86"
       

         }
         else
         {
        	 model.addAttribute("error", "Invalid Details or user name is taken");
        	 return "Userlogin_gra_84";
         }
        	 
        }
        else
        {
       	 model.addAttribute("error", "Please enter Details");
       	 return "home_vka_86";
        }

 }

}
