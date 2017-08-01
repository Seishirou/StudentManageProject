package student.test;

import java.util.Scanner;

import student.service.StudentAddService;
import student.service.StudentGradeService;
import student.service.StudentListViewService;
import student.service.StudentSearchService;
import student.service.StudentStatisticsService;

/**
 * 1. �л����� �߰� (��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�)
 * 2. �������� �߰� (��ȣ�Է� -> �����Է�)
 * 3. �л� ����Ʈ ���
 *  3-1 �̸��� �������� ����
 *  3-2 ������ �������� ����
 *  3-3 �ݺ� ����Ʈ ���
 * 4. �л� ���� �˻�
 *  4-1 �ּ� �˻�
 *  4-2 �̸� �˻�
 * 5. ���
 *  5-1 ������ �׷���
 *  5-2 �ݺ� ���� ���
 *  5-3 �ּҺ� ���� ���
 *  5-4 �г⺰ Ű ���
 * 0. ����
 * 
 *  ��� �׽�Ʈ �� 
 *  Logger logger = Logger.getLogger("");
 *  logger.info("StudentManageTest");
 *  
 *  ����ó�� - ����/���� ���� Ȯ�� �޽��� Ȯ��
 *  github commit & push
 *  �ּ�ó��
 *  throw 
 */
public class StudentManageTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu;
		while(true) {
			System.out.println("=====================�޴�����====================");
			System.out.println("1.�л����� �߰� | 2.�������� �߰�| 3.�л�����Ʈ ���");
			System.out.println("4.�л����� �˻� | 5.��� ����       | 0.���� ");
			System.out.println("=================================================");
			System.out.print("�Է� : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				scan.close();
				System.exit(0);
			}
		}
	} // end of main
} // end of class
