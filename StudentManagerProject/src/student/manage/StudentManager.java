package student.manage;
/**
 * Linked List 사용
 * Student 관련 데이터 처리하는 클래스
 * 입출력 불가능
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import student.vo.Student;

public class StudentManager {
	private static LinkedList<Student> list = new LinkedList<>();
	static { // 학생 초기화
		list.add(new Student(1, "김동근", "경기", "남자", "A", 182, 33, 100, 4));
		list.add(new Student(2, "정태준", "충남", "남자", "B", 168, 26, 150, 2));
		list.add(new Student(3, "김민정", "서울", "여자", "C", 164, 32, 200, 3));
		list.add(new Student(4, "이용진", "경기", "남자", "A", 170, 27, 80, 1));
	}
	// #1 학생 추가 메소드
	public static boolean addStudent(Student s) {
		return list.add(s);
	}
	
	// #2 번호 확인 메소드
	public static boolean numCheck(int num) {
		for (int i = 0; i < list.size(); i++) {
			if (num == list.get(i).getNum()) {
				return true;
			}
		}
		return false;
	}
	
	// #2 점수 추가 메소드
	public static boolean addScore(int num, int score) {
		for (int i = 0; i < list.size(); i++) {
			if (num == list.get(i).getNum()) {
				list.get(i).setScore(score);
				return true;
			}
		}
		return false;
	}
	
	// #3 학생리스트 출력 8버전
	// 이름 오름차순 정렬
	public static Stream<Student> ascendingName() {
		Stream<Student> s = list.stream().sorted();
		return s;
	}
	// 성적 내림차순 정렬
	public static Stream<Student> descendingScore() {
		Stream<Student> s = list.stream().sorted((o1, o2) -> o2.getScore() - o1.getScore());
		return s;
	}
	// 반별 리스트 출력
	public static Stream<Student> clazzList() {
		Stream<Student> s = list.stream().sorted((o1, o2) -> o1.getClazz().compareTo(o2.getClazz()));
		return s;
	}
	
	// #4 학생정보검색
	// 주소 검색
	public static Stream<Student> addressSearch(String addr) {
		return list.stream().filter(t -> addr.equals(t.getAddr()));
	}
	// 이름 검색
	public static Stream<Student> nameSearch(String name) {
		return list.stream().filter(t -> name.equals(t.getName()));
	}
	
	// #5 통계 정보
	// 성별별 그룹핑
	public static Map<String, List<Student>> genderGroup() {
		Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(t -> t.getGender()));
		return map;
	}
	// 반별 성적 평균
	public static Map<String, Double> groupAverage() {
		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(t -> t.getClazz(), Collectors.averagingInt(t -> t.getScore())));
		return map;
	}
	// 주소별 성적 평균
	public static Map<String, Double> addrAverage() {
		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(t -> t.getAddr(), Collectors.averagingInt(t -> t.getScore())));
		return map;
	}
	// 학년별 키 평균
	public static Map<Integer, Double> heightAverage() {
		Map<Integer, Double> map = list.stream().collect(Collectors.groupingBy(t -> t.getYear(), Collectors.averagingDouble(t -> t.getHeight())));
		return map;
	}
	

	
}
