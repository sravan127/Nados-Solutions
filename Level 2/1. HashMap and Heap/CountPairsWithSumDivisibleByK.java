public class CountPairsWithSumDivisibleByK {
    public static long countKdivPairs(int arr[], int n, int k){
        if(k==1)return (n)*(n-1)/2;
        int[] cnt=new int[k];
        for(int i=0;i<n;i++){
            int rem=arr[i]%k;
            if(rem<0)rem+=k;
            cnt[rem]++;
        }
        long ans=cnt[0]*(cnt[0]-1)/2;
        int l=1,r=k-1;
        while(l<r)
            ans+=cnt[l++]*cnt[r--];
        if(l==r)ans+=cnt[l]*(cnt[l]-1)/2;
        
        return ans;
    }
}
