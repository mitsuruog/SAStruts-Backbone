package com.mitsuruog.proto.seaser.backbone.interceptor;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

public class SessionAuthenticationIntercepter extends AbstractInterceptor {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println("session intercepter before");

		//ここで認証されているかのチェックを行う。

		Object ret = invocation.proceed();
		System.out.println("session intercepter after");
		return ret;

	}

}
