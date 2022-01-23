package com.login.MyLoginSpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class MyLoginSpringSecurityApplication {

	public static void main(String[] args) {

		// линк към видеото - https://www.youtube.com/watch?v=lA18U8dGKF8

		SpringApplication.run(MyLoginSpringSecurityApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		return NoOpPasswordEncoder.getInstance();
	}

}
