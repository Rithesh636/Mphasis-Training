package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
	protected UserDetailsService userDetailService() {
			
		UserDetails user = User.builder().username("USER").password(passwordEncoder().encode("abc123")).roles("USER").build();
		
		UserDetails admin = User.builder().username("ADMIN").password(passwordEncoder().encode("java")).roles("ADMIN","USER").build();
		
		UserDetails Employee = User.builder().username("Employee").password(passwordEncoder().encode("abc123")).roles("HR","Employee").build();
		
		UserDetails hr = User.builder().username("HR").password(passwordEncoder().encode("java")).roles("HR").build();
		
		return new InMemoryUserDetailsManager(user,admin,hr,Employee);
	}
	
	@Bean
	protected PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) {
		return http.csrf(AbstractHttpConfigurer :: disable)			// csrf disable : this policy aims to prevent disabling of cross site request forgery for web App
				.authorizeHttpRequests(request -> 
				request.requestMatchers("/login")  //first everyone has to come to this page
				.permitAll()
				.requestMatchers("/")
				.hasAnyAuthority("ROLE_ADMIN","ROLE_USER","ROLE_HR","ROLE_EMPLOYEE")
				.requestMatchers("/user/read")
				.hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
				.requestMatchers("/user/hr/**")
				.hasAnyAuthority("ROLE_HR","ROLE_EMPLOYEE")
				.anyRequest()
				.authenticated()
				)
		.formLogin(form -> 
			form.loginPage("/login")
			.defaultSuccessUrl("/")
			.failureUrl("/login?error=true")
			.permitAll())
		.logout(config -> config.logoutUrl("/logout")
						.logoutSuccessUrl("/login")
						)
				.build();
				
	}
}
