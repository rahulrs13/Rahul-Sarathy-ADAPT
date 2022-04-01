package com.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class securityconfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("$2a$10$ckoYm50CPgBu6UClybgHQOzB0A4TxSByHutrrvo3ITNSHCXUn4h1q").roles("USER").and()
		.withUser("admin").password("$2a$10$4mssCS8SlaGWwjcTiBZ8BuQVI9tpmVGC9RyXueAygzwpuO1V0ycSa").roles("ADMIN");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
	http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN")
	.antMatchers("/user").hasAnyRole("USER","ADMIN")
	.antMatchers("/").permitAll()
	.and().rememberMe().key("rem-me-key").rememberMeParameter("remember").rememberMeCookieName("remebercokkie")
	.and().formLogin();
	}
	
}
