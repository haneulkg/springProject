package com.spring.sExam.exam1211;

public class Test2Infor {
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public Test2Infor() {}

	// 생성자 통해 값 주입
	public Test2Infor(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	// setter 통해 값 주입
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
