package com.SpringDependencyInjection;

public class Student {

	


		private String StudentName;
		
		//This is the setter method that is injecting a value for the dependency
		public void setStudentName(String studentName) {
			this.StudentName = studentName;
		}


		void displayName()
		{
			System.out.println("student name is "+ StudentName);
		}
		
	}

