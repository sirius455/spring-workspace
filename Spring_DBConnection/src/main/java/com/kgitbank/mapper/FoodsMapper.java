package com.kgitbank.mapper;


import java.util.List;

import com.kgitbank.model.Employee;
import com.kgitbank.model.Foods;

public interface FoodsMapper {
	
	public int foodsInsert(Foods new_foods); 
	
	public List<Foods> getFoodsList();
}
