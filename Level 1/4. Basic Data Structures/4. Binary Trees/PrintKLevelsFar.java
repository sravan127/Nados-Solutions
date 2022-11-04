import java.io.*;
import java.util.*;

public class PrintKLevelsFar {
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
  public static ArrayList<Node> nodeToRootPath(Node node, int data){
    if(node==null)
      return new ArrayList<Node>();
    
    //If we find the target node, the make a new AL and add this nodes data and return it.
    if(node.data==data){
      ArrayList<Node> ans = new ArrayList<Node>();
      ans.add(node);
      return ans;
    }

    //Now we check whether the left child or right child contains our required node.
    ArrayList<Node> lchild=nodeToRootPath(node.left,data);
    ArrayList<Node> rchild=nodeToRootPath(node.right,data);

    if(lchild.size()!=0){
      lchild.add(node);
      return lchild;
    }
    if(rchild.size()!=0){
      rchild.add(node);
      return rchild;
    }

    return lchild;
  }

  public static void printKLevelsDown(Node node, int k,Node root){
    if(node==null || node==root || k<0)
      return;
    
    printKLevelsDown(node.left,k-1,root);
    if(k==0)
      System.out.println(node.data);
    printKLevelsDown(node.right,k-1,root);

  }

  public static void printKNodesFar(Node node, int data, int k) {
    //Node accNode=get(node,data);
    ArrayList<Node> path=nodeToRootPath(node,data);

    for(int i=0; i<path.size();i++){
      printKLevelsDown(path.get(i),k-i,(i==0)?null: path.get(i-1));
    }

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
    int k = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    printKNodesFar(root, data, k);
  }

}