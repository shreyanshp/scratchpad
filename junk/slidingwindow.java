/* package whatever; // don't place package name! */

import java.io.*;
import java.util.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {  
        String thisLine;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        while (((thisLine = br.readLine()) != null)) {
         arr.add(Integer.parseInt(thisLine));
        }
        int[] array = convertIntegers(arr);
        printMax(array, array.length, s);
    }
  
    static void printMax(int arr[], int n, int k)  
    { 
        int j, max; 
  
        for (int i = 0; i <= n - k; i++) { 
              
            max = arr[i]; 
  
            for (j = 1; j < k; j++)  
            { 
                if (arr[i + j] > max) 
                    max = arr[i + j]; 
            } 
            System.out.println(max); 
        } 
    } 
  
    public static int[] convertIntegers(List<Integer> integers)
    {
      int[] ret = new int[integers.size()];
      Iterator<Integer> iterator = integers.iterator();
      for (int i = 0; i < ret.length; i++)
      {
          ret[i] = iterator.next().intValue();
      }
      return ret;
    }
}
