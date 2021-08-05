package com.kgitbank.model;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Data
public class Department {
	
	@NonNull
	private Integer department_id;
	@NonNull
	private String department_name;
	private Integer manager_id;
	private Integer location_id;
	
}
