package com.cg.hospitalmanagement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.hospitalmanagement.exception.UserNotFoundException;
import com.cg.hospitalmanagement.model.User;
import com.cg.hospitalmanagement.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	public UserController() {

		this.userService = null;
		System.out.println("Welcome to Index");
	}

	@GetMapping("/index")
	public String showIndexPage() {
		return "index";
	}

	@GetMapping("/signIn")
	public String showSignInPage() {
		System.out.println("index controller");
		return "signIn";
	}

	@PostMapping("/signIn")
	public String showHomePage(HttpServletRequest request, Model model) {

		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		model.addAttribute("user", user);
		System.out.println("Welcome User Validation Controller");
		try {
		return userService.validateUser(user, pass);
		}
		catch(UserNotFoundException ex) {
			model.addAttribute("error",ex.getMessage());
			return "signIn";
			
		}

	}

	@GetMapping("/signUp")
	public String showSignUpPage(Model model) {
		System.out.println("index controller");
		model.addAttribute("user", new User());
		return "signUp";
	}

	
	  @GetMapping("list") public String showUpdateForm(Model model) {
	  model.addAttribute("userlist", userService.getAlluser()); return "userlist";
	  }
	 
	  
	  @GetMapping("/user") public String listUser(Model model) {
	 model.addAttribute("user",userService.getAlluser()); return "user"; }
	  
	 
	  @PostMapping("add") public String addUser(@Validated User user, BindingResult
	  result, Model model) { if (result.hasErrors()) { return "signUp"; }
	  
	  userService.addUser(user); return "redirect:list"; }
	  
	 /* @GetMapping("/userhome")//userome// public String UserHomePage() {
	 * 
	 * return "userhome"; }
	 */

	@GetMapping("/showNewUserForm")
	public String showNewUserForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "new_user";
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		// save Doctor to database
		userService.addUser(user);
		return "redirect:/signUp";
	}

	@GetMapping("/showFormForUserUpdate/{id}")
	public String showFormForUserUpdate(@PathVariable(value = "id") long id, Model model) {
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "update_user";

	}

	// Url mapping for delete user based on Id
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable(value = "id") long id) {
		this.userService.deleteUserById(id);
		return "redirect:/userlist";

	}

}
