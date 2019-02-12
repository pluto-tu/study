package dataStructure.tree;

import java.util.Objects;

/**
 * Created by tubangwu on 2018-12-05.
 *
 * @author tubangwu
 */
public class BinaryTree {

    public  Node init(){
        Node J = new Node(8,null,null);
        Node H = new Node(4,null,null);
        Node G = new Node(2,null,null);

        Node F = new Node(7,null,J);
        Node E = new Node(5,H,null);
        Node D = new Node(1,null,G);

        Node C = new Node(9,F,null);
        Node B = new Node(3,D,E);

        Node A = new Node(6,B,C);
        return A;
    }

    public void printNodeData(Node node){
        System.out.print(node.getData()+"-");
    }

    /**
     * 前序遍历 根 - 左 - 右
     * @param node
     */
    public void theFrontTraversal(Node node){
        printNodeData(node);
        if(Objects.nonNull(node.getLeftNode())){
            theFrontTraversal(node.getLeftNode());
        }
        if(Objects.nonNull(node.getRightNode())){
            theFrontTraversal(node.getRightNode());
        }
    }

    /**
     * 中序遍历 左 - 根 - 右
     * @param node
     */
    public void theMiddleTraversal(Node node){
        if(Objects.nonNull(node.getLeftNode())){
            theMiddleTraversal(node.getLeftNode());
        }
        printNodeData(node);
        if(Objects.nonNull(node.getRightNode())){
            theMiddleTraversal(node.getRightNode());
        }
    }

    /**
     * 后序遍历  左 - 右 - 根
     * @param node
     */
    public void theLaterTraversal(Node node){
        if(Objects.nonNull(node.getLeftNode())){
            theLaterTraversal(node.getLeftNode());
        }
        if(Objects.nonNull(node.getRightNode())){
            theLaterTraversal(node.getRightNode());
        }
        printNodeData(node);
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = tree.init();
        System.out.println("先序遍历");
        tree.theFrontTraversal(root);
        System.out.println("");

        System.out.println("中序遍历");
        tree.theMiddleTraversal(root);
        System.out.println("");

        System.out.println("后序遍历");
        tree.theLaterTraversal(root);
        System.out.println("");
    }


}
