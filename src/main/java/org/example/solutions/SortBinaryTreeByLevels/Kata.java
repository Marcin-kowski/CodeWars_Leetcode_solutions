package org.example.solutions.SortBinaryTreeByLevels;

import java.util.*;

class Kata {
  public static List<Integer> treeByLevels(Node node)
  {
    List<Integer> result = new ArrayList<>();
    if(node == null) {
      return new ArrayList<>();
    }

    Queue<Node> nodes = new LinkedList<>();
    nodes.add(node);

    while (!nodes.isEmpty()) {
      Node queuedNode = nodes.remove();

      result.add(queuedNode.value);

      if (queuedNode.left != null) {
        nodes.add(queuedNode.left);
      }

      if (queuedNode.right != null) {
        nodes.add(queuedNode.right);
      }
    }
    return result;
  }
}