import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String T = in.nextLine();
        String T2 = in.nextLine();

        for(int i=0;i<T.length();i++){
            if(T.charAt(i)=='1'||T2.charAt(i)=='1'){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
    }
}
