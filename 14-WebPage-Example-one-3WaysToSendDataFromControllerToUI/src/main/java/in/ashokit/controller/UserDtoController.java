package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ashokit.dto.UserDto;

@Controller

public class UserDtoController {
	
	@GetMapping("/")
	
	public String getFormData(Model model) {
		
		
		model.addAttribute("user", new UserDto());
		
		return "index";
	}
	
	
	
	
@GetMapping("/userSubmit")	
@ResponseBody
public String getData(UserDto user) {
		
		
		System.out.println(user);
		
		return "form submitted !!!";
	}
	

}
