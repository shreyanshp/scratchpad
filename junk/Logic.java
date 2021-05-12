// Author - shreyanshpandey08@gmail.com
import java.io.*; 
  
class Logic { 
      
    // Return the size of smallest  
    // array with given constraint. 
    static int minimumLength(int x, 
                      int y, int z) 
    { 
        return 1 + Math.abs(x - y) 
                 + Math.abs(y - z); 
    } 
      
  
    public static void main(String[] args) 
    { 
        int x = -32000, y = -2500, z = 27000; 
        System.out.println(  
              minimumLength(x, y, z)); 
    } 
} 