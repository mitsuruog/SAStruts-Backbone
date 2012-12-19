package com.mitsuruog.proto.seaser.backbone.dto;

public class UserDto {

	private int id;
	private String authority;
	/**
	 * idを取得します。
	 * @return id
	 */
	public int getId() {
	    return id;
	}
	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(int id) {
	    this.id = id;
	}
	/**
	 * authorityを取得します。
	 * @return authority
	 */
	public String getAuthority() {
	    return authority;
	}
	/**
	 * authorityを設定します。
	 * @param authority authority
	 */
	public void setAuthority(String authority) {
	    this.authority = authority;
	}



}
