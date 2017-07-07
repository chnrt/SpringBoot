package com.bana.login.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="bx")
public class LoginServiceProperties {

	private static final String LOGIN_PAGE = "/login";
	private static final String HOME_PAGE = "/home";

	private String loginPage = LOGIN_PAGE;
	private String homePage = HOME_PAGE;

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}
}
