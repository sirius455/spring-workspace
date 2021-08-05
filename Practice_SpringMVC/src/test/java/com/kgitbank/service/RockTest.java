package com.kgitbank.service;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kgitbank.model.Employee;
import com.kgitbank.model.LombokTest;
import com.kgitbank.quiz.Prime;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class RockTest {
	
	@Autowired
	RockPaperScissors game;
	
	@Test
	public void test() {
	
		for (int i = 0; i < 100; i++) {
			String pp = "";
			int num = (int) Math.random() * 3 + 1;
			
			if(num == 1) {
				pp = "가위";
			} else if (num == 2) {
				pp = "바위";
			} else if (num == 3) {
				pp = "보";
			}
			
			String end = game.versus(pp);
			log.info(end);
	
		}
		
		
		
	}


}


