package dataStructure;


/**
 * Created by tubangwu on 2018/7/25.
 *
 * 后进先出 栈
 * public class Stack(Item) implementsIterable<Item>
 *    Stack() 创建空栈
 *    void push(Itme item) 添加一个元素
 *    Item pop() 删除最近添加的元素
 *    boolean isEmpty() 栈是否为空
 *    int size()  栈中的元素数量
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
