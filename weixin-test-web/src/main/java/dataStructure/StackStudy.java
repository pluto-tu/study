package dataStructure;


/**
 * Created by tubangwu on 2018/7/25.
 *
 * @author tubangwu
 */
public class StackStudy<Item> {
    /**
     * 栈顶（最近添加的元素）
     */
    private Node first;
    private int n;

    /**
     * 定义节点的嵌套类
     */
    private class Node {
        Item item;
        Node next;
    }

    public int size() {
        return n;
    }

    /**
     * 从栈顶删除元素
     */
    public Item pop() {
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }

    /**
     * 从栈顶添加元素
     */
    public void push() {
        Node oldFirst = first;
        first = new Node();
        first.next = oldFirst;
        n++;
    }

}
