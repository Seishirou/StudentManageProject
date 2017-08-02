package student.service;

import java.util.List;
import java.util.Scanner;

import student.manage.StudentManager;
import student.vo.Student;

/**
 * ��������� ����ϴ� Ŭ����
 * ������ �׷���, �ݺ� ���� ���, �ּҺ� ���� ���, �г⺰ Ű ���
 */
public class StudentStatisticsService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		while(true){
			System.out.println("=================================�޴� ����=======================================");
			System.out.println("1.������ �׷��� |2.�ݺ� ���� ��� |3.�ּҺ� ���� ��� |4.�г⺰ Ű ��� |0.������� ����");
			System.out.println("================================================================================");
			System.out.print("�Է� : ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				List<Student> l1 = StudentManager.genderGroup().get("����");
				System.out.println("[���� �׷�]");
				l1.stream().forEach(t -> {System.out.println(t);});
				List<Student> l2 = StudentManager.genderGroup().get("����");
				System.out.println("[���� �׷�]");
				l2.stream().forEach(t -> {System.out.println(t);});
				break;
			case 2:
				System.out.println("[�ݺ� ���� ���] : " + StudentManager.groupAverage());
				break;
			case 3:
				System.out.println("[�ּҺ� ���� ���] : " +StudentManager.addrAverage());
				break;
			case 4:
				System.out.println("[�г⺰ Ű ���] : " +StudentManager.heightAverage());
				break;
			case 0:
				System.out.println("[��� ���� ����]");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			
		}
	}

}
