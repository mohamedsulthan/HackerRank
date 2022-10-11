/*
You are given a  2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] numArray = new String[6][];
        int largestSum = 0;
        for(int i=0; i<6; i++){
            numArray[i]=sc.nextLine().split(" ");
        }
        
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                int sum = Integer.parseInt(numArray[i][j])+Integer.parseInt(numArray[i][j+1])+Integer.parseInt(numArray[i][j+2])+Integer.parseInt(numArray[i+1][j+1])+Integer.parseInt(numArray[i+2][j])+Integer.parseInt(numArray[i+2][j+1])+Integer.parseInt(numArray[i+2][j+2]);
                if(i==0 && j==0){
                    largestSum=sum;
                }else{
                    if(sum>largestSum){
                        largestSum=sum;
                    }
                }
            }
        }
        System.out.println(largestSum);
    }
}
