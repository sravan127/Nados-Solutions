import java.util.Scanner;

public class StrWithDifOfEveryTwoConsecChar {
    public static String solution(String str){
	    if(str.length()==1){return str;}
		StringBuilder ans=new StringBuilder("");
		for(int i=0;i<str.length()-1;i++){
		    int diff=str.charAt(i+1)-str.charAt(i);
		    ans.append(str.charAt(i));
		    ans.append(Integer.toString(diff));
		}
		ans.append(str.charAt(str.length()-1));
		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}
}
