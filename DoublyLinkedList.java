package com.practice;

import org.w3c.dom.Node;

public class DoublyLinkedList {
    private class Node{
       private int value;
       private Node prv;
       private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    public void addFirst(int item){
        var node = new Node(item);
        if(first == null){
            first = last = node;
            return;
        }
        first.prv = node;
        node.next = first;
        first = node;

    }
    public void addLast(int item){
        var node = new Node(item);
        var current = first;
        if(first == null){
            first=last=node;
            return;
        }
        while (current.next!=null){
            current = current.next;
        }
        current.next = node;
        node.prv = current;
        last = node;
    }
    public void add(int item, int data){
        var node = new Node(item);
        var current = first;
        while (current!= null && current.value!=data){
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
        node.prv = current;

    }
    public void print(){
        var current = first;
        while (current!=null) {
            System.out.print(current.value+",");
            current = current.next;
        }
        System.out.println();
    }
    public void delete(int item){
        var delnode = first;
        if(first==null){
            System.out.println("Empty List");
            return;
        }
        while (delnode != null && delnode.value != item){
            delnode = delnode.next;
        }
        if(delnode==first){
            first = delnode.next;
            first.prv = null;
            return;
        }else if(delnode.next == null){
            delnode.prv.next=null;
            delnode.prv = null;
            delnode.prv = last;
            return;
        }else {
            delnode.prv.next = delnode.next;
            delnode.prv = delnode.next.prv;
            return;
        }
    }
}
