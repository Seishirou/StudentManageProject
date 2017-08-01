package student.manage;
/**
 * Linked List ���
 * Student ���� ������ ó���ϴ� Ŭ����
 * ����� �Ұ���
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import student.vo.Student;

public class StudentManager {
	private static LinkedList<Student> list = new LinkedList<>();
	static { // �л� �ʱ�ȭ
		list.add(new Student(1, "�赿��", "���", "����", "A", 182, 33, 100, 4));
		list.add(new Student(2, "������", "�泲", "����", "B", 168, 26, 150, 2));
		list.add(new Student(3, "�����", "����", "����", "C", 164, 32, 200, 3));
		list.add(new Student(4, "�̿���", "���", "����", "A", 170, 27, 80, 1));
	}
	// #1 �л� �߰� �޼ҵ�
	public static boolean addStudent(Student s) {
		return list.add(s);
	}
	
	// #2 ��ȣ Ȯ�� �޼ҵ�
	public static boolean numCheck(int num) {
		for (int i = 0; i < list.size(); i++) {
			if (num == list.get(i).getNum()) {
				return true;
			}
		}
		return false;
	}
	
	// #2 ���� �߰� �޼ҵ�
	public static boolean addScore(int num, int score) {
		for (int i = 0; i < list.size(); i++) {
			if (num == list.get(i).getNum()) {
				list.get(i).setScore(score);
				return true;
			}
		}
		return false;
	}
	
	// #3 �л�����Ʈ ��� 8����
	// �̸� �������� ����
	public static Stream<Student> ascendingName() {
		Stream<Student> s = list.stream().sorted();
		return s;
	}
	// ���� �������� ����
	public static Stream<Student> descendingScore() {
		Stream<Student> s = list.stream().sorted((o1, o2) -> o2.getScore() - o1.getScore());
		return s;
	}
	// �ݺ� ����Ʈ ���
	public static Stream<Student> clazzList() {
		Stream<Student> s = list.stream().sorted((o1, o2) -> o1.getClazz().compareTo(o2.getClazz()));
		return s;
	}
	
	// #4 �л������˻�
	// �ּ� �˻�
	public static Stream<Student> addressSearch(String addr) {
		return list.stream().filter(t -> addr.equals(t.getAddr()));
	}
	// �̸� �˻�
	public static Stream<Student> nameSearch(String name) {
		return list.stream().filter(t -> name.equals(t.getName()));
	}
	
	// #5 ��� ����
	// ������ �׷���
	public static Map<String, List<Student>> genderGroup() {
		Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(t -> t.getGender()));
		return map;
	}
	// �ݺ� ���� ���
	public static Map<String, Double> groupAverage() {
		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(t -> t.getClazz(), Collectors.averagingInt(t -> t.getScore())));
		return map;
	}
	// �ּҺ� ���� ���
	public static Map<String, Double> addrAverage() {
		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(t -> t.getAddr(), Collectors.averagingInt(t -> t.getScore())));
		return map;
	}
	// �г⺰ Ű ���
	public static Map<Integer, Double> heightAverage() {
		Map<Integer, Double> map = list.stream().collect(Collectors.groupingBy(t -> t.getYear(), Collectors.averagingDouble(t -> t.getHeight())));
		return map;
	}
	

	
}
