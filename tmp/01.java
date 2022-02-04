import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 1;
        while(n!=0){
            sum *= n%10;
            n/=10; 
        }

        System.out.println(sum);
    }
}
