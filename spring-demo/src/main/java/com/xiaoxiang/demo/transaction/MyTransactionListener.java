package com.xiaoxiang.demo.transaction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @ClassName MyTransactionListener
 * @Description TODO
 * @Author luxiao
 * @description
 * @date 2020/7/20 11:23
 */
@Component
public class MyTransactionListener {
	private final Log logger = LogFactory.getLog(getClass());
	@TransactionalEventListener
	public void hanldeOrderCreatedEvent(MyTransactionEvent event) {
		System.out.println("transactionEventListener start");
		// do transaction event
		System.out.println("event : " + event.getEventStr());
		// finish transaction event
		System.out.println("transactionEventListener finish");
	}
}
