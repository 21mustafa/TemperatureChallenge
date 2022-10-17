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
        int n = in.nextInt(); // the number of temperatures to analyse
        
        int closestToZero = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            int absVal = Math.abs(t);
            if (absVal < Math.abs(closestToZero) || (absVal ==  Math.abs(closestToZero) && t > 0)) {
                closestToZero = t;
            }
        }

        if(closestToZero == Integer.MAX_VALUE) {
            System.out.println(0);}
            else {System.out.println(closestToZero);}
    
    }
}