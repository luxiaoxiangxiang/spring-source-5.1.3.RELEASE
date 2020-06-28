package com.xiaoxiang.test.design;

import com.xiaoxiang.demo.design.proxy.Children;
import com.xiaoxiang.demo.design.proxy.Parent;
import com.xiaoxiang.demo.design.proxy.People;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {




	@Test
	public void test(){

		People people = (People)Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),new Class<?>[]{People.class},
				new Parent(new Children()));
		people.execute();
	}
}
