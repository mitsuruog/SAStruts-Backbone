package com.mitsuruog.proto.seaser.backbone.action.api;

import jp.ardito.seasar.struts.proxy.Proxy;
import jp.ardito.seasar.struts.proxy.ProxyType;

import org.seasar.struts.annotation.Execute;

public class OrderAction {

	public String id;

	@Proxy(type = ProxyType.DEFAULT)
    @Execute(validator = false)
	public String index() {
		System.out.println("OrderAction index called");
		return null;
	}

	@Proxy(type = ProxyType.DEFAULT)
	@Execute(validator = false, urlPattern="{id}")
	public String get(){
		System.out.println("OrderAction get called");
		System.out.println("id:" + id);
		return null;
	}

	@Proxy(type = ProxyType.DEFAULT)
	@Execute(validator = false, urlPattern="{id}/add")
	public String add(){
		System.out.println("OrderAction add called");
		System.out.println("id:" + id);
		return null;
	}

	@Proxy(type = ProxyType.DEFAULT)
	@Execute(validator = false, urlPattern="{id}/update")
	public String update(){
		System.out.println("OrderAction update called");
		System.out.println("id:" + id);
		return null;
	}

	@Proxy(type = ProxyType.DEFAULT)
	@Execute(validator = false, urlPattern="{id}/delete")
	public String delete(){
		System.out.println("OrderAction delete called");
		System.out.println("id:" + id);
		return null;
	}

}
