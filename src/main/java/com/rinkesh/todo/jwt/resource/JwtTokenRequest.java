package com.rinkesh.todo.jwt.resource;


import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

	private String username;
	private String password;

	// {
	// 	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU5MjEzNTU4MSwiaWF0IjoxNTkxNTMwNzgxfQ.9gGwqbWtKlZfSAtPG1w5wHxQX-FGfdx7XHT-FYHdzF3Ij87BwzvLFUN-tXW6Amg5BnDvlM362bI_g__fnfbpog"
	// }

	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
