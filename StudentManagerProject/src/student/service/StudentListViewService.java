package student.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import student.manage.StudentManager;
import student.vo.Student;

/**
 * 학생 리스트를 출력하는 클래스
 * 이름 오름차순 정렬, 성적 내림차순 정렬, 반별 리스트 출력
 */
public class StudentListViewService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		while(true) {
			System.out.println("==============================메뉴선택=====================================");
			System.out.println("1.이름 오름차순 정렬 |2.성적 내림차순 정렬 |3.반별 리스트 출력 |0.리스트 출력 종료");
			System.out.println("===========================================================================");
			System.out.print("입력 : ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				StudentManager.ascendingName().forEach(t -> {System.out.println(t);});
//			System.out.println(StudentManager.ascendingName()); // 7v 
				Logger logger = Logger.getLogger("");
				logger.info("StudentManager.ascendingName()");
				break;
			case 2:
				StudentManager.descendingScore().forEach(t -> {System.out.println(t);});
//			System.out.println(StudentManager.descendingScore()); // 7v
				break;
			case 3:
				Stream<Student> s = StudentManager.clazzList();//.forEach(t -> {System.out.println(t);});
				Map<String, List<Student>> map = s.collect(Collectors.groupingBy(t -> t.getClazz()));
				List<Student> l1 = map.get("A");
				System.out.println("[A반 목록]");
				l1.stream().forEach(t -> {System.out.println(t);});
				List<Student> l2 = map.get("B");
				System.out.println("[B반 목록]");
				l2.stream().forEach(t -> {System.out.println(t);});
				List<Student> l3 = map.get("C");
				System.out.println("[C반 목록]");
				l3.stream().forEach(t -> {System.out.println(t);});
				
				
//			System.out.println(StudentManager.clazzList()); // 7v
				break;
			case 0:
				System.out.println("[리스트 출력 종료]");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
}
