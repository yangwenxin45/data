package net.yangwenxin.dsa;

public class Node implements Position {

    /**
     * 数据对象
     */
    private Object element;
    /**
     * 指向后继节点
     */
    private Node next;

    public Node() {
        this(null, null);
    }

    public Node(Object e, Node n) {
        element = e;
        next = n;
    }

    @Override
    public Object getElem() {
        return element;
    }

    @Override
    public Object setElem(Object e) {
        Object oldElem = element;
        element = e;
        return oldElem;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }
}
