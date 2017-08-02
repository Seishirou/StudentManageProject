package student.service;

import java.util.Scanner;

import student.exceptions.NullException;
import student.manage.StudentManager;
import student.vo.Student;

/**
 * 학생정보를 추가하는 클래스(번호/이름/주소/성별/반/키/나이/학년)
 */
public class StudentAddService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		try {
			System.out.print("번호 입력 : ");
			int num = scan.nextInt();
			scan.nextLine();
			System.out.print("이름 입력 : ");
			String name = this.nextLine(scan);
			System.out.print("주소 입력(서울/경기/충남) : ");
			String addr = this.nextLine(scan);
			System.out.print("성별 입력 : ");
			String gender = this.nextLine(scan);
			System.out.print("학급 입력(A/B/C) : ");
			String clazz = this.nextLine(scan);
			System.out.print("키 입력 : ");
			double height = scan.nextDouble();
			System.out.print("나이 입력 : ");
			int age = scan.nextInt();
			System.out.print("학년 입력(1/2/3/4) : ");
			int year = scan.nextInt();
			
			Student s = new Student(num, name, addr, gender, clazz, height, age, year);
			
			if(StudentManager.addStudent(s)){
				System.out.println("[학생정보 추가 성공]");
			} else {
				System.out.println("[학생정보 추가 실패]");
			}
		} catch (NullException e) {
			System.out.println("잘못입력하셨습니다.");
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
