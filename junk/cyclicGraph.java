/* package whatever; // don't place package name! */

import java.io.*;
import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List; 

class myCode
{
  public static void main (String[] args) throws java.lang.Exception
  {
    String thisLine;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split("\\s+");
    int nodes = Integer.parseInt(input[0]);
    int edges = Integer.parseInt(input[1]);
    Graph graph = new Graph(nodes);
    while (((thisLine = br.readLine()) != null || edges == 1)) {
      edges--;
      String[] readEdge = thisLine.split("\\s+");
      graph.addEdge(Integer.parseInt(readEdge[0]), Integer.parseInt(readEdge[1]));
    }
    System.out.println(graph.isCyclic());
  }
}

class Graph { 
      
    public final int V; 
    public final List<List<Integer>> adj; 
  
    public Graph(int V)  
    { 
        this.V = V; 
        adj = new ArrayList<>(V); 
          
        for (int i = 0; i < V; i++) 
            adj.add(new LinkedList<>()); 
    } 
      
    public boolean isCyclicUtil(int i, boolean[] visited, 
                                      boolean[] recStack)  
    { 
           
        if (recStack[i]) 
            return true; 
  
        if (visited[i]) 
            return false; 
              
        visited[i] = true; 
  
        recStack[i] = true; 
        List<Integer> children = adj.get(i); 
          
        for (Integer c: children) 
            if (isCyclicUtil(c, visited, recStack)) 
                return true; 
                  
        recStack[i] = false; 
  
        return false; 
    } 
  
    public void addEdge(int source, int dest) { 
        adj.get(source).add(dest); 
    } 
   
    public boolean isCyclic()  
    { 
        boolean[] visited = new boolean[V]; 
        boolean[] recStack = new boolean[V]; 
           
        for (int i = 0; i < V; i++) 
            if (isCyclicUtil(i, visited, recStack)) 
                return true; 
  
        return false; 
    } 
}