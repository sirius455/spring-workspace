package com.kgitbank.model;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LombokTest {
	
	//이 클래스의 로깅을 담당하는 로거를 생성한다.
	Logger log = Logger.getLogger(LombokTest.class);
	
	@Test
	public void test() {
		Employee emp = new Employee(10, "Smith", "ASMITH");
		log.fatal(emp);
		log.error(emp);
		log.warn(emp);
		log.info(emp);
		log.debug(emp);
		log.trace(emp);
		
		assertEquals("롬복 테스트 실패", 0, emp.getDepartment_id());
	}

}
