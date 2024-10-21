package com.cdac.acts.queue;


public class Main {
    public static void main(String[] args) {
        try {
            Queue<Integer> queue = new LinkedListQueue<>();
            
            System.out.println("Enqueueing elements...");
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            
            System.out.println("Front element: " + queue.front());
            System.out.println("Queue size: " + queue.size());

            System.out.println("Dequeuing elements...");
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            
            System.out.println("Front element: " + queue.front());
            System.out.println("Queue size: " + queue.size());

            System.out.println("Enqueueing more elements...");
            queue.enqueue(5);
            queue.enqueue(6);
            
            System.out.println("Front element: " + queue.front());
            System.out.println("Queue size: " + queue.size());

        } catch (QueueException e) {
            e.printStackTrace();
        }
    }
}
