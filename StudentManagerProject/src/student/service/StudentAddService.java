package student.service;

import java.util.Scanner;

import student.exceptions.NullException;
import student.manage.StudentManager;
import student.vo.Student;

/**
 * �л������� �߰��ϴ� Ŭ����(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�)
 */
public class StudentAddService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		try {
			System.out.print("��ȣ �Է� : ");
			int num = scan.nextInt();
			scan.nextLine();
			System.out.print("�̸� �Է� : ");
			String name = this.nextLine(scan);
			System.out.print("�ּ� �Է�(����/���/�泲) : ");
			String addr = this.nextLine(scan);
			System.out.print("���� �Է� : ");
			String gender = this.nextLine(scan);
			System.out.print("�б� �Է�(A/B/C) : ");
			String clazz = this.nextLine(scan);
			System.out.print("Ű �Է� : ");
			double height = scan.nextDouble();
			System.out.print("���� �Է� : ");
			int age = scan.nextInt();
			System.out.print("�г� �Է�(1/2/3/4) : ");
			int year = scan.nextInt();
			
			Student s = new Student(num, name, addr, gender, clazz, height, age, year);
			
			if(StudentManager.addStudent(s)){
				System.out.println("[�л����� �߰� ����]");
			} else {
				System.out.println("[�л����� �߰� ����]");
			}
		} catch (NullException e) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return;
		}
	}
	
	String nextLine(Scanner scan){
		String str = scan.nextLine();
		if(str.length()==0){
			throw new NullException("");
		}
		return str;
	}
}
