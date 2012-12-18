package com.mitsuruog.proto.seaser.backbone.action;

import org.seasar.struts.annotation.Execute;

public class LoginAuthAction {

	@Execute(validator = false)
	public String index() {
		System.out.println("SessionAuthAction called!!");
		return null;
	}
}
