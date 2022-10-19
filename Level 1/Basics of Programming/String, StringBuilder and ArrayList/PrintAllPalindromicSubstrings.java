import java.util.Scanner;

public class PrintAllPalindromicSubstrings {
    public static boolean check(String str){
        int l=0,r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
	public static void solution(String str){
	    int n=str.length();
		int size=n*(n+1)/2;
		int ind=0;
		String[] s=new String[size];
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		        String temp=str.substring(i,j+1);
		        s[ind++]=temp; 
		    }
		}
		for(int i=0;i<size;i++){
		    if(check(s[i])){
		        System.out.println(s[i]);
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
