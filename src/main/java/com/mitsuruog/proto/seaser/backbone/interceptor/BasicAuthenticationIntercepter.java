package com.mitsuruog.proto.seaser.backbone.interceptor;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

public class BasicAuthenticationIntercepter extends AbstractInterceptor {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("basic intercepter before");
		Object ret = invocation.proceed();
		System.out.println("basic intercepter after");
		return ret;
	}
}
