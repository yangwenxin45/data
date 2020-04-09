package net.yangwenxin.dsa;

public class Queue_List implements Queue {

    /**
     * 指向表首元素
     */
    protected Node head;

    /**
     * 指向表末元素
     */
    protected Node tail;

    /**
     * 队列中元素的数目
     */
    protected int size;

    public Queue_List() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (0 == size) ? true : false;
    }

    @Override
    public Object front() throws ExceptionQueueEmpty {
        if (isEmpty()) {
            throw new ExceptionQueueEmpty("意外：队列空");
        }
        return head.getElem();
    }

    @Override
    public void enqueue(Object obj) throws ExceptionQueueFull {
        Node node = new Node(obj, null);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;    // 更新指向末节点引用
        size++;
    }

    @Override
    public Object dequeue() throws ExceptionQueueEmpty {
        if (0 == size) {
            throw new ExceptionQueueEmpty("意外：队列空");
        }
        Object obj = head.getElem();
        head = head.getNext();
        size--;
        if (0 == size) {
            tail = null;    // 若队列为空，须将末节点引用置空
        }
        return obj;
    }

    @Override
    public void Traversal() {
        Node p = head;
        while (null != p) {
            System.out.println(p.getElem() + " ");
            p = p.getNext();
        }
    }
}
