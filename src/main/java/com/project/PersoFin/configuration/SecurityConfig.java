package com.project.PersoFin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		
//		httpSecurity.csrf().disable()
//		.authorizeHttpRequests()
//		.requestMatchers("/public")
//		.permitAll()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.formLogin();
		httpSecurity
		  .csrf((csrf)->csrf.disable())
		  .authorizeHttpRequests((authorize) -> {
		    authorize
		      .requestMatchers("/public")
		        .permitAll()
		      .anyRequest()
		        .authenticated();
		  })

		  .formLogin();
		return httpSecurity.build();
	}
}
