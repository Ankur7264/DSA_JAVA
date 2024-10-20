package com.cdac.acts.QUEUE;

public interface Queue {
	
	void enqueue(String element) throws QueueOverflowException;
	String dequeue() throws QueueUnderflowException;
	boolean isEmpty();
	boolean isFull();
}
