package net.yangwenxin.dsa;

public interface Iterator {

    /**
     * 检查迭代器中是否还有剩余的元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 返回迭代器中的下一元素
     *
     * @return
     */
    Object getNext();
}
