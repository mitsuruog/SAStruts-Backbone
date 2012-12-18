package com.mitsuruog.proto.seaser.backbone.action;

import org.seasar.struts.annotation.Execute;

public class BasicAuthAction {

	@Execute(validator = false)
	public String index() {
		System.out.println("BasicAuthAction called!!");
		return null;
	}
}
