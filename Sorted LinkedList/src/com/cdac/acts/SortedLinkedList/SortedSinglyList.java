package com.cdac.acts.SortedLinkedList;


public class SortedSinglyList implements SortedList {
    private Node head;

    public SortedSinglyList() {
        this.head = null;
    }

    @Override
    public void delete(int element) {
        if (head == null) {
            return;
        }

        if (head.data == element) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != element) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    @Override
    public void deleteAll(int element) {
        while (head != null && head.data == element) {
            head = head.next;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == element) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
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
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Utility method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SortedSinglyList list = new SortedSinglyList();
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
