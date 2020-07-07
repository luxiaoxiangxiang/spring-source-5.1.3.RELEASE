package com.xiaoxiang.demo.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

	@Pointcut("execution(* *.test(..))")
	public void test(){
		System.out.println("nihao");
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
			return o;
		}catch(Throwable a){
			a.printStackTrace();
		}finally {
			System.out.println("zhixing");
			System.out.println("after1");
		}

		return o;
	}


	public static void main(String[] args) {
		try{

		}finally {

		}
	}
}
