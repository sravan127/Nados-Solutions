import java.util.Scanner;

public class SubSetsOfAnArray {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=s.nextInt();
        int size=1<<n;
        for(int i=0;i<size;i++){
              int flag=1<<(n-1);
              //System.out.print(flag);
              for(int j=0;j<n;j++){
                  if((flag&i)!=0){
                      System.out.print(arr[j]+"\t");
                  }
                  else
                    System.out.print("-\t");
                  flag=flag>>1;
              }
              System.out.println();
            }
            
        }
}
