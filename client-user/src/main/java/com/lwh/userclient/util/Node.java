package com.lwh.userclient.util;

/**
 * @author <a href="mailto:liuwenhao@fenxiangbuy.com">刘文豪</a>
 * @since 2021/4/25
 */

public class Node<T> {

    private T t;
    private Node<T> next;
    private Node<T> prev;

    public Node(T t, Node<T> next, Node<T> prev) {
        this.t = t;
        this.next = next;
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
