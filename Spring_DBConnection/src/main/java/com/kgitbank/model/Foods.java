package com.kgitbank.model;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Foods {
	@NonNull
	int food_num;
	@NonNull
	String food_name;
	@NonNull
	int food_price;
}

