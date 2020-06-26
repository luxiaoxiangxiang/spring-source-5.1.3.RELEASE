package com.xiaoxiang.demo.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

	@Pointcut("execution(* *.test(..))")
	public void test(){

	}

	@Before("test()")
	public void beforeTest(){
		System.out.println("beforeTest");
	}

	@After("test()")
	public void afterTest(){
		System.out.println("afterTest");
	}
	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint joinPoint){
		System.out.println("before1");
		Object o = null;
		try{
			o = joinPoint.proceed();
		}catch(Throwable a){
			a.printStackTrace();
		}
		System.out.println("after1");
		return o;
	}
}
