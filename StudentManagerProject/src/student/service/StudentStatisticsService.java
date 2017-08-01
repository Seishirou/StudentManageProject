package student.service;

import java.util.Scanner;

import student.manage.StudentManager;

/**
 * 통계정보를 출력하는 클래스
 * 성별별 그룹핑, 반별 성적 평균, 주소별 성적 평균, 학년별 키 평균
 */
public class StudentStatisticsService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		System.out.println("================================================================");
		System.out.println("1.성별별 그룹핑 |2.반별 성적 평균 |3.주소별 성적 평균 |4.학년별 키 평균");
		System.out.println("================================================================");
		System.out.print("입력 : ");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			System.out.println(StudentManager.genderGroup());
			break;
		case 2:
			System.out.println(StudentManager.groupAverage());
			break;
		case 3:
			System.out.println(StudentManager.addrAverage());
			break;
		case 4:
			System.out.println(StudentManager.heightAverage());
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

}
