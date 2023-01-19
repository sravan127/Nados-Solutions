import java.util.HashSet;

class CheckAP
{
    boolean checkIsAP(int arr[] ,int n)
    {
        if(n==2)return true;
       HashSet<Integer> set=new HashSet<>();
       int min=Integer.MAX_VALUE;
       int sec_min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
           if(arr[i]<min){
               sec_min=min;
               min=arr[i];
           }
           else if (arr[i] < sec_min && arr[i] != min)
                sec_min = arr[i];
           set.add(arr[i]);
       }
       if(sec_min==Integer.MAX_VALUE)return true;
       if(set.size()<n)return false;
       
       int d=sec_min-min;
       int a=min;
       
       for(int i=0;i<n;i++){
           if(!set.contains(a+i*d))
               return false;
       }
       return true;
    }
}
