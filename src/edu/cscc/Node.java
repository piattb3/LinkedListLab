package edu.cscc;

//Change node to use type T using diamond operator. Node must be same type
//used to instantiate linked list.
public class Node<T> {
    //Changed Object to T to make it type safe.
    //T must be same type used to instantiate linked list.
    private T content;
    private Node next;

    //Argument content was changed from Object to type T.
    //content must be same type as linked list was instantiated with.
    public Node(T content, Node next) {
        this.content = content;
        this.next = next;
    }

    //Changed type from Object to T
    //Must be same type as linked list was instantiated with.
    public T getContent() {
        return content;
    }

    //Content type changed from Object to T
    //Must be same type as linked list was instantiated with.
    public void setContent(T content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
