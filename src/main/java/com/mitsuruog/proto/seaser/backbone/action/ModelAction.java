package com.mitsuruog.proto.seaser.backbone.action;

//import javax.servlet.http.HttpServletResponse;

import java.util.LinkedList;
import java.util.List;

import net.arnx.jsonic.JSON;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.util.ResponseUtil;

import com.mitsuruog.proto.seaser.backbone.entity.Model;

public class ModelAction {

	//TODO ActionForm
	@Required
	public String name;
	@Required
	public String age;

    @Execute(validator = true, input="index.html")
	public String index() {

    	//これで、ActionMessagesThrowsInterceptorが動く
    	// TODO 本当はメッセージファイルのerrors.requiredとか取得
    	//throw new ActionMessagesException("エラー");

    	List<Model> models = new LinkedList<Model>();
    	models.add(new Model(name, age));

    	ResponseUtil.write(JSON.encode(models), "application/json");
        return null;
	}
}
