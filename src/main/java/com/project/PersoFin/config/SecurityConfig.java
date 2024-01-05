//package com.project.PersoFin.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//        .authorizeHttpRequests((authz) -> authz
//            .anyRequest().authenticated()
//        ).formLogin()
//        .loginPage("/login")
//        .permitAll()
//        .and()
//    .logout()
//        .permitAll();
//    return http.build();
//	}
//	
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//            .inMemoryAuthentication()
//                .withUser("username")
//                .password(passwordEncoder().encode("hello123"))
//                .roles("USER");
//    }
//}
