package com.SpringDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		/*Student std = new Student();
		//std.StudentName= "Masarat" ;===StudentName is private in Student class
		std.setStudentName("Masarat");
		std.displayName();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student std= context.getBean("student",Student.class);
		std.displayName();
		
		
	}
}
