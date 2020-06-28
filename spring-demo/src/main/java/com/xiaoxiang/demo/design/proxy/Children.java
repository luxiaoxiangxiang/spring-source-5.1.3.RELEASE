package com.xiaoxiang.demo.design.proxy;

public class Children implements People{

	@Override
	public void execute() {
		System.out.println("没时间找对象，在忙工作");
	}
}
