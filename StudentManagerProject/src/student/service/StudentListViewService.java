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
 * �л� ����Ʈ�� ����ϴ� Ŭ����
 * �̸� �������� ����, ���� �������� ����, �ݺ� ����Ʈ ���
 */
public class StudentListViewService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		while(true) {
			System.out.println("==============================�޴�����=====================================");
			System.out.println("1.�̸� �������� ���� |2.���� �������� ���� |3.�ݺ� ����Ʈ ��� |0.����Ʈ ��� ����");
			System.out.println("===========================================================================");
			System.out.print("�Է� : ");
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
				System.out.println("[A�� ���]");
				l1.stream().forEach(t -> {System.out.println(t);});
				List<Student> l2 = map.get("B");
				System.out.println("[B�� ���]");
				l2.stream().forEach(t -> {System.out.println(t);});
				List<Student> l3 = map.get("C");
				System.out.println("[C�� ���]");
				l3.stream().forEach(t -> {System.out.println(t);});
				
				
//			System.out.println(StudentManager.clazzList()); // 7v
				break;
			case 0:
				System.out.println("[����Ʈ ��� ����]");
				return;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
}
