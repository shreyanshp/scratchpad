//https://ide.geeksforgeeks.org/u88nLKenG7
// Author - shreyanshpandey08@gmail.com
import java.util.*; 
import java.io.*; 
class LogFactorial { 
    public static double fact(int n, double collector) 
    { 
        if (n == 1) 
            return collector;
        return fact(n - 1, collector + Math.log(n)); 
    } 
  
    public static void main(String[] args) 
    { 
  
        int N = 3; 
        System.out.println(fact(N, 0)); 
    } 
} 