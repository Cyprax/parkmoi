package ci.parkmoi.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ci.parkmoi.model.User;
import ci.parkmoi.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//username or email
		Optional<User> user = userRepository.findByUsername(username);
		user.orElseThrow( () -> new UsernameNotFoundException("Not found: " + username) );
		return user.map(MyUserDetails::new).get();
	}

}
