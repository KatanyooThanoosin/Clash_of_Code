import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        String address = in.nextLine();
        int sum = 0;

        for(int i=0;i<time.length();i++){
            sum = sum*2;
            if(time.charAt(i)=='#')sum+=1;
        }
        if(sum<1000)System.out.println("0"+sum/100+":"+sum%100);
        else System.out.println(sum/100+":"+sum%100);

        String[] sp = address.split(" ");
        String pr = "";
        for(String tmp:sp){
            String a = "";
            String b = "";
            for(int i=0;i<3;i++){
                a+=""+tmp.charAt(i);
                b+=""+tmp.charAt(i+3);
            }
            sum=0;
            switch(a){
                case "jan":
                    sum+=0;
                    break;
                case "feb":
                    sum+=1;
                    break;
                case "mar":
                    sum+=2;
                    break;
                case "apr":
                    sum+=3;
                    break;
                case "may":
                    sum+=4;
                    break;
                case "jun":
                    sum+=5;
                    break;
                case "jul":
                    sum+=6;
                    break;
                case "aug":
                    sum+=7;
                    break;
                case "sep":
                    sum+=8;
                    break;
                case "oct":
                    sum+=9;
                    break;
                case "nov":
                    sum+=10;
                    break;
                case "dec":
                    sum+=11;
                    break;
            }
            sum*=12;
            switch(b){
                case "jan":
                    sum+=0;
                    break;
                case "feb":
                    sum+=1;
                    break;
                case "mar":
                    sum+=2;
                    break;
                case "apr":
                    sum+=3;
                    break;
                case "may":
                    sum+=4;
                    break;
                case "jun":
                    sum+=5;
                    break;
                case "jul":
                    sum+=6;
                    break;
                case "aug":
                    sum+=7;
                    break;
                case "sep":
                    sum+=8;
                    break;
                case "oct":
                    sum+=9;
                    break;
                case "nov":
                    sum+=10;
                    break;
                case "dec":
                    sum+=11;
                    break;
            }
            pr+=""+(char)sum;
        }
        System.out.print(pr);
    }
}
