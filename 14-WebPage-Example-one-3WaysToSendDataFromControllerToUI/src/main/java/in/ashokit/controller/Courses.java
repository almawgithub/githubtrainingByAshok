package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Courses {
	
	
	// If we are not using ui pages for rendering dta to the the user request then we use
	// @ResponseBody annotation
	
	@GetMapping("/courses")
	@ResponseBody
	public String getMsg() {
		
		String msg=" This is Dev Op Training .........";
		
		return msg;
	}

}
