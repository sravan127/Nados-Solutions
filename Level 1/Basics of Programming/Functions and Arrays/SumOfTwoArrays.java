import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        int n1[]=new int[n];
        for(int i=0;i<n;i++)
           n1[i]=sc.nextInt();
        
        int m=sc.nextInt();
         int n2[]=new int[m];
        for(int i=0;i<m;i++)
           n2[i]=sc.nextInt();

        int rs=(n>m)?n:m;
        if(n==m)rs=n+1;
        int res[]=new int[rs];

        int fi=n-1,si=m-1,rsi=rs-1;
        int c=0;

        while(fi>=0 && si>=0 ){
            int s=n1[fi]+n2[si]+c;
            c=s/10;
            s=s%10;
            res[rsi]=s;
            fi--;si--;rsi--;
        }

        while(fi>=0){
            int s=n1[fi]+c;
            c=s/10;s=s%10;
            res[rsi]=s;
            fi--;rsi--;
        }

        while(si>=0){
            int s=n2[si]+c;
            c=s/10;s=s%10;
            res[rsi]=s;
            si--;rsi--;
        }

        rsi++;
        for(;rsi<rs;rsi++)
          System.out.println(res[rsi]);
        
     }
}
