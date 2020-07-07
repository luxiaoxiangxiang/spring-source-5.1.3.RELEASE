package com.xiaoxiang.test;

import com.xiaoxiang.demo.bean.AspectJTestBean;
import com.xiaoxiang.demo.init.MyXMLApplicationContext;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationSuppertest {

	ApplicationContext applicationContext;

	@Before
	public void before(){
		applicationContext = new AnnotationConfigApplicationContext("com.xiaoxiang.demo");
	}

	@Test
	public void testAspectJ(){
		AspectJTestBean aspectJTestBean = (AspectJTestBean) applicationContext.getBean("aspectJTestBean");
		aspectJTestBean.test();
	}
}
