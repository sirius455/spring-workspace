package com.kgitbank.dbpractice;



import java.security.KeyStore.Entry.Attribute;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgitbank.mapper.FoodsMapper;
import com.kgitbank.model.Employee;
import com.kgitbank.model.Foods;
import com.kgitbank.service.FoodService;

import lombok.extern.log4j.Log4j;


@Log4j
@Controller
@RequestMapping("/food/")
public class FoodsController {
	
	@Autowired
	private FoodService food_service;
	
	@GetMapping("CRUD")
	public void foods() {
		System.out.println("왔다");
	}
	
	@GetMapping("plus")
	public void getPlus() {
		System.out.println("왔다");
	}
	
	@PostMapping("plus")
	public String postPlus(Foods food) {
		
		//원래 새로운 메뉴를 추가할 때 해야할 작업들을 처리해야 한다.
		// ex) 동일한 이름의 메뉴가있는지 체크, 메뉴 이름이 형식에 맞는지 체크, 값은 제대로 왔는지 체크
//		System.out.println("동일한 이름의 메뉴가 있는지 체크하는 코드입니다. 50줄");
//		System.out.println("메뉴 이름 형식 체크. 150줄");
//		System.out.println("널값 체크. 30줄");
//		foodsMapper.foodsInsert(food);
//		
		//여기서는 view로 데이터를 어트리뷰트에 싣는 작업만 하는 것이 바람직히다.
		food_service.addFood(food);
		return "food/CRUD";
	}
	
	@GetMapping("search")
	public void getSerach(Model model) {
//		
//		List<Foods> foods = foodsMapper.getFoodsList();
//		model.addAttribute("foods", foods);
//		log.info(foods);
	}
	
}
