import java.util.*;

public class BSTWithCooldown{

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        int oldBSP=-arr[0];
        int oldSSP=0;
        int oldCSP=0;

        for(int i=1;i<arr.length;i++){
            int newBSP,newSSP;
            if(oldCSP-arr[i]>oldBSP)
                newBSP=oldCSP-arr[i];
            else
                newBSP=oldBSP;

            if(arr[i]+oldBSP>oldSSP)
                newSSP=arr[i]+oldBSP;
            else
                newSSP=oldSSP;
            
            oldCSP=oldSSP;
            oldBSP=newBSP;
            oldSSP=newSSP;
        }

        System.out.println(oldSSP);
    }

}
