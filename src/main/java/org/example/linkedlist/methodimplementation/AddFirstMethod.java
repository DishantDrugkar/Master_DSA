package org.example.linkedlist.methodimplementation;

public class AddFirstMethod {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public static void main(String[] args) {
         AddFirstMethod ll = new AddFirstMethod();
         ll.addFirst(3);
         ll.addFirst(2);
         ll.addFirst(1);
        System.out.println(ll);
    }
}
