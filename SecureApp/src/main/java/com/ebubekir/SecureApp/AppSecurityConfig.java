package com.ebubekir.SecureApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
//@EnableOAuth2Sso
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	// This is for DB auth
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());

		return provider;
	}

	//This is to use outh2 for google accounts
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.csrf().disable().authorizeRequests().antMatchers("/login").permitAll().anyRequest().authenticated();
//
//	}

	// This is for without DB auth.
//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() {
//		
//		List<UserDetails> users = new ArrayList<>();
//		users.add(User.withDefaultPasswordEncoder().username("ebu").password("1234").roles("USER").build());
//		
//		return new InMemoryUserDetailsManager(users);
//	}

}
