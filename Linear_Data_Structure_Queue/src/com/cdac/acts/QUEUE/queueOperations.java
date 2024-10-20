package com.cdac.acts.QUEUE;

public class queueOperations {
	public static void main(String[] args)  {
		Queue queue = new QueueOfStrings(args.length);

		for (String arg : args) {
			try {
				queue.enqueue(arg);
			} catch (QueueOverflowException e) {
				e.printStackTrace();
			}
		}

		while (!queue.isEmpty()) {
			try {
				System.out.print(queue.dequeue() + " ");
			} catch (QueueUnderflowException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");

		for (String arg : args) {
			try {
				queue.enqueue(arg);
			} catch (QueueOverflowException e) {
				e.printStackTrace();
			}
		}
	}

}
