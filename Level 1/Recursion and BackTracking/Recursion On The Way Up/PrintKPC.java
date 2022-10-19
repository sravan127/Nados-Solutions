import java.util.Scanner;

public class PrintKPC {
    static String[] nums={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
            Scanner s=new Scanner(System.in);
            String str=s.next();
            printKPC(str,"");
    }

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        int number=str.charAt(0)-'0';
        String button=nums[number];

        for(int i=0;i<button.length();i++){
            String toAdd=String.valueOf(button.charAt(i));
            printKPC(str.substring(1),asf+toAdd);
        }
    }
}
