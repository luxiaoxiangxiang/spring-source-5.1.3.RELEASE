package com.xiaoxiang.demo.transaction;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName MyTransactionEvent
 * @Description TODO
 * @Author luxiao
 * @description
 * @date 2020/7/20 10:34
 */
public class MyTransactionEvent extends ApplicationEvent{
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public MyTransactionEvent(Object source) {
		super(source);
	}

	public MyTransactionEvent(Object source,String eventStr) {
		super(source);
		this.eventStr = eventStr;
	}

	private String eventStr ;

	public String getEventStr() {
		return eventStr;
	}

	public void setEventStr(String eventStr) {
		this.eventStr = eventStr;
	}
}
