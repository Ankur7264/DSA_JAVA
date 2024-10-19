package com.cdac.acts.STACK;

public interface Stack {
	void push (int element) throws StackOverflowException ;
	int pop() throws StackUnderflowException;
	int peek() throws StackUnderflowException;
	boolean isEmpty();
	boolean isFull();

}
