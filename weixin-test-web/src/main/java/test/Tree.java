package test;


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
    public Queue<TreeNode> traverse(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if (Objects.isNull(treeNode)) {
            return null;
        } else {
            //根节点入队列
            queue.offer(treeNode);
            for (int i = 0; i < queue.size(); i++) {
                //队列第一根元素 先进入
                TreeNode temp = queue.poll();
                if (Objects.nonNull(temp.left)) {
                    queue.offer(temp.left);
                }

                if (Objects.nonNull(temp.right)) {
                    queue.offer(temp.right);
                }

            }
        }
        return queue;
    }

    /**
     * 树形结构
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


}
