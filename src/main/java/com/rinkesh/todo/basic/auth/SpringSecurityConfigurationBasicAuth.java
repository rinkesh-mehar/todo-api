// package com.rinkesh.todo.basic.auth;
//
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.annotation.Order;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
// @Configuration
// @Order(1000)
// @EnableWebSecurity
// public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter
// {
// 	@Override
// 	protected void configure(HttpSecurity http) throws Exception
// 	{
// 		http
// 				.csrf().disable()// this is force post and put request. disabling for option in response
// 				.authorizeRequests()
// 				.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()// this use to permit all the option request and block the other
// 				.anyRequest()
// 				.authenticated()
// 				.and()
// 				// .formLogin()
// 				// .and()
// 				.httpBasic(); // for other request we allowed to use basic http authentication
// 	}
// }
