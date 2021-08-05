package com.kgitbank.practice;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kgitbank.model.Human;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/hello/")
public class HelloController {
	
	
	
	@RequestMapping(
			value = {"minsu", "/민수"},
			method = {
					  RequestMethod.GET,
					  RequestMethod.POST,
					  RequestMethod.DELETE
			}
	)
	public String minsu() {
		log.info("minsu controller에 도착");
		
		return "/hello/minsu";
	}
	

//	받는것은 무조건 스트링이지만 자동 형변환까지 해준다
// @RequestParam("이름") 타입 변수명을 하게되면 변수명과 이름이 달라도 그값을 받을수 있다
	@GetMapping("chulsu")
	public void getchulsu(Human human,
						 @RequestParam("number") int myNumber,
						 @RequestParam("taste") ArrayList<String> taste) {
		log.info("chulsu controller에 도착");
		log.info("name: " + human.getName());
		log.info("age: " + human.getName());
		log.info("myNumber: " + myNumber);
		log.info(taste);
	}
	
	@PostMapping("chulsu")
	public void postChulsu() {
		log.info("post chulsu");
	}
	
	@GetMapping("choosinsu")
	public String choo(Model model, 
						@ModelAttribute("age") int age, 
						@ModelAttribute("name") String name) {
		
		// 파라미터에 실려온 값이 매개변수에 들어있고, 모델에도 자동으로 실려있다.
		System.out.println("age:" + age);
		System.out.println("name:" + name);
		
	
		model.addAttribute("attr1", "ABC"); 
		model.addAttribute("ABCDEFG");// ${String}
		
		return "/hello/attrTest";
	}
	
	@GetMapping("park")
	public void park(Human human) {
		
	}
	
	@GetMapping("/kim")
	public String kim() {
		//앞에 redirect:을 붙이면 뷰를 찾지 않고 리다이렉트를 응답한다.
		return "redirect:/hello/park?name=Kim&age=321";
	}
	
	@RequestMapping("/model1")
	public ModelAndView modelAndView() {
		org.springframework.web.servlet.ModelAndView mnv = new ModelAndView();
		
		//addObject로 어트리 뷰트도 싣고ㅋ
		mnv.addObject("a", 10);
		mnv.addObject("b", "String");
		mnv.addObject("Integer");
		
		//setViewName으로 다음으로 포워드 할 페이지까지 선택할 수 있는 만능 객체!
		mnv.setViewName("/hello/mnv");
		return mnv;
	}
	
}
