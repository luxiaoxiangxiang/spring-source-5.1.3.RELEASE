package com.xiaoxiang.test;

import com.xiaoxiang.demo.bean.AspectJTestBean;
import com.xiaoxiang.demo.init.MyXMLApplicationContext;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class SupperTest {


	ApplicationContext applicationContext;

	@Before
	public void before(){
		applicationContext = new MyXMLApplicationContext("classpath:spring-demo.xml");
	}

	@Test
	public void testAspectJ(){
		AspectJTestBean aspectJTestBean = (AspectJTestBean) applicationContext.getBean("aspectJTestBean");
		aspectJTestBean.test();
	}


}
