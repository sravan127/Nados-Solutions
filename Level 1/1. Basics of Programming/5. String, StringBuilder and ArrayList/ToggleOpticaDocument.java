import java.util.Scanner;

public class ToggleOpticaDocument {
    public static String toggleCase(String str){
		StringBuffer ans=new StringBuffer("");
		for(int i=0;i<str.length();i++){
		    if(Character.isUpperCase(str.charAt(i))){
		        ans.append(Character.toLowerCase(str.charAt(i)));
		    }
		    else{
		        ans.append(Character.toUpperCase(str.charAt(i)));
		    }
		}

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}
}
