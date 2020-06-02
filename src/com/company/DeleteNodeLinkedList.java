package com.company;

public class DeleteNodeLinkedList {

    // Accepted
    public void deleteNode(ListNode node) {
        if(node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
