package com.xiaoxiang.demo.event;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {

	private static final long serialVersionUID = -6039623388696065073L;

	private String msg;
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}
	public void print(){
		System.out.println(msg);
	}
}
