package com.kgitbank.service;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 스프링의 root-context에 컴토넌트로서 등록할 것

@Component
public class RockPaperScissors {
	
	// 가위, 바위, 보 중 하나를 입력받으면 승/무/패 결과가 리턴되는 메서드를 하나 작성
	
	private String[] result = {"승", "무", "패"};
	
	public String versus(String user) {
		return result[(int)(Math.random() * result.length)];
	}
	
//	public String RockPaperScissors(String user) {
//	  
//		String gameover = "";
//		int computer = (int) (Math.random() * 3 + 1);
//		int user_num = 0;
//		
//		if(user.equals("가위")) {
//			user_num = 1;
//		} else if (user.equals("바위")) {
//			user_num = 2;
//		} else if (user.equals("보")) {
//			user_num = 3;
//		}
//		
//		if(user_num == computer) {
//			gameover = "무승부";
//		} else if (user_num == 1 && computer == 3 ||
//					user_num == 2 && computer == 1 ||
//					user_num == 3 && computer == 2
//				) {
//			gameover = "승";
//		} else if (
//				user_num == 1 && computer == 2 ||
//				user_num == 2 && computer == 3 ||
//				user_num == 3 && computer == 1
//				) {
//			gameover = "패";
//		}
//		return gameover;
//	}
	

	//JUnit테스트로 메서드를 20회 테스트하고 파일에 결과에 대한 로그를 남겨보세요
	
}
