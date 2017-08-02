package student.service;

import java.util.Scanner;

import student.manage.StudentManager;
import student.vo.Student;


/**
 * �л������� �߰��ϴ� Ŭ����(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�)
 */
public class StudentAddService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		System.out.print("��ȣ �Է� : ");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.print("�̸� �Է� : ");
		String name = scan.nextLine();
		System.out.print("�ּ� �Է�(����/���/�泲) : ");
		String addr = scan.nextLine();
		System.out.print("���� �Է� : ");
		String gender = scan.nextLine();
		System.out.print("�б� �Է�(A/B/C) : ");
		String clazz = scan.nextLine();
		System.out.print("Ű �Է� : ");
		double height = scan.nextDouble();
		System.out.print("���� �Է� : ");
		int age = scan.nextInt();
		System.out.print("�г� �Է�(1/2/3/4) : ");
		int year = scan.nextInt();
		
		Student s = new Student(num, name, addr, gender, clazz, height, age, year);
		
		if(StudentManager.addStudent(s)){
			System.out.println("�л������� �߰��Ǿ����ϴ�.");
		} else {
			System.out.println("�л������� �߰����� �ʾҽ��ϴ�.");
		}
	}
}
