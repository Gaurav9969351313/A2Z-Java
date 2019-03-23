package com.example.RestService.Jwt;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

	static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

	static {
		inMemoryUserList.add(new JwtUserDetails(1L, "gauravtalele",// dummy
				"$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e", "ROLE_USER_2"));
		inMemoryUserList.add(new JwtUserDetails(2L, "nitishpatil",// nitishpatil
				"$2a$10$ihHaGqKS0GpTSBxT4kp84OGbRYsRKgpBjtqg6VIoyOrDRtqYm6Rl", "ROLE_USER_2"));
		
		inMemoryUserList.add(new JwtUserDetails(3L, "kajaltalele", //password@123
				"$2a$10$NM85hSJRyuqIhCB8DH7PtufSP3Zrq.DuZlISyCHLbFSH92aeLRNFq", "ROLE_USER_2")); 
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
				.filter(user -> user.getUsername().equals(username)).findFirst();

		if (!findFirst.isPresent()) {
			throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}

		return findFirst.get();
	}

}