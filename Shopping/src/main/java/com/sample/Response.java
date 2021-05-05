package com.sample;

public class Response 

{
	private String status;
	private String message;
	
	

	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public void setMessage(String message) 
	{
		this.message = message;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + "]";
	}
	
	
	
}
