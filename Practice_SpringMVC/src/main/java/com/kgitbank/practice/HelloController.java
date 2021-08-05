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
			value = {"minsu", "/�μ�"},
			method = {
					  RequestMethod.GET,
					  RequestMethod.POST,
					  RequestMethod.DELETE
			}
	)
	public String minsu() {
		log.info("minsu controller�� ����");
		
		return "/hello/minsu";
	}
	

//	�޴°��� ������ ��Ʈ�������� �ڵ� ����ȯ���� ���ش�
// @RequestParam("�̸�") Ÿ�� �������� �ϰԵǸ� ������� �̸��� �޶� �װ��� ������ �ִ�
	@GetMapping("chulsu")
	public void getchulsu(Human human,
						 @RequestParam("number") int myNumber,
						 @RequestParam("taste") ArrayList<String> taste) {
		log.info("chulsu controller�� ����");
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
		
		// �Ķ���Ϳ� �Ƿ��� ���� �Ű������� ����ְ�, �𵨿��� �ڵ����� �Ƿ��ִ�.
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
		//�տ� redirect:�� ���̸� �並 ã�� �ʰ� �����̷�Ʈ�� �����Ѵ�.
		return "redirect:/hello/park?name=Kim&age=321";
	}
	
	@RequestMapping("/model1")
	public ModelAndView modelAndView() {
		org.springframework.web.servlet.ModelAndView mnv = new ModelAndView();
		
		//addObject�� ��Ʈ�� ��Ʈ�� �ư�
		mnv.addObject("a", 10);
		mnv.addObject("b", "String");
		mnv.addObject("Integer");
		
		//setViewName���� �������� ������ �� ���������� ������ �� �ִ� ���� ��ü!
		mnv.setViewName("/hello/mnv");
		return mnv;
	}
	
}
