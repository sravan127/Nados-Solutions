import java.io.*;
import java.util.*;

public class NodeToRootPath {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static boolean find(Node node, int data){
    if(node==null)
      return false;
    
    boolean isAtLeft=find(node.left,data);
    boolean isAtRight=find(node.right,data);

    return node.data==data|| isAtLeft || isAtRight;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // If the node is null, then it means there is nothing to be seen, so return
    // an empty arraylist
    if(node==null)
      return new ArrayList<Integer>();
    
    //If we find the target node, the make a new AL and add this nodes data and return it.
    if(node.data==data){
      ArrayList<Integer> ans = new ArrayList<Integer>();
      ans.add(data);
      return ans;
    }

    //Now we check whether the left child or right child contains our required node.
    ArrayList<Integer> lchild=nodeToRootPath(node.left,data);
    ArrayList<Integer> rchild=nodeToRootPath(node.right,data);

    /*
     If lchild or rchild are not empty, it means that our required node was present in either
     left or right child.
     So, if required node was present in left child, we add our node to the path and return lchild.
     Similarly we do this check in rchild also.
    */

    if(lchild.size()!=0){
      lchild.add(node.data);
      return lchild;
    }
    if(rchild.size()!=0){
      rchild.add(node.data);
      return rchild;
    }

    // Here we can return empty Array list or lchild or rchild because all of them 
    // have a size of 0. we're returning empty arr because our req node wasnt present
    // in lchild or r child.
    return lchild;
  

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    boolean found = find(root, data);
    System.out.println(found);

    ArrayList<Integer> path = nodeToRootPath(root, data);
    System.out.println(path);
  }

}