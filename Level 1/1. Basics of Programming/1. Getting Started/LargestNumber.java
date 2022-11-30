import java.util.*;

public class LargestNumber {

  public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();

    while(t!=0){
      int n=s.nextInt();
      int[] arr=new int[n];

      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      
      int max=0;
      for(int i=1;i<n;i++){
        if(arr[i]>=arr[max])
          max=i;
      }
      int ind=0;
      while(arr[max]==arr[ind])
        ind++;
      
      int temp=arr[max];
      arr[max]=arr[ind];
      arr[ind]=temp;

      for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
      System.out.println();
      
      t--;
    }

    s.close();
  }

}