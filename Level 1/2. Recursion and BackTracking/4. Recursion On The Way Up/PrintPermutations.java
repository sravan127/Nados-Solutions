import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i=0;i<str.length();i++){
            String addedChar=String.valueOf(str.charAt(i));
            String leftPart=str.substring(0,i);
            String rightPart=str.substring(i+1);
            printPermutations(leftPart+rightPart,asf+addedChar);
        }
    }
}
