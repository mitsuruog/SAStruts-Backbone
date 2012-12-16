package com.mitsuruog.proto.seaser.backbone.entity;

public class Model {
	private String name;
	private String age;

	public Model(String name, String age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * nameを取得します。
	 * @return name
	 */
	public String getName() {
	    return name;
	}
	/**
	 * nameを設定します。
	 * @param name name
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
	 * ageを取得します。
	 * @return age
	 */
	public String getAge() {
	    return age;
	}
	/**
	 * ageを設定します。
	 * @param age age
	 */
	public void setAge(String age) {
	    this.age = age;
	}
}
