package com.integrador.igrejasonline.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * @param msg
	 */
	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	/**
	 * @param msg
	 * @param cause
	 */
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}