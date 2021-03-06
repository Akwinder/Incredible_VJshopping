package com.csis3275.Controller_incredibles;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.csis3275.DAO_incredibles.incredible_DOA_gra_84;

import com.csis3275.model_incredibles.UserRegister;
import com.csis3275.model_incredibles.userLogin;

@Controller
public class Controller_incredible_gra_84 {
	@Autowired
	incredible_DOA_gra_84 adminDaoImpl;
	
	@ModelAttribute("users")
	public UserRegister setupAddForm() {
		return new UserRegister();
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

	@PostMapping("/userlogin")
	  public String submit(@ModelAttribute("user") userLogin user, Model model) {
		
				 
           
        if (user != null && user.getUserName() != null && user.getPassword() != null) {
        	
        	
        	boolean hello = adminDaoImpl.authenticateUser(user.getUserName(),user.getPassword());
        	
        if(hello == true )
         {
        	model.addAttribute("msg", user.getUserName());
        	return "homeLoggedIn_vka_86";
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
       	 return "Userlogin_gra_84";
        }

 }

}