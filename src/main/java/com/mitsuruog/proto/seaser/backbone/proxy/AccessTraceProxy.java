package com.mitsuruog.proto.seaser.backbone.proxy;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.ardito.seasar.struts.proxy.ActionProxy;
import jp.ardito.seasar.struts.proxy.ProxyChain;

import org.seasar.struts.util.RequestUtil;

import com.mitsuruog.proto.seaser.backbone.dto.UserDto;

public class AccessTraceProxy implements ActionProxy {

	@Override
	public String execute(ProxyChain chain) throws Exception {

		HttpServletRequest req = RequestUtil.getRequest();

		/*
		 * Webコンテナのログでも同じものが取れると思うが、
		 * 認証したユーザ情報も出したいのでここでトレース出力する。
		 */

		System.out.println(req.getRequestURI());
		System.out.println(req.getMethod());

		//基本String型が戻ると思うので無視
		@SuppressWarnings("unchecked")
		Enumeration<String> names = req.getParameterNames();

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

		return chain.invoke();

	}

}
