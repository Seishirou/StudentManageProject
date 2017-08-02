package student.service;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import student.manage.StudentManager;
import student.vo.Student;

/**
 * 통계정보를 출력하는 클래스
 * 성별별 그룹핑, 반별 성적 평균, 주소별 성적 평균, 학년별 키 평균
 */
public class StudentStatisticsService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		while(true){
			System.out.println("=================================메뉴 선택=======================================");
			System.out.println("1.성별별 그룹핑 |2.반별 성적 평균 |3.주소별 성적 평균 |4.학년별 키 평균 |0.통계정보 종료");
			System.out.println("================================================================================");
			System.out.print("입력 : ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
//				List<Student> l1 = StudentManager.genderGroup().get("남자");
//				System.out.println("[남자 그룹]");
//				l1.stream().forEach(t -> {System.out.println(t);});
//				List<Student> l2 = StudentManager.genderGroup().get("여자");
//				System.out.println("[여자 그룹]");
//				l2.stream().forEach(t -> {System.out.println(t);});
				List<Student> list = StudentManager.genderGroup();
				for (int i = 0; i < list.size(); i++) {
					if("남자".equals(list.get(i).getGender())){
						System.out.println("[남자그룹]");
						System.out.println(list.get(i));
					} else {
						System.out.println("[여자그룹]");
						System.out.println(list.get(i));
					}
				} 
				break;
			case 2:
				System.out.println("[반별 성적 평균] : " + StudentManager.groupAverage());
				break;
			case 3:
				System.out.println("[주소별 성적 평균] : " +StudentManager.addrAverage());
				break;
			case 4:
				System.out.println("[학년별 키 평균] : " +StudentManager.heightAverage());
				break;
			case 0:
				System.out.println("[통계 정보 종료]");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
		}
	}

}
