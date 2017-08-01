package student.test;

import java.util.Scanner;

import student.service.StudentAddService;
import student.service.StudentGradeService;
import student.service.StudentListViewService;
import student.service.StudentSearchService;
import student.service.StudentStatisticsService;

/**
 * 1. 학생정보 추가 (번호/이름/주소/성별/반/키/나이/학년)
 * 2. 성적정보 추가 (번호입력 -> 점수입력)
 * 3. 학생 리스트 출력
 *  3-1 이름순 오름차순 정렬
 *  3-2 성적순 내림차순 정렬
 *  3-3 반별 리스트 출력
 * 4. 학생 정보 검색
 *  4-1 주소 검색
 *  4-2 이름 검색
 * 5. 통계
 *  5-1 성별별 그룹핑
 *  5-2 반별 성적 평균
 *  5-3 주소별 성적 평균
 *  5-4 학년별 키 평균
 * 0. 종료
 * 
 *  출력 테스트 시 
 *  Logger logger = Logger.getLogger("");
 *  logger.info("StudentManageTest");
 *  
 *  에러처리 - 성공/실패 여부 확인 메시지 확인
 *  github commit & push
 *  주석처리
 *  throw 
 */
public class StudentManageTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu;
		while(true) {
			System.out.println("=====================메뉴선택====================");
			System.out.println("1.학생정보 추가 | 2.성적정보 추가| 3.학생리스트 출력");
			System.out.println("4.학생정보 검색 | 5.통계 정보       | 0.종료 ");
			System.out.println("=================================================");
			System.out.print("입력 : ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				StudentAddService sas = new StudentAddService();
				sas.execute(scan);
				break;
			case 2:
				StudentGradeService sgs = new StudentGradeService();
				sgs.execute(scan);
				break;
			case 3:
				StudentListViewService slv = new StudentListViewService();
				slv.execute(scan);
				break;
			case 4:
				StudentSearchService ss = new StudentSearchService();
				ss.execute(scan);
				break;
			case 5:
				StudentStatisticsService sst = new StudentStatisticsService();
				sst.execute(scan);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
			}
		}
	} // end of main
} // end of class
