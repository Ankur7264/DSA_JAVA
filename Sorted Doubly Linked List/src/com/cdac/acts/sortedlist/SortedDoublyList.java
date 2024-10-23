package com.cdac.acts.sortedlist;

public class SortedDoublyList implements SortedDList {
    private Node head;
    private Node tail;

    public SortedDoublyList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void delete(int element) {
        if (head == null) {
            return;
        }

        if (head.data == element) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        Node current = head;
        while (current != null && current.data != element) {
            current = current.next;
        }

        if (current != null) {
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }
    }

    @Override
    public void deleteAll(int element) {
        while (head != null && head.data == element) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }

        Node current = head;
        while (current != null) {
            if (current.data == element) {
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
            }
            current = current.next;
        }
    }

    @Override
    public boolean search(int element) {
        Node current = head;
        while (current != null) {
            if (current.data == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Additional utility method to insert elements in sorted order
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        newNode.prev = current;
        current.next = newNode;
    }

    // Utility method to print the doubly linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SortedDoublyList list = new SortedDoublyList();
        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(30);
        list.insert(20);
        list.insert(40);

        System.out.print("Original List: ");
        list.printList();

        list.delete(20);
        System.out.print("List after deleting first occurrence of 20: ");
        list.printList();

        list.deleteAll(20);
        System.out.print("List after deleting all occurrences of 20: ");
        list.printList();

        System.out.println("Search for 30: " + list.search(30));
        System.out.println("Search for 50: " + list.search(50));
    }
}
