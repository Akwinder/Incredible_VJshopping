package com.csis3275.Controller_incredibles;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csis3275.DAO_incredibles.incredible_DAO_aka_06;
import com.csis3275.model_incredibles.Login;
import com.csis3275.model_incredibles.Register;

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
	public String createNewAdmin(@ModelAttribute("admin") Register newAdmin, Model model)	{
		
		adminDaoImpl.createNewAdmin(newAdmin);
		List<Register> admin = adminDaoImpl.getAllAdmin();
		model.addAttribute("admin", admin);
		
		return "login";
	}
	
	@RequestMapping(value = "/login")
	public String login(ModelMap model) {
		Login Custlogin=new Login();
		model.addAttribute("login",Custlogin);
	
		
		
		return "home_vka_86";
	}
	
	
	
	
	

}
