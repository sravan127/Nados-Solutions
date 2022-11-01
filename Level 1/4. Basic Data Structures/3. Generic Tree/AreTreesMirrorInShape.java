import java.io.*;
import java.util.*;

public class AreTreesMirrorInShape {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static boolean areMirror(Node n1, Node n2) {
    if(n1.children.size()!=n2.children.size()){
      return false;
    }

    for(int i=0;i<n1.children.size();i++){
      Node n1Child=n1.children.get(i);
      Node n2Child=n2.children.get(n2.children.size()-1-i);
      boolean check=areMirror(n1Child,n2Child);
      if(!check){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n1 = Integer.parseInt(br.readLine());
    int[] arr1 = new int[n1];
    String[] values1 = br.readLine().split(" ");
    for (int i = 0; i < n1; i++) {
      arr1[i] = Integer.parseInt(values1[i]);
    }
    Node root1 = construct(arr1);

    int n2 = Integer.parseInt(br.readLine());
    int[] arr2 = new int[n2];
    String[] values2 = br.readLine().split(" ");
    for (int i = 0; i < n2; i++) {
      arr2[i] = Integer.parseInt(values2[i]);
    }
    Node root2 = construct(arr2);

    boolean mirror = areMirror(root1, root2);
    System.out.println(mirror);
  }

}