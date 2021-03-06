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
		System.out.println("동일한 이름의 메뉴가 있는지 체크하는 코드입니다. 50줄");
		System.out.println("메뉴 이름 형식 체크. 150줄");
		System.out.println("널값 체크. 30줄");
		log.info(foodsMapper);
		
		return true;
		//return foodsMapper.foodsInsert(food) > 0;
	}
	
}
