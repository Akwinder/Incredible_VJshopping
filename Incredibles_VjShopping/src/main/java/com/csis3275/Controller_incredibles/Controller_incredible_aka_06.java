package com.csis3275.Controller_incredibles;

import java.io.IOException;
import java.util.List;


import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.csis3275.DAO_incredibles.incredible_DAO_aka_06;

import com.csis3275.model_incredibles.Register;
import com.csis3275.model_incredibles.UserRegister;

@Controller
public class Controller_incredible_aka_06 {
	
	@Autowired
	incredible_DAO_aka_06 adminDaoImpl;
	
	@ModelAttribute("admins")
	public Register setupAddForm() {
		return new Register();
	}
	
	@GetMapping("/registration")
	public String showadmins(HttpSession session, Model model) {
		List<Register> admin = adminDaoImpl.getAllAdmin();
		model.addAttribute("admin", admin);
	    return "Registration_aka_06";
	}
	

	@PostMapping("/registration")
	public String createNewAdmin(@ModelAttribute("admins") Register newAdmin, Model model)	{
		
		adminDaoImpl.createNewAdmin(newAdmin);
		List<Register> admin = adminDaoImpl.getAllAdmin();
		model.addAttribute("admin", admin);
		
		return "redirect:/login";
	}
	@GetMapping("/login")
	  public String init(Model model) {
	    model.addAttribute("msg", "Please Enter Your Login Details");
	    return "login";
	  }
	

	
	@GetMapping("/adminlogin")
	  public String init1(Model model) {
	    model.addAttribute("msg", "Please Enter Login Details");
	    return "adminlogin_aka_06";
	  }

	@PostMapping("/adminlogin")
	  public String submit(@ModelAttribute("admins") Register userlogin, Model model) {
		
		 		 
         
      if (userlogin != null && userlogin.getEmail() != null && userlogin.getPassword() != null) {
      	
      	
      	boolean hello = adminDaoImpl.authenticateAdmin(userlogin.getEmail(),userlogin.getPassword());
      	
      if(hello == true )
       {
      	model.addAttribute("msg", userlogin.getEmail());
      	return "home_vka_86";
       }
       else
       {
      	 model.addAttribute( "Invalid Details or user name is taken");
      	 return "adminlogin_aka_06";
       }
      	 
      }
      else
      {
     	 model.addAttribute( "Please enter Details");
     	 return "home_vka_86";
      }

    }
	

 }
	
	
	
	


