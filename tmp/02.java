import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum=0;
        long k=2;
        for(int i=0;i<n;i++){
            sum+=k;
            k+=2;
        }
        System.out.println(sum);
    }
}
