package com.rinkesh.todo.hello;

public class GetBean
{
	private final String message;
	private final String name;

	GetBean(String message, String name)
	{
		this.message = message;
		this.name = name;
	}

	public GetBean(final String name)
	{
		this.name = name;
		message = null;
	}

	public String getMessage()
	{
		return message;
	}

	public String getName()
	{
		return name;
	}

}
