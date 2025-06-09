package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public ModelAndView getUser() {
		
	ModelAndView mav= new ModelAndView();
	mav.addObject("msg", "User Name : John");
	mav.setViewName("index");
	return mav;
	
	}
	
	
	@GetMapping("/userModel")
	public String getUserModel(Model model) {
		
	
	model.addAttribute("msg", "User Name : Abathun");
	
	return "index";
	
	}
}
