package com.mitsuruog.proto.seaser.backbone.action;

import java.util.LinkedList;
import java.util.List;

import net.arnx.jsonic.JSON;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import com.mitsuruog.proto.seaser.backbone.entity.Model;

public class CollectionAction {

    @Execute(validator = false)
	public String index() {

    	List<Model> models = new LinkedList<Model>();
    	models.add(new Model("taro", "20"));
    	models.add(new Model("hanako", "25"));
    	models.add(new Model("jiro", "49"));
    	models.add(new Model("keiko", "80"));

    	ResponseUtil.write(JSON.encode(models), "application/json");
        return null;
	}
}
