package com.xiaoxiang.demo;

import com.xiaoxiang.demo.bean.Student;
import com.xiaoxiang.demo.init.MyXMLApplicationContext;

/**
 *
 */
public class Application {
	public static void main(String[] args) {
		MyXMLApplicationContext context = new MyXMLApplicationContext("spring.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student);
	}
}
