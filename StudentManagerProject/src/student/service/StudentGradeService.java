package student.service;

import java.util.Scanner;

import student.manage.StudentManager;

/**
 * ����������  �߰��ϴ� Ŭ���� (��ȣ�Է� -> �����Է�)
 */
public class StudentGradeService implements StudentService{

	@Override
	public void execute(Scanner scan) {
		System.out.print("��ȣ �Է� : ");
		int num = scan.nextInt();
		int score = 0;
		if(StudentManager.numCheck(num)) {
			System.out.print("���� �Է� : ");
			 score = scan.nextInt();
		} else {
			System.out.println("��ȣ�� �߸��Է��ϼ̽��ϴ�.");
		}
		
		if(StudentManager.addScore(num, score)) {
			System.out.println("���� �Է��� �����߽��ϴ�.");
		} else {
			System.out.println("���� �Է��� �����߽��ϴ�.");
		}
	}

}
