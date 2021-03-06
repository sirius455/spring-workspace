package com.kgitbank.rest.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/cookie")
@Controller
public class CookieController {
	
	@GetMapping("/login")
	public String login(String id, String password, Model model, HttpServletResponse response) {
		if (id.equals("adcd") && password.equals("1234")) {
			
			Cookie cookie = new Cookie("login", "1");
			Cookie cookie2 = new Cookie("id", "abcd");
			
			cookie.setMaxAge(5);
			cookie.setHttpOnly(true);
			
			response.addCookie(cookie);
			response.addCookie(cookie2);
			model.addAttribute("login", true);
		} else {
			model.addAttribute("login", false);
			
			// 로그인 실패시 쿠키삭제하기
			Cookie cookie = new Cookie("id", "");
			cookie.setMaxAge(0);
		
			response.addCookie(cookie);
			//로그인 쿠키 값 수정하기
			response.addCookie(new Cookie("login", "0"));
			
			model.addAttribute("login", false);
		}
		
		return "/cookie/login";
	}
	
	@GetMapping("/read-all-cookies")
	public String readAllCookies(HttpServletRequest request) {
		// JSP의 쿠키는 우선 배열로 꺼낼 수 밖에 없다. 사용하기 불편하다.
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			
			for (Cookie cookie : cookies) {
				log.info("name: " + cookie.getName());
				log.info("value: " + cookie.getValue());
			}
			
		}
		
		return "/cookie/check";
	}
	
	@GetMapping("/check")
	public void check(
			@CookieValue(value = "id", defaultValue = "비회원") String id,
			@CookieValue(value = "login", defaultValue = "0") String login,
			Model model
	) {
		model.addAttribute("id", id);
		model.addAttribute("login", login);
	}
	
}
