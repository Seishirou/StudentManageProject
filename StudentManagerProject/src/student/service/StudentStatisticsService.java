package student.service;

import java.util.Scanner;

import student.manage.StudentManager;

/**
 * ��������� ����ϴ� Ŭ����
 * ������ �׷���, �ݺ� ���� ���, �ּҺ� ���� ���, �г⺰ Ű ���
 */
public class StudentStatisticsService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		System.out.println("================================================================");
		System.out.println("1.������ �׷��� |2.�ݺ� ���� ��� |3.�ּҺ� ���� ��� |4.�г⺰ Ű ���");
		System.out.println("================================================================");
		System.out.print("�Է� : ");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}

}
