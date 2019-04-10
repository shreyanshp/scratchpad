//https://ide.geeksforgeeks.org/dPDQA1myaK
// Author - shreyanshpandey08@gmail.com
class SumArray 
{ 
    static int recSumArray(int[] arr, int size, int collector) 
    {  
        if (size == 0) 
            return collector; 
        return recSumArray(arr, size-1, collector+arr[size-1]); 
    } 
      
    public static void main (String[] args)  
    { 
        int[] arr = {2, 55, 1, 7};
        int n = arr.length-1;
        System.out.println("Sum of Array Elements is "+recSumArray(arr, n, arr[n]));  
    } 
} 