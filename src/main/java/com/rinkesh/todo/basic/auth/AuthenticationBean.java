package com.rinkesh.todo.basic.auth;

public class AuthenticationBean
{
	private String message;

	public AuthenticationBean(final String message)
	{
		this.message = message;
	}

	public void setMessage(final String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}
}
