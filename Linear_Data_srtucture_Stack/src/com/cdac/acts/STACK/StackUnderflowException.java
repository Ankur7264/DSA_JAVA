package com.cdac.acts.STACK;

public class StackUnderflowException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public StackUnderflowException(String message) {
        super(message);
    }
}