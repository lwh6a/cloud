package com.lwh.userclient.util;

/**
 * @author <a href="mailto:liuwenhao@fenxiangbuy.com">刘文豪</a>
 * @since 2021/4/25
 */

public class MyLinked<T> {

    // 【双向】链表翻转：
    //如：1、2、3、4、5、6、7、8、9、10
    //输出结果：10、9、8、7、6、5、4、3、2、1
    //如：a、b、c、d
    //输出结果：d、c、b、a

    private transient int size = 0;
    private transient Node<T> frist = null;
    private transient Node<T> end = null;

    public void addFirst(T t){
        Node<T> oldFirst = frist;
        Node<T> tNode = new Node<>(t, oldFirst, null);
        frist = tNode;
        if (oldFirst == null) {
            end = tNode;
        }else {
            oldFirst.setPrev(tNode);
        }
        size++;

    }

    public Object[] toArray(){
        Object[] res = new Object[size];
        int i = 0;
        Node<T> node = frist;
        while (node != null){
            res[i++] = node.getT();
            node = node.getNext();
        }
        return res;
    }

    public void revert(){
        if (frist == null || end == null) {
            return;
        }
        Node<T> node = this.frist;
        Node<T> prev;
        Node<T> next;
        Node<T> newFirst = null;
        Node<T> newEnd = null;
        while (node != null){
            prev = node.getPrev();
            next = node.getNext();

            if (prev == null) {
                newEnd = node;
            }else {
                newFirst = node;
            }
            node.setNext(prev);
            node.setPrev(next);

        }

        frist = newFirst;
        end = newEnd;

    }

}


