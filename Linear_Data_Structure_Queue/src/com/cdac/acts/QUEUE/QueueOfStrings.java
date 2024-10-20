package com.cdac.acts.QUEUE;

public class QueueOfStrings implements Queue {
	
	private String[] queueData;
	private int front;
	private int rear;

	public QueueOfStrings(int n) {
		queueData = new String[n];
		front = -1;
		rear = -1;
	}

	@Override
	public void enqueue(String element) throws QueueOverflowException {
		if (isFull()) {
			throw new QueueOverflowException("Queue is full. Failed to enqueue.");
		}

		++rear;
		queueData[rear] = element;
	}

	@Override
	public String dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException("Queue is empty. Failed to dequeue.");
		}

		++front;
		String result = queueData[front];
		queueData[front] = null; // Remove element.
		return result;
	}

	@Override
	public boolean isEmpty() {
		if (front == rear) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if (rear == (queueData.length - 1)) {
			return true;
		}
		return false;
	}

}
