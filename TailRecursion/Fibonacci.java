//https://ide.geeksforgeeks.org/yM3CzbNxbW
// Author - shreyanshpandey08@gmail.com
import java.util.*; 
import java.io.*; 
class Fibonacci 
{ 
    // A tail recursive function to 
    // calculate n th fibnacci number 
    static int fib(int n, int a, int b ) 
    {  
          
        if (n == 0) 
            return a; 
        if (n == 1) 
            return b; 
        return fib(n - 1, b, a + b); 
    } 
      
    public static void main (String[] args)  
    { 
        int n = 10; 
        System.out.println("fib(" + n +") = "+  
                                 fib(n,0,1) );  
    } 
} 