import java.util.*;

public class BSTWithTransactionFee {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int fee=s.nextInt();

        int oldBSP=-arr[0];
        int oldSSP=0;

        for(int i=1;i<arr.length;i++){
            int newBSP,newSSP;
            if(oldSSP-arr[i]>oldBSP)
                newBSP=oldSSP-arr[i];
            else
                newBSP=oldBSP;

            if(arr[i]+oldBSP-fee>oldSSP)
                newSSP=arr[i]+oldBSP-fee;
            else
                newSSP=oldSSP;

            oldBSP=newBSP;
            oldSSP=newSSP;
        }

        System.out.println(oldSSP);
    }

}