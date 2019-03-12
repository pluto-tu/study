package dataStructure;

import dataStructure.tree.Node;
import test.Tree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;


/**
 * Created by tubangwu on 2018/7/13.
 *
 *
 * 先进先出 队列
 *
 * public class Queue(Item) implements Iterable<Item>
 *     Queue() 创建空队列
 *     void enquene(Item item) 添加一个元素
 *     Itme deenque(） 删除最早店家的元素
 *     boolean isEmpty() 队列是否为空
 *     int size()  队列中的元素数量
 *
 * @author tubangwu
 */
public class QueueStudy<Item> {

    /**
     * 二叉树按层遍历
     */


    public void printNodeData(Node node){
        System.out.println(node.getData()+"-");
    }



    /**
     * 树形结构
     */
    public static class TreeNode {
        int val;
        Tree.TreeNode left;
        Tree.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
