package com.xiaoxiang.demo.init;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyXMLApplicationContext extends ClassPathXmlApplicationContext {

	public MyXMLApplicationContext() {
	}

	public MyXMLApplicationContext(ApplicationContext parent) {
		super(parent);
	}

	public MyXMLApplicationContext(String configLocation) throws BeansException {
		super(configLocation);
	}

	public MyXMLApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}

	public MyXMLApplicationContext(String[] configLocations, ApplicationContext parent) throws BeansException {
		super(configLocations, parent);
	}

	public MyXMLApplicationContext(String[] configLocations, boolean refresh) throws BeansException {
		super(configLocations, refresh);
	}

	public MyXMLApplicationContext(String[] configLocations, boolean refresh, ApplicationContext parent) throws BeansException {
		super(configLocations, refresh, parent);
	}

	public MyXMLApplicationContext(String path, Class<?> clazz) throws BeansException {
		super(path, clazz);
	}

	public MyXMLApplicationContext(String[] paths, Class<?> clazz) throws BeansException {
		super(paths, clazz);
	}

	public MyXMLApplicationContext(String[] paths, Class<?> clazz, ApplicationContext parent) throws BeansException {
		super(paths, clazz, parent);
	}

	//这个方法用来给子类实现验证自定义配置的
	@Override
	protected void initPropertySources() {
//		getEnvironment().setRequiredProperties("test","test2");
	}
}
