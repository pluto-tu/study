package dataStructure.tree;


import org.apache.commons.collections.CollectionUtils;

import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by tubangwu on 2018/1/27.
 *
 * 二叉树的遍历
 *
 * @author tubangwu
 */
public class Tree {


    /**
     * 树形结构
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode init() {
        TreeNode D = new TreeNode(4, null, null);
        TreeNode E = new TreeNode(5, null, null);
        TreeNode F = new TreeNode(6, null, null);
        TreeNode G = new TreeNode(7, null, null);

        TreeNode B = new TreeNode(2, D, E);
        TreeNode C = new TreeNode(3, F, G);
        TreeNode A = new TreeNode(1, B, C);
        return A;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode treeNode = tree.init();
        //Queue<TreeNode> traverse = traverse(root);
        //System.out.println(traverse.size());

        layer(treeNode);

    }


    public static void printData(TreeNode treeNode) {
        System.out.print(treeNode.val + "--");
    }

    /**
     *前序遍历
      * @param treeNode
     */
    public static void topOrder(TreeNode treeNode) {
        printData(treeNode);
        if (Objects.nonNull(treeNode.left)) {
            topOrder(treeNode.left);
        }
        if (Objects.nonNull(treeNode.right)) {
            topOrder(treeNode.right);
        }
    }

    /**
     *中序遍历
     * @param treeNode
     */
    public static void midOrder(TreeNode treeNode) {
        if (Objects.nonNull(treeNode.left)) {
            midOrder(treeNode.left);
        }
        printData(treeNode);
        if (Objects.nonNull(treeNode.right)) {
            midOrder(treeNode.right);
        }
    }

    /**
     *后序遍历
     * @param treeNode
     */
    public static void lastOrder(TreeNode treeNode) {
        if (Objects.nonNull(treeNode.left)) {
            lastOrder(treeNode.left);
        }
        if (Objects.nonNull(treeNode.right)) {
            lastOrder(treeNode.right);
        }
        printData(treeNode);
    }


    /**
     *层次遍历
     * @param treeNode
     */
    public static void layer(TreeNode treeNode) {
        Objects.requireNonNull(treeNode);
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);
        TreeNode treeNodePoll;
        while (CollectionUtils.isNotEmpty(queue)) {
            treeNodePoll = queue.poll();
            System.out.print(treeNodePoll.val + "--");
            if (Objects.nonNull(treeNodePoll.left)) {
                queue.offer(treeNodePoll.left);
            }
            if (Objects.nonNull(treeNodePoll.right)) {
                queue.offer(treeNodePoll.right);
            }
        }


    }


}
