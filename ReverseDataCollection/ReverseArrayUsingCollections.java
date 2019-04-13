//https://ide.geeksforgeeks.org/0U3es62Cqc
// Author - shreyanshpandey08@gmail.com
import java.util.*; 
  
public class ReverseArrayUsingCollections { 
  
    /*function reverses the elements of the array*/
    static void reverse(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 
  
    public static void main(String[] args) 
    { 
        Integer [] arr = {10, 20, 30, 40, 50}; 
        reverse(arr); 
    } 
} 