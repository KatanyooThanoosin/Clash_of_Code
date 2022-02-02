import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine())in.nextLine();
        String T = in.nextLine();
        T=T.toUpperCase();
        String p[] = new String[30];

        for (int i = 0; i < H; i++){
            String ROW = in.nextLine();
            p[i] = "";
            for(int j=0;j<T.length();j++){

                for(int k=0;k<L;k++){
                    String tmp;
                    if(T.charAt(j)<='Z'&&T.charAt(j)>='A')tmp = ""+ROW.charAt(k+(T.charAt(j)-'A')*L);
                    else tmp = ""+ROW.charAt(k+('Z'-'A'+1)*L);
                    p[i]+=tmp;
                }

            }
        }
        for(int i = 0; i < H; i++)System.out.println(p[i]);
    }
}
