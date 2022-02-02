import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 9999;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if(t<0){
                if(k<0){
                    if(t>k)k=t;
                }
                else{
                    if((-1*k)<t)k=t;
                }
            }
            else{
                if(k<0){
                    if((-1*k)>t)k=t;
                    else if((-1*k)==t)k=t;
                }
                else{
                    if(t<k)k=t;
                }
            }
        }
        if(k==9999)k=0;
        System.out.print(k);
    }
}
