package com.cdac.acts.queue;

public interface Queue<T> {
    void enqueue(T item) throws QueueException;
    T dequeue() throws QueueException;
    T front() throws QueueException;
    boolean isEmpty();
    int size();
}