package student.service;

import java.util.Scanner;

import student.manage.StudentManager;

/**
 * 학생 리스트를 출력하는 클래스
 * 이름 오름차순 정렬, 성적 내림차순 정렬, 반별 리스트 출력
 */
public class StudentListViewService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		System.out.println("=========================================================");
		System.out.println("1.이름 오름차순 정렬 | 2.성적 내림차순 정렬 |3.반별 리스트 출력");
		System.out.println("=========================================================");
		System.out.print("입력 : ");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			StudentManager.ascendingName().forEach(t -> {System.out.println(t);});
			break;
		case 2:
			StudentManager.descendingScore().forEach(t -> {System.out.println(t);});
			break;
		case 3:
			StudentManager.clazzList().forEach(t -> {System.out.println(t);});
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}

}
