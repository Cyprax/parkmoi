package ci.parkmoi.security.jwt;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ci.parkmoi.model.User;
import ci.parkmoi.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired UserRepository userRepository;
	
	@Override
	public JwtUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//username or email
		Optional<User> user = userRepository.findByUsername(username);
		user.orElseThrow( () -> new UsernameNotFoundException("Not found: " + username) );
		return user.map(JwtUserDetails::new).get();
	}
	
}
