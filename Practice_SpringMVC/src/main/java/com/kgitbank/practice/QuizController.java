package com.kgitbank.practice;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgitbank.model.User_Info;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/user/")
@Controller
public class QuizController {

	@Autowired
	ServletContext application;
	
	@GetMapping("join")
	public void join() {
		
	}

	@PostMapping("data/user")
	public String user_info(User_Info user_info) {
		
		if(
				user_info.getName().equals("") || user_info.getAge() == ""||
				user_info.getGender() == "" || user_info.getEmail()== "" 
				) {
			System.out.println("실패했다");
			return "user/faild";
			
		} else {
			// 웹 경로
			// 프로젝트 내부경로
			// 실제 파일 경로 <-
			File dir = new File(application.getRealPath("/WEB-INF/") + "data\\user\\" +  user_info.getEmail() + ".txt");
			
			if(dir.exists()) {
				dir = new File(application.getRealPath("/WEB-INF/") + "data\\user\\" +  user_info.getEmail() + user_info.getAge() + ".txt");
			} else {
				System.out.println("이미 존재하는 디렉토리입니다.");
			}
			
			try(
					FileOutputStream fin = new FileOutputStream(dir);
					OutputStreamWriter iin = new OutputStreamWriter(fin, "EUC-KR");

					BufferedWriter in = new BufferedWriter(iin);
			) {
				
				
				
				in.append(user_info.getName());
				in.append(user_info.getAge());
				in.append(user_info.getGender());
				in.append(user_info.getEmail());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "user/ok";
		}
	}
}
	

