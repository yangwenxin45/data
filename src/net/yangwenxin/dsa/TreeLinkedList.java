package net.yangwenxin.dsa;

public class TreeLinkedList implements Tree {

    /**
     * 树根节点
     */
    private Object element;

    /**
     * 父亲、长子及最大的弟弟
     */
    private TreeLinkedList parent, firstChild, nextSibling;

    /**
     * 单结点树构造方法
     */
    public TreeLinkedList() {
        this(null, null, null, null);
    }

    /**
     * 全参数构造方法
     *
     * @param e
     * @param p
     * @param c
     * @param s
     */
    public TreeLinkedList(Object e, TreeLinkedList p, TreeLinkedList c, TreeLinkedList s) {
        element = e;
        parent = p;
        firstChild = c;
        nextSibling = s;
    }

    @Override
    public Object getElem() {
        return element;
    }

    @Override
    public Object setElem(Object obj) {
        Object bak = element;
        element = obj;
        return bak;
    }

    @Override
    public TreeLinkedList getParent() {
        return parent;
    }

    @Override
    public TreeLinkedList getFirstChild() {
        return firstChild;
    }

    @Override
    public TreeLinkedList getNextSibling() {
        return nextSibling;
    }

    @Override
    public int getSize() {
        int size = 1;   // 当前节点也是后代节点
        TreeLinkedList subTree = firstChild;
        while (null != subTree) {
            size += subTree.getSize();  // 把所有子树规模累加起来
            subTree = subTree.getNextSibling();
        }
        return size;
    }

    @Override
    public int getHeight() {
        int height = -1;
        TreeLinkedList subtree = firstChild;
        while (null != subtree) {
            height = Math.max(height, subtree.getHeight()); // 找出所有子树最大高度
            subtree = subtree.getNextSibling();
        }
        return height + 1;
    }

    @Override
    public int getDepth() {
        int depth = 0;
        TreeLinkedList p = parent;
        while (null != p) {
            depth++;
            p = p.getParent();
        }
        return depth;
    }
}
