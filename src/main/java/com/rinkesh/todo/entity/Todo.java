package com.rinkesh.todo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username")
	private String userName;

	@Column(name = "description")
	private String description;

	@Column(name = "targetdate")
	private Date targetDate;

	@Column(name = "isdone")
	private boolean isDone;

	protected Todo()
	{

	}

	public Todo(final long id, final String userName, final String description, final Date targetDate, final boolean isDone)
	{
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(final Long id)
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
