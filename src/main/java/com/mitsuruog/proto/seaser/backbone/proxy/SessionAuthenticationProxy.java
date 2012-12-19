package com.mitsuruog.proto.seaser.backbone.proxy;

import jp.ardito.seasar.struts.proxy.ActionProxy;
import jp.ardito.seasar.struts.proxy.ProxyChain;

public class SessionAuthenticationProxy implements ActionProxy {

	@Override
	public String execute(ProxyChain chain) throws Exception {

		System.out.println("session intercepter before");

		//ここで認証されているかのチェックを行う。


		return chain.invoke();
	}

}
