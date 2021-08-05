package com.kgitbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgitbank.mapper.FoodsMapper;
import com.kgitbank.model.Foods;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class FoodsServiceImpl implements FoodService{
	
	@Autowired
	FoodsMapper foodsMapper;
	
	public boolean addFood(Foods food) {
		System.out.println("������ �̸��� �޴��� �ִ��� üũ�ϴ� �ڵ��Դϴ�. 50��");
		System.out.println("�޴� �̸� ���� üũ. 150��");
		System.out.println("�ΰ� üũ. 30��");
		log.info(foodsMapper);
		
		return true;
		//return foodsMapper.foodsInsert(food) > 0;
	}
	
}