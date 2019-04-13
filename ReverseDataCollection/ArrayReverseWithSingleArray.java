//https://ide.geeksforgeeks.org/DpX7OmeqwW
// Author - shreyanshpandey08@gmail.com
public class ArrayReverseWithSingleArray { 
  
    /*function swaps the array's first element with last element,  
      second element with last second element and so on*/
    static void reverse(int a[], int n) 
    { 
        int temp; 
        for (int i = 0; i < n / 2; i++) { 
            temp = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = temp; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(a[k]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {10, 20, 30, 40, 50}; 
        reverse(arr, arr.length); 
    } 
}