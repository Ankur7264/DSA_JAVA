package com.cdac.acts.QUEUE;

public class QueueUnderflowException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public QueueUnderflowException(String message) {
		super(message);
	}

}
