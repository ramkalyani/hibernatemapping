package com.zensar.exceptions;

public class ServiceException  extends Exception{
	
	public class getMessage extends Exception {

	}

	public String errorMessage;
	
	public ServiceException()
	{
		errorMessage ="error: service exception";
	}

	public ServiceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "UserServiceException [errorMessage=" + errorMessage + "]";
	}

}
