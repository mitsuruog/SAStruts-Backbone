package com.mitsuruog.proto.seaser.backbone.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.util.RequestUtil;

import com.mitsuruog.proto.seaser.backbone.dto.UserDto;

public class AccessTraceIntercepter extends AbstractInterceptor {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		HttpServletRequest req = RequestUtil.getRequest();

		/*
		 * Webコンテナのログでも同じものが取れると思うが、
		 * 認証したユーザ情報も出したいのでここでトレース出力する。
		 */

		System.out.println(req.getRequestURI());
		System.out.println(req.getMethod());

		//基本String型が戻ると思うので無視
		@SuppressWarnings("rawtypes")
		Enumeration names = req.getParameterNames();

	    while (names.hasMoreElements()){
	      String name = (String)names.nextElement();
	      for (String value : req.getParameterValues(name)) {
	      	System.out.println(name + " : " + value);
	      }
	    }

	    HttpSession session = req.getSession(false);
	    if(session != null){
	    	//例
	    	UserDto user = (UserDto)session.getAttribute("User");
	    	if(user != null){
	    		System.out.println(user.getId());
	    	}
	    }

		System.out.println("access trace intercepter before");

		//中の処理
		Object ret = invocation.proceed();

		System.out.println("access trace intercepter after");
		return ret;

	}

}
