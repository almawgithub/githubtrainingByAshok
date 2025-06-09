package in.ashokit.dto;

import org.springframework.stereotype.Controller;

import lombok.Data;


@Data
public class UserDto {
	
	private String name;
	private String email;
	private Integer phNo;
	

}
