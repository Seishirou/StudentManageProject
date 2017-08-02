package student.service;

import java.util.Scanner;

import student.manage.StudentManager;

/**
 * �л������� �ּ� �Ǵ� �̸����� �˻��ϴ� Ŭ����
 */
public class StudentSearchService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		while(true){
			System.out.println("=============�޴�����=============");
			System.out.println("1.�ּ� �˻� |2.�̸� �˻� |0.�˻� ����");
			System.out.println("================================= ");
			System.out.print("�Է� : ");
			int menu = scan.nextInt();
			scan.nextLine();
			switch (menu) {
			case 1:
				System.out.print("�˻��� �ּ� �Է� : ");
				String addr = scan.nextLine();
				StudentManager.addressSearch(addr).forEach(t -> {System.out.println(t);});;
				break;
			case 2:
				System.out.print("�˻��� �̸� �Է� : ");
				String name = scan.nextLine();
				StudentManager.nameSearch(name).forEach(t -> {System.out.println(t);});;
				break;
			case 0:
				System.out.println("�˻� ����");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}

}
