package com.xiaoxiang.demo.transaction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName FooServiceImpl
 * @Description TODO
 * @Author luxiao
 * @description
 * @date 2020/7/19 19:41
 */
@Service
public class FooServiceImpl implements FooService {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	@Transactional
	@Override
	public void insertFoo(User user) {
		logger.info("[fooService] start insert foo");
		ApplicationEventPublisher eventPublisher = applicationEventPublisher;
		if (null != eventPublisher) {
			eventPublisher.publishEvent(new MyTransactionEvent(this, "testTransactionEvent"));
		}
		logger.info("[fooServive] finish insert foo");
	}
}
