import java.util.Scanner;

public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int low=sc.nextInt();
	    int high=sc.nextInt();
	    boolean[] arr=new boolean[high+1];
	    for(int i=0;i<=high;i++)
	       arr[i]=true;
	    for(int i=2;i*i<=high;i++){
	        if(arr[i]==true){
	          for(int j=i*i;j<=high;j+=i){
	              arr[j]=false;
	          }  
	        }
	    }
	    for(int i=low;i<=high;i++){
	        if(arr[i]==true)
	           System.out.println(i);
	    }
    }
}
