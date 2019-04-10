// Author - shreyanshpandey08@gmail.com
/*
f(n)= (1) + (2*3) + (4*5*6) ... n
Input : 2
Output: 7
Series: (1) + (2*3)
*/
class SumSeries 
{ 
      
    static int seriesSum(int calculated, int current, int N, int collector)  
    { 
        int i, cur = 1; 
      
        // checking termination condition 
        if (current == N + 1)  
            return collector; 
      
        // product of terms till current 
        for (i = calculated; i < calculated + current; i++) 
            cur *= i;  
      
        // recursive call for adding  
        // terms next in the series 
        return seriesSum(i, current + 1, N, cur+collector);  
    } 
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        // input number of  
        // terms in the series 
        int N = 5;  
      
        // invoking the method  
        // to calculate the sum 
        System.out.println(seriesSum(2, 2, N, 1));  
    } 
} 