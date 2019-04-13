/* package whatever; // don't place package name! */

import java.io.*;
import java.util.HashSet; 

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int[] arr = new int [input.length];
        int target = Integer.parseInt(br.readLine());
        for(int i=0; i<input.length; i++) {
         arr[i] = Integer.parseInt(input[i]);
        }  
        printpairs(arr, target);
    }
    
    static void printpairs(int arr[], int sum) 
    {        
        HashSet<Integer> s = new HashSet<Integer>(); 
        for (int i=0; i<arr.length; ++i) 
        { 
            int temp = sum-arr[i]; 
  
            // checking for condition 
            if (temp>=0 && s.contains(temp)) 
            { 
                System.out.println(temp +" "+ arr[i]); 
                break;
            } 
            s.add(arr[i]); 
        } 
    } 
}
