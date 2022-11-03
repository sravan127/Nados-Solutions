import java.io.*;
import java.util.*;

public class IterativeTraversalsInBT {
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

  public static void iterativePrePostInTraversal(Node node) {
    StringBuilder pre=new StringBuilder("");
    StringBuilder in=new StringBuilder("");
    StringBuilder post=new StringBuilder("");

    Stack<Pair> st=new Stack<>();
    st.push(new Pair(node,1));

    while(!st.isEmpty()){
      Pair nd=st.peek();

      if(nd.state==1){
        if(nd.node.left!=null){
           st.push(new Pair(nd.node.left,1));
        }
        nd.state++;
        pre.append(""+nd.node.data+" ");
      }
      else if(nd.state==2){
        if(nd.node.right!=null){
           st.push(new Pair(nd.node.right,1));
        }
        nd.state++;
        in.append(""+nd.node.data+" ");
      }
      else{
        post.append(""+nd.node.data+" ");
        st.pop();
      }
    }

    System.out.println(pre);
    System.out.println(in);
    System.out.println(post);
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

    Node root = construct(arr);
    iterativePrePostInTraversal(root);
  }

}
