package com.kgitbank.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User_Info {
	
	private String id;
	private String passward;
	private String name;
	private String age;
//	날짜타입 바인딩
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday;
	private String email;
	private String gender;
	
}
