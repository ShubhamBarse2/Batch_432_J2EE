package com.tka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService secured() {

		UserDetails user = User.withDefaultPasswordEncoder().username("om").password("Om@123").roles("USER").build();
		UserDetails seller = User.withDefaultPasswordEncoder().username("ram").password("Ram@123").roles("USER")
				.build();
		UserDetails admin = User.withDefaultPasswordEncoder().username("rahul").password("rahul@123").roles("ADMIN")
				.build();

		return new InMemoryUserDetailsManager(user, seller, admin);
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> auth

				.requestMatchers(HttpMethod.GET, "/user").hasAnyRole("USER", "SELLER", "ADMIN")

				.requestMatchers(HttpMethod.POST, "/admin").hasRole("SELLER")

				.requestMatchers(HttpMethod.PUT, "/home").hasRole("ADMIN")

				.anyRequest().authenticated()).httpBasic(null);

		return http.build();
	}

}
