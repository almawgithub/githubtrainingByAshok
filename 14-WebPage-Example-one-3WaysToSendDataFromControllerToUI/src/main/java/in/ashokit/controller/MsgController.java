package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MsgController {
	
	@GetMapping("/greet")
	public ModelAndView getGreet() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg","Good Morning ......");
		mav.setViewName("index");
		return mav;
	}
	
	
	@GetMapping("/welcome")
	public ModelAndView getWelcome() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg","Welcome to Abathun ......");
		mav.setViewName("index");
		return mav;
	}

}
