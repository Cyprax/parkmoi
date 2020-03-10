package ci.parkmoi.security;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ci.parkmoi.model.User;
import ci.parkmoi.repository.UserRepository;

@Service
public class DbInit implements CommandLineRunner {

	@Autowired private UserRepository userRepository;
	@Autowired private PasswordEncoder passwordEncoder;
	
	public DbInit(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.deleteAll();
		
		User user1 = new User("user", "user@parkmoi.ci", passwordEncoder.encode("user"), "USER", "");
		User user2 = new User("admin", "admin@parkmoi.ci", passwordEncoder.encode("admin"), "ADMIN", "");
		
		List<User> users = Arrays.asList(user1, user2);
		this.userRepository.saveAll(users);
	}

}
