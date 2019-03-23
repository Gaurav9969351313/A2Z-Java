package com.example.RestService;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
		String hashedPassword = enc.encode("nitishpatil");
		System.out.println(hashedPassword);
	}

}
