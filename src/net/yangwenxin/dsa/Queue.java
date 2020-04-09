package net.yangwenxin.dsa;

public interface Queue {

    /**
     * 返回队列中元素数目
     *
     * @return
     */
    int getSize();

    /**
     * 判断队列是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 取队首元素(但不删除)
     *
     * @return
     */
    Object front() throws ExceptionQueueEmpty;

    /**
     * 入队
     *
     * @param obj
     */
    void enqueue(Object obj) throws ExceptionQueueFull;

    /**
     * 出队
     */
    Object dequeue() throws ExceptionQueueEmpty;

    /**
     * 遍历
     */
    void Traversal();

}
