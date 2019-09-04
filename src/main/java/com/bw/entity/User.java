package com.bw.entity;

/**
 * @author 武文浩
 *
 * 2019年9月4日
 */
public class User {
	private Integer uid;
	private String uname;
	private String phone;
	public User(Integer uid, String uname, String phone) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.phone = phone;
	}
	public User() {
		super();
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", phone=" + phone
				+ "]";
	}
	
	

}
