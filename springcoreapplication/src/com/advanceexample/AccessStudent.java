package com.advanceexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccessStudent {

	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("studentContext.xml");
		Student s = (Student)obj.getBean("stu");
		s.displayIno();
		Student s1 = (Student)obj.getBean("stunew");
		s1.displayMapInfo();

	}

}
