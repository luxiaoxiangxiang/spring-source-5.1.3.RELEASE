package com.xiaoxiang.demo.test;

import com.xiaoxiang.demo.bean.Student;
import com.xiaoxiang.demo.event.TestEvent;
import com.xiaoxiang.demo.init.MyXMLApplicationContext;
import org.springframework.context.event.EventListener;

public class TestListener {

	public static void main(String[] args) {
		MyXMLApplicationContext context = new MyXMLApplicationContext("spring.xml");

		TestEvent testEvent = new TestEvent("hello", "luxiao");
		context.publishEvent(testEvent);
	}
}
