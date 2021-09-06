package school;

import java.util.ArrayList;

public class School {

	/*
	 * 이 프로젝트에서 학교는 여러개로 존재할 수 없다.
	 * Singleton pattern으로 객체를 만든다.
	 */
	private static School instance = new School();
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();

	private School() {
		// 생성자를 private으로 외부에서 생성을 막는다.
	}

	public static School getInstance() {
		if (instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

}
