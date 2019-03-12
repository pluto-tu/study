package dataStructure;

/**
 * Created by tubangwu on 2019-03-12.
 *
 * @author tubangwu
 */
public class Queue<Item> {

    private int size;
    private Node first;
    private Node last;

    class Node{
        Item it;
        Node next;
    }

    public void enquene(Item it){
        Node newNode = new Node();
        newNode.it = it;
        if(first == last && first == null){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        size++;

    }

    public Item dequene(){
        if (first == null)  return null;
        Item it;
        if (first == last){
            it = first.it;
            first = first.next;
            last = null;
        }else{
            it = first.it;
            first = first.next;
        }
        size--;
        return it;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return first == last && first == null;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();


    }
}
