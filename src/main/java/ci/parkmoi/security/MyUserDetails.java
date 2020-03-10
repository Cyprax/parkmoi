package ci.parkmoi.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import ci.parkmoi.model.User;

public class MyUserDetails implements UserDetails {

	private static final long serialVersionUID = 4582838062604264629L;
	private User user;

	public MyUserDetails() {
	}
	public MyUserDetails(User user) {
		this.user = user;
		/*this.authorities = Arrays.stream(user.getRoles().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());*/
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		this.user.getPermissionList().forEach(p -> {
			GrantedAuthority authority = new SimpleGrantedAuthority(p);
			authorities.add(authority);
		});
		
		this.user.getRoleList().forEach(r -> {
			GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + r);
			authorities.add(authority);
		});

		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		return this.user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return this.user.isActive();
	}

}
