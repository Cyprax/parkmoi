package ci.parkmoi.security.jwt;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = 7789991641504936379L;
	private final String jwttoken;
	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	public String getToken() {
		return this.jwttoken;
	}

}
