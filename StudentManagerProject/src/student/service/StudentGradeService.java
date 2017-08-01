package student.service;

import java.util.Scanner;

import student.manage.StudentManager;

/**
 * 성적정보를  추가하는 클래스 (번호입력 -> 점수입력)
 */
public class StudentGradeService implements StudentService{

	@Override
	public void execute(Scanner scan) {
		System.out.print("번호 입력 : ");
		int num = scan.nextInt();
		int score = 0;
		if(StudentManager.numCheck(num)) {
			System.out.print("점수 입력 : ");
			 score = scan.nextInt();
		} else {
			System.out.println("번호를 잘못입력하셨습니다.");
		}
		
		if(StudentManager.addScore(num, score)) {
			System.out.println("점수 입력이 성공했습니다.");
		} else {
			System.out.println("점수 입력이 실패했습니다.");
		}
	}

}
