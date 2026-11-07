package org.example.linkedlist.leetcode;

public class Leetcode_234_PalindromeLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
      Node list = new Node(1);
      list.next = new Node(2);
      list.next.next = new Node(3);
      list.next.next.next = new Node(3);
      list.next.next.next.next = new Node(2);
      list.next.next.next.next.next = new Node(1);

        System.out.println(isPalindrome(list));
    }

    public static boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }

        // step 1 : find middle
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // step 2 : Reverse the second half
        Node prev = null;
        Node curr = slow;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3 : Compare
        Node first = head;
        Node second = prev;
        while(second != null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
