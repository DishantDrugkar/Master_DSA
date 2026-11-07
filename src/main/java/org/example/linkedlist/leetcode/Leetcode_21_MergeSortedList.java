package org.example.linkedlist.leetcode;

import java.util.LinkedList;

public class Leetcode_21_MergeSortedList {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
       Node list1 = new Node(1);
       list1.next = new Node(2);
       list1.next.next = new Node(4);

       Node list2 = new Node(2);
       list2.next = new Node(3);
       list2.next.next = new Node(4);

        Node result = mergeSortedList(list1, list2);
        printLL(result);

    }
    public static Node mergeSortedList(Node list1, Node list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1. val < list2.val){
            list1.next = mergeSortedList(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeSortedList(list1, list2.next);
            return list2;
        }
    }

    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
