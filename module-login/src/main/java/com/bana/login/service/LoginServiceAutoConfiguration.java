package com.bana.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bana.login.service.LoginService;

@Configuration
@EnableConfigurationProperties(LoginServiceProperties.class)
@ConditionalOnClass(LoginService.class)
@ConditionalOnProperty(prefix="bx",value="enabled",matchIfMissing=true)
public class LoginServiceAutoConfiguration {
	
	@Autowired
	private LoginServiceProperties loginServiceProperties;

	@Bean
	@ConditionalOnMissingBean(LoginService.class)
	public LoginService loginService(){
		LoginService helloService = new LoginService();
		helloService.setLoginPage(loginServiceProperties.getLoginPage());
		helloService.setHomePage(loginServiceProperties.getHomePage());
		return helloService;
	}

	public void setHelloServiceProperties(LoginServiceProperties loginServiceProperties) {
		this.loginServiceProperties = loginServiceProperties;
	}
	
}
