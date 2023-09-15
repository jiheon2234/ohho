package com.jiheon.demo;

import com.jiheon.demo.model.User;
import com.jiheon.demo.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication {

	private final UserRepository userRepository;

	private final PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<User> userList = List.of(
				User.builder()
						.email("jiheon2234")
						.password(passwordEncoder.encode("0000"))
						.name("jiheon")
						.build()
		);
		userRepository.saveAll(userList);
	}
}
