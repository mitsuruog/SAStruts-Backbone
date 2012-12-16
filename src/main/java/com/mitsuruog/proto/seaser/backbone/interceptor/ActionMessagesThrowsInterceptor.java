package com.mitsuruog.proto.seaser.backbone.interceptor;

import javax.servlet.http.HttpServletResponse;

import net.arnx.jsonic.JSON;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.ThrowsInterceptor;
import org.seasar.struts.exception.ActionMessagesException;
import org.seasar.struts.util.ResponseUtil;

public class ActionMessagesThrowsInterceptor extends ThrowsInterceptor {

	private static final long serialVersionUID = 1L;

	public String handleThrowable(ActionMessagesException e, MethodInvocation invocation) throws Throwable {

		HttpServletResponse resp = ResponseUtil.getResponse();
		resp.setStatus(404);

		//TODO メッセージの取得方法が未決
		ResponseUtil.write(JSON.encode(e.getMessages()), "application/json");

		return null;
	}
}
