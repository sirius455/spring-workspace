package com.kgitbank.model;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LombokTest {
	
	//�� Ŭ������ �α��� ����ϴ� �ΰŸ� �����Ѵ�.
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
		
		assertEquals("�Һ� �׽�Ʈ ����", 0, emp.getDepartment_id());
	}

}
