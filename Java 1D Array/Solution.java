/*
An array is a simple data structure used to store a collection of data in a contiguous block of memory.
Each element in the collection is accessed using an index, and the elements are easy to find because they're stored sequentially in memory.
Because the collection of elements in an array is stored as a big block of data, 
we typically use arrays when we know exactly how many pieces of data we're going to have. \
For example, you might use an array to store a list of student ID numbers, or the names of state capitals. 
To create an array of integers named  that can hold four integer values, you would write the following code:
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



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int b:a){
            System.out.println(b);
        }
        
        }
    
}
