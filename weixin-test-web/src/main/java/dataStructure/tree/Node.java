package dataStructure.tree;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tubangwu on 2018-12-05.
 *
 * @author tubangwu
 */
@Data
@Builder
@NoArgsConstructor
public class Node {
   private int data;
   private Node leftNode;
   private Node rightNode;

   public Node(int data,Node leftNode,Node rightNode){
       this.data = data;
       this.leftNode = leftNode;
       this.rightNode = rightNode;
   }

}
