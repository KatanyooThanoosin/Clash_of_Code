import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        N--;
        if(N%4!=0){
            N/=4;
            N++;
        }
        else N/=4;
        System.out.println(N);
    }
}
