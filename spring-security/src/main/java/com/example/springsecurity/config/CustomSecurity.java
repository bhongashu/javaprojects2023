package com.example.springsecurity.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class CustomSecurity{

    @Bean
    UserDetailsService getUserDetails(PasswordEncoder encoder) {
		
		UserDetails ADMIN= User.withUsername("Ashwini")
								.password(encoder.encode("pass"))
								.roles("ADMIN")
								.build();
		
		UserDetails USER= User.withUsername("Ashwini")
				.password(encoder.encode("pass"))
				.roles("USER")
				.build();
		
		
		return new InMemoryUserDetailsManager(ADMIN,USER);
	}

    @Bean
    PasswordEncoder getPasswordEncoder(){
		
		return new BCryptPasswordEncoder();
	}

    @Bean
    SecurityFilterChain webSecurity(HttpSecurity http) throws Exception {
		
		return http
                .authorizeHttpRequests()
                .requestMatchers("/Welcome")
                .permitAll()
                .and()
                .authorizeHttpRequests()
                .requestMatchers("/customer/**")
                .authenticated()
                .and()
                .formLogin(withDefaults())
                .build();	
	}

}
