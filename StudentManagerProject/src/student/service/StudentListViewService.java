package student.service;

import java.util.Scanner;

import student.manage.StudentManager;

/**
 * �л� ����Ʈ�� ����ϴ� Ŭ����
 * �̸� �������� ����, ���� �������� ����, �ݺ� ����Ʈ ���
 */
public class StudentListViewService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		System.out.println("=========================================================");
		System.out.println("1.�̸� �������� ���� | 2.���� �������� ���� |3.�ݺ� ����Ʈ ���");
		System.out.println("=========================================================");
		System.out.print("�Է� : ");
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
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
	}

}
