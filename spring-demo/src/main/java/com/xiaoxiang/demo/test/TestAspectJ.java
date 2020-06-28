package com.xiaoxiang.demo.test;

import com.xiaoxiang.demo.bean.AspectJTestBean;
import com.xiaoxiang.demo.init.MyXMLApplicationContext;

public class TestAspectJ {

	public static void main(String[] args) {
		MyXMLApplicationContext context = new MyXMLApplicationContext("spring.xml");

		AspectJTestBean aspectJTestBean = (AspectJTestBean) context.getBean("aspectJTestBean");
		aspectJTestBean.test();
	}
}
