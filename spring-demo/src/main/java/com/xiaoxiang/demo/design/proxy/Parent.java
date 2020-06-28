package com.xiaoxiang.demo.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Parent implements InvocationHandler {

	private People people;

	public Parent(People people) {
		this.people = people;
	}


	private void before(){
		System.out.println("帮小明相亲");
	}
	private void after(){
		System.out.println("准备婚礼");
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		method.invoke(people,args);
		after();
		return proxy;
	}
}
