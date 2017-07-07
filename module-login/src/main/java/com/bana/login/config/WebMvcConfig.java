package com.bana.login.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.bana.login.service.LoginService;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	@Autowired
	LoginService loginService;
		
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController(loginService.getLoginPage())
			.setViewName("login");
	}
}
