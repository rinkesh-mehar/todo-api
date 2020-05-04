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

	public String getMessage()
	{
		return message;
	}

	public String getName()
	{
		return name;
	}

}
