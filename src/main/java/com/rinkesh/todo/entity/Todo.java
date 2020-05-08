package com.rinkesh.todo.entity;

import java.util.Date;

public class Todo
{
	private long id;
	private String userName;
	private String description;
	private Date targetDate;
	private boolean isDone;

	public Todo(final long id, final String userName, final String description, final Date targetDate, final boolean isDone)
	{
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public long getId()
	{
		return id;
	}

	public void setId(final long id)
	{
		this.id = id;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(final String userName)
	{
		this.userName = userName;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	public Date getTargetDate()
	{
		return targetDate;
	}

	public void setTargetDate(final Date targetDate)
	{
		this.targetDate = targetDate;
	}

	public boolean isDone()
	{
		return isDone;
	}

	public void setDone(final boolean done)
	{
		isDone = done;
	}


}
