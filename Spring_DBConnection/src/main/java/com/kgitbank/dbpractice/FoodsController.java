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
		System.out.println("�Դ�");
	}
	
	@GetMapping("plus")
	public void getPlus() {
		System.out.println("�Դ�");
	}
	
	@PostMapping("plus")
	public String postPlus(Foods food) {
		
		//���� ���ο� �޴��� �߰��� �� �ؾ��� �۾����� ó���ؾ� �Ѵ�.
		// ex) ������ �̸��� �޴����ִ��� üũ, �޴� �̸��� ���Ŀ� �´��� üũ, ���� ����� �Դ��� üũ
//		System.out.println("������ �̸��� �޴��� �ִ��� üũ�ϴ� �ڵ��Դϴ�. 50��");
//		System.out.println("�޴� �̸� ���� üũ. 150��");
//		System.out.println("�ΰ� üũ. 30��");
//		foodsMapper.foodsInsert(food);
//		
		//���⼭�� view�� �����͸� ��Ʈ����Ʈ�� �ƴ� �۾��� �ϴ� ���� �ٶ�������.
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