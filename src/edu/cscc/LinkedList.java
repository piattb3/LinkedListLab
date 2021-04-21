package edu.cscc;
//LinkedList must be type that is instantiated, we use the diamond operatore to do this.
public class LinkedList<E> {
    private Node head;

    public LinkedList() {
        head = null;
    }

    //Changed object to generic type E. E must be same type used to instantiate linked list.
    public void addFirst(E content) {
        Node ptr = head;
        head = new Node(content,ptr);
    }

    //Changed object to generic type E. E must be same type used to instantiate linked list.
    public void addLast(E content) {
        Node last = new Node(content,null);
        if (head == null) {
            head = last;
        } else {
            Node ptr = head;
            while(ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(last);
        }
    }

    public boolean deleteFirst() {
        if (head == null) {
            return false;
        } else {
            head = head.getNext();
            return true;
        }
    }

    public boolean deleteLast() {
        if (head == null) {
            return false;
        }
        else if (head.getNext() == null) {
            head = null;
            return true;
        } else {
            Node ptr = head;
            while (ptr.getNext().getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(null);
            return true;
        }
    }

    public Node getHead() {
        return head;
    }

    public String toString() {
        String str;
        if (head == null) {
            str = "<empty>";
        } else {
            Node ptr = head;
            str = "("+ptr.getContent().toString()+")";
            while(ptr.getNext() != null) {
                str = str + "->";
                ptr = ptr.getNext();
                str = str + "(" + ptr.getContent().toString() + ")";
            }
        }
        return str;
    }
}
