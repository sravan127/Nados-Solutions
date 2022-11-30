import java.io.*;
import java.util.*;

public class WritePriorityQueueUsingHeap {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      data.add(val);
      upheapify();
    }

    public int remove() {
      if(data.size()==0){
        System.out.println("Underflow");
        return -1;
      }
      swap(0,data.size()-1);
      int ret=data.remove(data.size()-1);
      downheapify();
      return ret;
    }

    public int peek() {
      if(data.size()==0){
        System.out.println("Underflow");
        return -1;
      }
      return this.data.get(0);
    }

    public int size() {
      return this.data.size();
    }

    private void upheapify(){
      int ind=data.size()-1;
      int pind=(ind-1)/2;
      while(data.get(ind)<data.get(pind)){
        swap(ind,pind);
        ind=pind;
        pind=(ind-1)/2;
      }
    }

    private void downheapify(){
      int ind=0;
      while(true){
        int mini=ind;
        int c1i=(2*ind)+1;
        int c2i=(2*ind)+2;
        
        if(c1i<data.size() && data.get(c1i)<data.get(mini)){
          mini=c1i;
        }
        if(c2i<data.size() && data.get(c2i)<data.get(mini)){
          mini=c2i;
        }

        if(mini!=ind){
          swap(mini,ind);
          ind=mini;
        }
        else break;
      }
    }

    private void swap(int i, int j){
      int temp=data.get(i);
      data.set(i,data.get(j));
      data.set(j,temp);
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}
