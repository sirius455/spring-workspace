package com.kgitbank.service;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// �������� root-context�� �����Ʈ�μ� ����� ��

@Component
public class RockPaperScissors {
	
	// ����, ����, �� �� �ϳ��� �Է¹����� ��/��/�� ����� ���ϵǴ� �޼��带 �ϳ� �ۼ�
	
	private String[] result = {"��", "��", "��"};
	
	public String versus(String user) {
		return result[(int)(Math.random() * result.length)];
	}
	
//	public String RockPaperScissors(String user) {
//	  
//		String gameover = "";
//		int computer = (int) (Math.random() * 3 + 1);
//		int user_num = 0;
//		
//		if(user.equals("����")) {
//			user_num = 1;
//		} else if (user.equals("����")) {
//			user_num = 2;
//		} else if (user.equals("��")) {
//			user_num = 3;
//		}
//		
//		if(user_num == computer) {
//			gameover = "���º�";
//		} else if (user_num == 1 && computer == 3 ||
//					user_num == 2 && computer == 1 ||
//					user_num == 3 && computer == 2
//				) {
//			gameover = "��";
//		} else if (
//				user_num == 1 && computer == 2 ||
//				user_num == 2 && computer == 3 ||
//				user_num == 3 && computer == 1
//				) {
//			gameover = "��";
//		}
//		return gameover;
//	}
	

	//JUnit�׽�Ʈ�� �޼��带 20ȸ �׽�Ʈ�ϰ� ���Ͽ� ����� ���� �α׸� ���ܺ�����
	
}
