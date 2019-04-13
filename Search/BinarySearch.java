//https://ide.geeksforgeeks.org/DR8DVFRMX7
// Author - shreyanshpandey08@gmail.com
class BinarySearch { 
    // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    public static int binarySearch(int arr[], int left, int right, int x) 
    { 
        if (right >= left) { 
            int mid = left + (right - left) / 2; 
            System.out.println(mid);
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, left, mid - 1, x); 
            else{
                // Else the element can only be present 
                // in right subarray 
                return binarySearch(arr, mid + 1, right, x); 
            }
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 40; 
        int result = binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 