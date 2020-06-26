package com.xiaoxiang.demo.bean;

import org.springframework.stereotype.Service;

@Service("aspectJTestBean")
public class AspectJTestBean {
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test(){
		System.out.println("testAspectJ");
	}

}
