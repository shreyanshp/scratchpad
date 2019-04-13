/* package whatever; // don't place package name! */

import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int commandNumber = Integer.parseInt(input[0]);
        int capacity = Integer.parseInt(input[1]);
        Queue q = new Queue(capacity);
        
        while (((thisLine = br.readLine()) != null || commandNumber == 1)) {
            commandNumber--;
            if(thisLine.contains("SIZE")){
              q.size();
            }else if(thisLine.contains("TAKE")){
              q.take();
            }else if(thisLine.contains("OFFER")){
              String[] splitter = thisLine.split("\\s+");
              q.offer(splitter[1]);
            }else{
              System.out.println("Command Not Found");
            }
        }
    }
}

class Queue { 
    private static int front, rear, capacity; 
    private static String queue[]; 
  
    Queue(int c) 
    { 
        front = rear = 0; 
        capacity = c; 
        queue = new String[capacity]; 
    } 
  
    static void offer(String data) 
    {  
        if (capacity == rear) { 
            System.out.println("false"); 
            return; 
        } 
  
        else { 
            queue[rear] = data; 
            rear++;
            System.out.println("true");
        } 
        return; 
    } 
  
    static void take() 
    { 
        if (front == rear) { 
            //System.out.println("\nQueue is empty\n"); 
            return; 
        } 
  
        else { 
            System.out.println(queue[front]);
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 

            if (rear < capacity) 
                queue[rear] = ""; 
  
            rear--; 
        } 
        return; 
    } 
  
    static void size() 
    { 
        int i; 
        if (front == rear) { 
            System.out.println("\nQueue is Empty\n"); 
            return; 
        } 
  
        System.out.println(rear);
        return; 
    } 
  
} 
