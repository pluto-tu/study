package test;


import dataStructure.tree.BinaryTree;
import dataStructure.tree.Node;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * Created by tubangwu on 2018/1/27.
 *
 * @author tubangwu
 */
public class Tree {

    /**
     * 按层遍历
     */
    public static Queue<TreeNode> traverse(TreeNode treeNode) {
        if (treeNode == null){ return null;
        }
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(treeNode);
        TreeNode currentNode;
        while (!list.isEmpty()) {
            currentNode = list.poll();
            System.out.println(currentNode.val);
            if (currentNode.left != null) {
                list.add(currentNode.left);
            }
            if (currentNode.right != null) {
                list.add(currentNode.right);
            }
        }

        return list;
    }


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
        TreeNode root = tree.init();
        Queue<TreeNode> traverse = traverse(root);
        System.out.println(traverse.size());

    }


}
