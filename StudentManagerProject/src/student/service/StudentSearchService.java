package student.service;

import java.util.Scanner;

import student.manage.StudentManager;

/**
 * 학생정보를 주소 또는 이름으로 검색하는 클래스
 */
public class StudentSearchService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		while(true){
			System.out.println("=============메뉴선택=============");
			System.out.println("1.주소 검색 |2.이름 검색 |0.검색 종료");
			System.out.println("================================= ");
			System.out.print("입력 : ");
			int menu = scan.nextInt();
			scan.nextLine();
			switch (menu) {
			case 1:
				System.out.print("검색할 주소 입력 : ");
				String addr = scan.nextLine();
				StudentManager.addressSearch(addr).forEach(t -> {System.out.println(t);});;
				break;
			case 2:
				System.out.print("검색할 이름 입력 : ");
				String name = scan.nextLine();
				StudentManager.nameSearch(name).forEach(t -> {System.out.println(t);});;
				break;
			case 0:
				System.out.println("검색 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

}
